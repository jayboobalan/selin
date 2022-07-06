package com.selinium_first;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	  public static void main(String[] args) throws InterruptedException {
			
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leafground.com/pages/Alert.html");
			
			WebElement single = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
			single.click();
			Thread.sleep(2000);
			driver.switchTo().alert().accept();
			
			WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
			confirm.click();
			Thread.sleep(2000);
			driver.switchTo().alert().dismiss();
			
			WebElement prompt = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		    prompt.click();
			Alert prompt1 = driver.switchTo().alert();
		    Thread.sleep(2000);
		    prompt1.sendKeys("jayparker");
		    prompt1.accept();
		    
		    WebElement line = driver.findElement(By.xpath("//button[@onclick='lineBreaks()']"));
		    line.click();
		    
		    
	        
		 
			
	
	
	
	
	
	
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
