package com.object_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ParallelExecution {

	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest(){
		
		//System.setProperty("Browser name","the location of browser executable file");
		System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 7");
		driver= new ChromeDriver();//selenium can understnd that we are using chrome driver
		driver.get("https://www.google.com");//to get the url
	}
	
	@Test
	public void testMethod(){
		//System.setProperty("Browser name","the location of browser executable file");
				System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 7");
				driver= new ChromeDriver();//selenium can understnd that we are using chrome driver
				driver.get("https://www.facebook.com");//to get the url
	}
	
	
	@AfterTest
	public void afterTest(){
		//System.setProperty("Browser name","the location of browser executable file");
		System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 7");
		driver= new ChromeDriver();//selenium can understnd that we are using chrome driver
		driver.get("https://www.yahoo.com");//to get the url
	}
}
