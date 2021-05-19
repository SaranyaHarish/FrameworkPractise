package com.object_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountExample {

	
	//same testcases running myltiple times 
	//1)before
	//2)test
	//3)after
	
	WebDriver driver;
	
	@BeforeMethod
	public void before(){
		System.out.println("Before test running");
	}
	
	@AfterMethod
	public void after(){
		System.out.println("After test running");
	}
	
	@Test(invocationCount =2)
	public void execute(){
		//System.setProperty("Browser name","the location of browser executable file");
		System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 7");
		driver= new ChromeDriver();//selenium can understnd that we are using chrome driver
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("saranya.harish04@gmail.com");
		
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[2]")).click();
		
	}
}
