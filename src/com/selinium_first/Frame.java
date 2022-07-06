package com.selinium_first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	  public static void main(String[] args) throws InterruptedException {
			
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://demo.automationtesting.in/Frames.html");
		
			
	driver.switchTo().frame("singleframe");
	         
    WebElement single =driver.findElement(By.xpath("//input[@type='text']"));
          single.sendKeys("frames");
			
		driver.switchTo().defaultContent();
			
			WebElement multiple = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
			multiple.click();
			// ead.sleep(2000);
	
		    WebElement outer = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		    driver.switchTo().frame(outer);
		    
		    WebElement inner = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		    driver.switchTo().frame(inner);
		    
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("multipleframes");
		    
		    driver.switchTo().parentFrame();
		    
		    driver.switchTo().defaultContent();
		    
			
			
		
			
			
			

	  }
}
