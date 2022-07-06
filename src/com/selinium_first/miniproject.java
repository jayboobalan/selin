package com.selinium_first;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class miniproject {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement userid = driver.findElement(By.id("username"));
		userid.sendKeys("jayparker");
		
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("6984HO");
		
		driver.findElement(By.id("login")).click();
		
    	WebElement city =	driver.findElement(By.id("location"));
		Select s= new Select(city);
		s.selectByIndex(2);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select h =new Select(hotel);
		h.selectByIndex(3);
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select r =new Select(roomtype);
		r.selectByIndex(4);
		
	   WebElement roomnos= driver.findElement(By.id("room_nos"));
	   Select n =new Select(roomnos);
	   n.selectByIndex(2);
	   
	   WebElement checkin = driver.findElement(By.xpath("(//input)[2]"));
	   checkin.clear();
	   checkin.sendKeys("03/09/2022");
	   
	   WebElement checkout= driver.findElement(By.xpath("(//input)[3]"));
	   checkout.clear();
	   checkout.sendKeys("06/09/2022");
	   
	   WebElement adults = driver.findElement(By.id("adult_room"));
	   Select a =new Select(adults);
	   a.selectByIndex(2);
	   
	   WebElement child = driver.findElement(By.id("child_room"));
	   Select c = new Select(child);
	   c.selectByIndex(2);
	   
	   driver.findElement(By.id("Submit")).click();
	   
	   Thread.sleep(2500);
	   
	   driver.findElement(By.id("radiobutton_0")).click();
	   
	   driver.findElement(By.id("continue")).click();
	   
		driver.findElement(By.id("first_name")).sendKeys("jay");
		driver.findElement(By.id("last_name")).sendKeys("parker");
		driver.findElement(By.id("address")).sendKeys("4/3,annanagar,chennai-12");
		driver.findElement(By.id("cc_num")).sendKeys("6576789912312345");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select t = new Select(cardtype);
		t.selectByIndex(3);
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select m = new Select(month);
		m.selectByIndex(4);
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select y = new Select(year);
		y.selectByIndex(11);
		driver.findElement(By.id("cc_cvv")).sendKeys("134");
		driver.findElement(By.id("book_now")).click();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
