package com.selinium_first;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascrip {

	public static void main(String[] args) {
	   
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hotstar.com/in");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement hotstar = driver.findElement(By.partialLinkText("Hotstar"));
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript ("window,scrollBy(0,-500)","");
		hotstar.click();
	
	 
		
	}
	
	
	
	
	
	
	
	
	
}
