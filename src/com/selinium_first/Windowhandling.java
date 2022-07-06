package com.selinium_first;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowhandling {
	public static void main(String[] args) throws AWTException, InterruptedException {
	   
	System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
    driver.get("https://www.amazon.in/");
    
    Actions ac = new Actions(driver);
    Robot rb =new Robot();
    
   WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
   ac.contextClick(mobiles).build().perform();
   
   rb.keyPress(KeyEvent.VK_DOWN);
   rb.keyRelease(KeyEvent.VK_DOWN);
   rb.keyPress(KeyEvent.VK_ENTER);
   rb.keyRelease(KeyEvent.VK_ENTER);
	
   WebElement customer = driver.findElement(By.linkText("Customer Service"));
   ac.contextClick(customer).build().perform();
   
   rb.keyPress(KeyEvent.VK_DOWN);
   rb.keyRelease(KeyEvent.VK_DOWN);
   rb.keyPress(KeyEvent.VK_ENTER);
   rb.keyRelease(KeyEvent.VK_ENTER);
	
   
   WebElement fashion = driver.findElement(By.linkText("Fashion"));
   ac.contextClick(fashion).build().perform();
   
   rb.keyPress(KeyEvent.VK_DOWN);
   rb.keyRelease(KeyEvent.VK_DOWN);
   rb.keyPress(KeyEvent.VK_ENTER);
   rb.keyRelease(KeyEvent.VK_ENTER);
	
    Set<String> WindowsHandles = driver.getWindowHandles();
	System.out.println(WindowsHandles);
	
	String myString ="Amazon Fashion: Clothing, Footwear and Accessories online for Men, Women and Kids";
	for (String str2 : WindowsHandles) {
		if (driver.switchTo().window(str2).getTitle().equals(myString)) {
			break;	
		}}	
	for (String str : WindowsHandles) {
		String title= driver.switchTo().window(str).getTitle();
		System.out.println(title);
		}
   String myString2 ="Online Shopping site in India:Shop Online for Mobiles:books:watches:shoes";
	
    String[] str3 = myString2.split(":");{
    for (String s : str3) {
    	System.out.println(s);
	  }
    }
    
    
    
    }
	
	
	}
	



	
	
		
	
	
	
	
	
	
	
	
	
	

	
	
	



