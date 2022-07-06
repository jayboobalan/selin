package com.selinium_first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email .sendKeys("jay@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input [@type='password']"));
		password.sendKeys("78765");
		
     	WebElement login = driver.findElement(By.xpath("//button [@value='1']"));
	    login.click();
	
	
	
	
	
	
	
	}
	
	
	
	
	
	

}
