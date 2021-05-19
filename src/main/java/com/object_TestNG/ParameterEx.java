package com.object_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx {

	WebDriver driver;
	
	@BeforeTest
	public void LaunchUrl(){
		
		//System.setProperty("Browser name","the location of browser executable file");
		System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 7");
		driver= new ChromeDriver();//selenium can understnd that we are using chrome driver
		driver.get("https://opensource-demo.orangehrmlive.com/");//to get the url
	
	}
	
	@Parameters({"uname","pname"})
	@Test
	public void login(String Admin,String admin123){
		
		WebElement user = driver.findElement(By.id("txtUsername"));
		user.sendKeys("Admin");
		
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
	}
}
