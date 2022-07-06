package com.selinium_first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single {
	
	
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		Thread.sleep(2000);
		
		driver.findElement( By.xpath("//input[@placeholder='First name']")).sendKeys("jarry");
		
		driver.findElement(By.name("reg_email__")).sendKeys("jay@gmail.com");
		
		WebElement day = driver.findElement( By.id("day"));
		Select d1 = new Select(day);
		d1.selectByValue("6");
		
		WebElement month =driver.findElement(By.id("month"));
		Select d2 = new Select(month);
		d2.selectByIndex(3);
		
		WebElement year = driver.findElement(By.id("year"));
		Select d3 = new Select(year);
		d3.selectByVisibleText("1999");
		
		
	
	
	
	
	
	
	

}}