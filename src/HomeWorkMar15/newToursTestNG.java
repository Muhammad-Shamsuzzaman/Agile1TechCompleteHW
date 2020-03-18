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

public class newToursTestNG {
	
	WebDriver driver;
	
	newTours nt;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		nt = new newTours(driver);
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		
		Thread.sleep(500);
	}
		
	
	@Test(priority = 1)
	public void validateFirstName(){
		
		nt.getFirstName().sendKeys("Muhammad");
	}
	
	@Test(priority = 2)
	public void validateLastName() {
		
		nt.getLastName().sendKeys("Shamsuzzaman");
	}

	@Test(priority = 3)
	public void validatePhone() {
		
		nt.getPhone().sendKeys("7034857126");
	}
	
	@Test(priority = 4)
	public void validateEmail(){
		nt.getEmail().sendKeys("rokydeg8@yahoo.com");
	}
	
	@Test(priority = 5)
	public void validateAddress() {
		
		nt.getAddress().sendKeys("10400 Eaton Pl, Suite 105");
	}
	
	@Test(priority =6)
	public void validateCity() {
		
		nt.getCity().sendKeys("Fairfax");
	}
	
	@Test(priority =7)
	public void validateState() {
		
		nt.getState().sendKeys("Virginia");
	}
	
	@Test(priority = 8)
	public void validatePostalCode() {
		
		nt.getPostalCode().sendKeys("22030");
	}
	
	@Test(priority = 9)
	public void validateUserName() {
		
		nt.getUserName().sendKeys("mcc1919");
	}
	
	@Test(priority = 10)
	public void validatePassword() {
		
		nt.getPassword().sendKeys("Abcd1234");
	}
	
	@Test(priority = 11)
	public void validateConfirmPassword() {
		
		nt.getConfirmPassword().sendKeys("Abcd1234");
	}
	
	@Test(priority = 12)
	public void validateSubmit() {
		
		WebElement submit = nt.verifySubmit();
		boolean enable = submit.isEnabled();
		boolean display = submit.isDisplayed();
		
		Assert.assertTrue(enable);
		Assert.assertTrue(display);
		
		System.out.println("Submit button is enabled = "+enable);
		System.out.println("Submit button is displayed = "+display);
		
		
	}
	
	@Test(priority = 13)
	public void validateTitle() {
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Register: Mercury Tours");
		System.out.println("The title of the page is: " + title);
	}
	
	@Test(priority =14)
	public void validateUrl() {
		
		String url = driver.getCurrentUrl();
	     
	     Assert.assertEquals(url, "http://newtours.demoaut.com/mercuryregister.php");
	     
	     System.out.println("The URL of the page is: " + url);
		
		
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException{
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
}
