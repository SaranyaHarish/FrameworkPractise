package com.object.Junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookApplication {

	static WebDriver driver;
	
	@Before
	public void launchUrl(){
		
		//System.setProperty("Browser name","the location of browser executable file");
				System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 7");
				driver= new ChromeDriver();//selenium can understnd that we are using chrome driver
				driver.get("https://www.facebook.com/");//to get the url
	}
	
	@Test
	public void testLogin(){
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("saranya_1511@yahoo.co.in");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Saranya");
		
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void afterTest()
	{
		driver.close();
	}
}
