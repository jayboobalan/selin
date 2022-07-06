package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Runnerjava extends BaseClassjava {
	public static void main(String[] args ){
		
	
		
		launchbrowser("chrome");
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
		
//		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
		
//		driver.get("https://adactinhotelapp.com/");
		
		urllaunch("https://adactinhotelapp.com/");
		
    	WebElement userid = driver.findElement(By.id("username"));
//		userid.sendKeys("jayparker");
	    
    	passinput(userid, "jayparker");
		
		
	WebElement password =driver.findElement(By.id("password"));	
//		password sendkeys("6984HO");
	      
     	 passinput(password, "6984HO");    
	    
		WebElement login =driver.findElement(By.id("login"));
//		driver.findElement(By.id("login")).click();
     	 
     	clickonelement(login);
	    
		
//    	WebElement city =	driver.findElement(By.id("location"));
//		Select s= new Select(city);
//		s.selectByIndex(2);
		
//		WebElement hotel = driver.findElement(By.id("hotels"));
//		Select h =new Select(hotel);
//		h.selectByIndex(3);
		
//		WebElement roomtype = driver.findElement(By.id("room_type"));
//		Select r =new Select(roomtype);
//		r.selectByIndex(4);
		
//	   WebElement roomnos= driver.findElement(By.id("room_nos"));
//	   Select n =new Select(roomnos);
//	   n.selectByIndex(2);
	   
//	   WebElement checkin = driver.findElement(By.xpath("(//input)[2]"));
//	   checkin.clear();
//     checkin.sendKeys("03/09/2022");
	   
//	   WebElement checkout= driver.findElement(By.xpath("(//input)[3]"));
//	   checkout.clear();
//	   checkout.sendKeys("06/09/2022");
	   
//	   WebElement adults = driver.findElement(By.id("adult_room"));
//	   Select a =new Select(adults);
//	   a.selectByIndex(2);
	   
//	   WebElement child = driver.findElement(By.id("child_room"));
//	   Select c = new Select(child);
//	   c.selectByIndex(2);
	   
//	   driver.findElement(By.id("Submit")).click();
	   
//	   Thread.sleep(2500);
	   
//	   driver.findElement(By.id("radiobutton_0")).click();
	   
//	   driver.findElement(By.id("continue")).click();
	   
		
		
	}
	}


