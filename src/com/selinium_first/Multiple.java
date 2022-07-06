package com.selinium_first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple {

	    public static void main(String[] args) throws InterruptedException {
			
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://demowebshop.tricentis.com/");
			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	    	
	    	driver.findElement(By.name("Gender")).click();
	    	
            driver.findElement(By.id("FirstName")).sendKeys("jay");
           
            driver.findElement(By.id("LastName")).sendKeys("parker");
            
            driver.findElement(By.id("Email")).sendKeys("jayparker143@gmail.com");
            
           driver.findElement(By.name("Password")).sendKeys("tyujk");
           
           driver.findElement(By.name("ConfirmPassword")).sendKeys("tyujk");
           
           driver.findElement(By.id("register-button")).click();
           
           Thread.sleep(2000);
        		   
           driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
           
           driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("jayparker143@gmail.com");
           
           driver.findElement(By.id("Password")).sendKeys("pass143");
           
           driver.findElement(By.xpath("//input[@value='Log in']")).click();

         //  /html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input
           
           
	    
	    
	    
	    
	    
	    }}