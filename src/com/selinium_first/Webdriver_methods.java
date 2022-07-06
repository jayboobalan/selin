package com.selinium_first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
		
		driver.get("https://search.yahoo.com/search?fr=mcafee&type=E211US1289G0&p=selenium+testing");
			
		driver.navigate().to("https://www.hotstar.com/in");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
	    driver.navigate().forward();
	    
		driver.navigate().refresh();

		System.out.println(driver.getCurrentUrl());
		
	   
		driver.close();
	
	  
	   }
	
}
	
	
	
	
	
	
	


