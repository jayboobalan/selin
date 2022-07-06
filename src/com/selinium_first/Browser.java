package com.selinium_first;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {
	
	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
		
	driver.get("https://en.wikipedia.org/wiki/Java_(programming_language");
	
    TakesScreenshot ts = (TakesScreenshot) driver;
    
    File src = ts.getScreenshotAs(OutputType.FILE);
    
    File des = new File("C:\\Users\\gajal\\eclipse-workspace\\selinium\\screenshot\\screendemo.png");
    
    FileUtils.copyFile( src, des);
   
		
		
		
		
		
		
		
		}

}
