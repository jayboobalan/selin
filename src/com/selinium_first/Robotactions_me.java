package com.selinium_first;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotactions_me {

	public static void main(String[] args) throws AWTException, InterruptedException {
		   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(2000);
		
		WebElement mobiles = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]"));
		
		Actions ac = new  Actions(driver);
		Robot rb=new Robot();
	
		ac.contextClick(mobiles).build().perform();
	    
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
	//move to element	
		 WebElement appliances = driver.findElement(By.xpath("(//span)[5]"));                                                                                 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        ac.moveToElement(appliances);
		Thread.sleep(2000);
       	driver.navigate().to("https://testautomationpractice.blogspot.com/");
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		ac.dragAndDrop(drag,drop).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
	
	
	
	
	
	
}
