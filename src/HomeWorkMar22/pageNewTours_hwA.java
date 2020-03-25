package HomeWorkMar22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModel.newTours;

public class pageNewTours_hwA {

	
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
		
		nt.getFirstName().sendKeys("Tommy");
		Reporter.log("Entering Tommy in the First Name Text Box ", true);
	}
	
	@Test(priority = 2)
	public void validateLastName() {
		
		nt.getLastName().sendKeys("Lee");
		Reporter.log("Entering Lee in the Last Name Text Box ", true);
	}

	@Test(priority = 3)
	public void validatePhone() {
		
		nt.getPhone().sendKeys("7031234567");
		Reporter.log("Entering 7031234567 in the Phone Text Box ", true);
	}
	
	@Test(priority = 4)
	public void validateEmail(){
		nt.getEmail().sendKeys("tommylee@yahoo.com");
		Reporter.log("Entering tommylee@yahoo.com in the Email Text Box ", true);
	}
	
	@Test(priority = 5)
	public void validateAddress() {
		
		nt.getAddress().sendKeys("10400 Eaton Pl, Suite 105");
		Reporter.log("Entering 10400 Eaton Pl, Suite 105 in the Address Text Box ", true);
	}
	
	@Test(priority =6)
	public void validateCity() {
		
		nt.getCity().sendKeys("Fairfax");
		Reporter.log("Entering Fairfax in the City Text Box ", true);
	}
	
	@Test(priority =7)
	public void validateState() {
		
		nt.getState().sendKeys("Virginia");
		Reporter.log("Entering Virginia in the State Text Box ", true);
	}
	
	@Test(priority = 8)
	public void validatePostalCode() {
		
		nt.getPostalCode().sendKeys("22030");
		Reporter.log("Entering 22030 in the Postal Code Text Box ", true);
	}
	
	@Test(priority = 9)
	public void validateUserName() {
		
		nt.getUserName().sendKeys("mcc1919");
		Reporter.log("Entering mcc1919 in the User Name Text Box ", true);
	}
	
	@Test(priority = 10)
	public void validatePassword() {
		
		nt.getPassword().sendKeys("Abcd1234");
		Reporter.log("Entering Abcd1234 in the Password Text Box ", true);
	}
	
	@Test(priority = 11)
	public void validateConfirmPassword() {
		
		nt.getConfirmPassword().sendKeys("Abcd1234");
		Reporter.log("Entering Abcd1234 in the Confirm Password Text Box ", true);
	}
	
	@Test(priority = 12)
	public void validateSubmit() {
		
		WebElement submit = nt.verifySubmit();
		boolean enable = submit.isEnabled();
		Reporter.log("Verifying the submit button is enabled", true);
		boolean display = submit.isDisplayed();
		Reporter.log("Verifying the submit button is displayed", true);
		
		Assert.assertTrue(enable);
		Assert.assertTrue(display);
		
		
	}
	
	@Test(priority = 13)
	public void validateTitle() {
		
		String actualTitle = driver.getTitle();
		Reporter.log("Reading the title of the page", true);
		String expectedTitle = "Register: Mercury Tours";
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	@Test(priority =14)
	public void validateUrl() {
		
		String actualUrl = driver.getCurrentUrl();
		Reporter.log("Reading the Url of the page", true);
	    String expectedUrl = "http://newtours.demoaut.com/mercuryregister.php";
	    Assert.assertEquals(actualUrl, expectedUrl);
		
		
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException{
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
