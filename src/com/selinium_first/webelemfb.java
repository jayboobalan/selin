package com.selinium_first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelemfb {
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement facebooklogin = driver.findElement(By.id("email"));
		facebooklogin.sendKeys("jay@gmail.com");
		
		System.out.println(facebooklogin.isDisplayed());
		
		System.out.println(facebooklogin.isEnabled());
		
		driver.findElement(By.id("pass")).sendKeys("jay@23");
		
		driver.findElement(By.name("login")).click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}