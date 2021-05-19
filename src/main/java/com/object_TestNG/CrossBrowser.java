package com.object_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	WebDriver driver ;
	
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		//check if parameter passed from testNG is"Chrome"
		if(browser.equalsIgnoreCase("chrome")){
			//System.setProperty("Browser name","the location of browser executable file");
			System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 7");
			driver= new ChromeDriver();//selenium can understnd that we are using chrome driver
		}
		
		else if(browser.equalsIgnoreCase("safari")){
			System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");
			driver = new SafariDriver();

		}
		
		else {
			throw new Exception("Broswer is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void testParameters()
	{
		driver.get("https://adactinhotelapp.com/");
		
		//find username
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("rakhesh07");
		
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("yakesh07");
		
		driver.findElement(By.id("login")).click();		
		
		driver.quit();
	}
}
