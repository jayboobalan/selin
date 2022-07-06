package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassjava {
	
	public static WebDriver driver;
	
	public static WebDriver launchbrowser(String browsername) {
		
	if (browsername.equalsIgnoreCase("chrome"));
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	 if (browsername.equalsIgnoreCase("firefox"));
	{
	   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"C:\\Users\\gajal\\eclipse-workspace\\selinium\\Driver\\chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   
	}
		return driver;
		
	}
	 public static void urllaunch(String url) {                                       //geturl
		driver.get("url");
	 }
	
	 public static void browserclose() {                                              //CLOSE
		 driver.close();
	}
	 public static void quit() {                                                      //QUIT
		driver.quit();
	}
		
	 public static void passinput(WebElement element ,String input){                 //sendkeys
		 element.sendKeys("input");
		 
	}
	public static  void clickonelement(WebElement element) {                          // click
		element.click();

	}
		
		
		
		
		
		
	
	
	
	

}
