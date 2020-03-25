package HomeWorkMar15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjectModel.newTours;
import pageObjectModel.phpTravels;

public class phpTravelsTestNG {
	
	WebDriver driver;
	phpTravels pt;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		pt = new phpTravels(driver);
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		
		driver.get("https://www.phptravels.net/register");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		
		Thread.sleep(500);
	}
	
	@Test (priority =1)
	public void validateFirstName() {
		
		pt.getFirstName().sendKeys("Muhammad");
	}
	
	@Test (priority =2)
	public void validateLastName() {
		
		pt.getLastName().sendKeys("Shamsuzzaman");
	}
	
	@Test (priority =3)
	public void validatePhone() {
		
		pt.getPhone().sendKeys("7034857126");
	}
	
	@Test (priority =4)
	public void validateEmail() {
		
		pt.getEmail().sendKeys("rokydeg8@yahoo.com");
	}
	
	@Test (priority =5)
	public void validatePassword() {
		
		pt.getPassword().sendKeys("Abcd1234");
	}
	
	@Test (priority =6)
	public void validateConfirmPassword() {
		
		pt.getConfirmPassword().sendKeys("Abcd1234");
	}
	
	@Test (priority =7)
	public void validateSignUp() {
		
		WebElement signup = pt.verifySignUP();
		
		String actualText = signup.getText();
		
		String expectedTest = "SIGN UP";
		
		Assert.assertEquals(expectedTest, actualText);
	}
	
	@Test(priority =8)
	public void validateTitle(){
		
		String actualTitle = driver.getTitle();
		String expectedlTitle = "Register";
		Assert.assertEquals(expectedlTitle, actualTitle);
		
	}
	
	@Test(priority =9)
	public void validateUrl() {
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.phptravels.net/register";
	     
	     Assert.assertEquals(actualUrl,expectedUrl);
		
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	
	

}
