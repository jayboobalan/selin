package com.selinium_first;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Hs {



	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://www.amazon.in/");
	    System.out.println(driver.getTitle());
	   
	   
	    String myString = "India";
	    
	    
	    
	    
	    
	}
	

	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}
