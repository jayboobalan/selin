package com.selinium_first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

        driver.get("https://www.instagram.com/accounts/login/");
        Thread.sleep(2000);
       
       	WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
        email.sendKeys("jay");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("terfgh");
        
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div/div[3]/button/div"));
        login.click();                                  
       
	








}}
