package com.selinium_first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class Webelementmm{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	                                       //URL launch
	      driver.get("https://www.instagram.com/");
	                    //identify username
	                //   WebElement l =
	      driver. findElement(By.name("username")).sendKeys("test@gmail.com");
	                  //identify password
	                 //  WebElement p =
	      driver.findElement(By.name("password")).sendKeys("test123");
	                  //  WebElement b = 
	      driver.findElement(By.className("Igw0E")).click();
	                //obtain value entered for username
	               //  String s = l.getAttribute("value");
	               //    System.out.println("Value entered for username: " + s);
	      //quit browser
	  //    driver.quit();
	   }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.manage().window().maximize();
		
		//driver.get("https://www.instagram.com/accounts/login/");
		
	//	driver.findElement(By.name("username")).sendKeys("987655900");
	//	driver.findElement(By.name("password")).sendKeys("jerry@23");
		//driver.findElement(By.className("sqdOP  L3NKy   y3zKF     ")).click();
	//	
		
		
		
	
		
		
				
				
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}