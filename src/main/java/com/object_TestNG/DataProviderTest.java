package com.object_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	WebDriver driver;
	
	@BeforeMethod
	public void Launching(){
		
		//System.setProperty("Browser name","the location of browser executable file");
				System.setProperty("webdriver.chrome.driver", "/Users/Saranya/Downloads/chromedriver 7");
				driver= new ChromeDriver();//selenium can understnd that we are using chrome driver
				driver.get("https://adactinhotelapp.com/");//to get the url
					}
	
	@DataProvider(name="Regreesion")
	public Object[][] data(){
		Object TestData[][] ={{"rakhesh07","yakesh07"},{"Sarany4Harish","kanishka2!"}};
		return TestData;
		
	}
	
	@Test(dataProvider="Regreesion")
	public void login(String uname,String pname){
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys(uname);
		
		WebElement pass= driver.findElement(By.id("password"));
		pass.sendKeys(pname);
		
		driver.findElement(By.id("login")).click();
	}
}
