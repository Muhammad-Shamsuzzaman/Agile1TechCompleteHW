package HomeWorkMar22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModel.yahooAccount;

public class yahooAccount_hwC {

	
	WebDriver driver;
	
	yahooAccount ya;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		ya = new yahooAccount(driver);
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		
		Thread.sleep(500);
	}
	
	@Test(priority =1)
	public void validateFirstName() {
		
		WebElement firstName = ya.getFirstName();
		firstName.sendKeys("Thomas");
		Reporter.log("Entering Thomas in the First Name Text Box", true);
		boolean display1 = firstName.isDisplayed();
		Reporter.log("Verifying First Name is displayed", true);
		Assert.assertTrue(display1);
	}
	
	@Test(priority =2)
	public void validateLastName() {
		WebElement lastName = ya.getLastName();
		lastName.sendKeys("Mill");
		Reporter.log("Entering Mill in the Last Name Text Box", true);
		boolean display2 = lastName.isDisplayed();
		Reporter.log("Verifying Last Name is displayed", true);
		
		Assert.assertTrue(display2);
	}
	
	@Test(priority =3)
	public void validateId() {
		WebElement emailAddress = ya.getUserId();
		emailAddress.sendKeys("thomasmill193");
		Reporter.log("Entering thomasmill193 in the Email Address Text Box", true);
		boolean display3 = emailAddress.isDisplayed();
		Reporter.log("Verifying Email Address is displayed", true);
		
		Assert.assertTrue(display3);
		
	}
	
	@Test(priority =4)
	public void validatePassword() {
		WebElement password = ya.getPassword();
		password.sendKeys("ABcd@12345678");
		Reporter.log("Entering ABcd@12345678 in the Password Text Box", true);
		boolean display4 = password.isDisplayed();
		Reporter.log("Verifying Password is displayed", true);
		
		Assert.assertTrue(display4);
		
		
	}
	
	@Test(priority =5)
	public void validatePhone() {
		WebElement phone = ya.getPhone();
		phone.sendKeys("7031234567");
		Reporter.log("Entering 7031234567 in the Phone Text Box", true);
		boolean display5 = phone.isDisplayed();
		Reporter.log("Verifying the Phone is displayed", true);
		
		
		Assert.assertTrue(display5);
		
	}
	
	@Test(priority =6)
	public void validateMonth(){
		
		WebElement month = ya.getMonth();
		Select monthmm = new Select(month);
		monthmm.selectByVisibleText("February");
		Reporter.log("Entering February in the Month Text Box", true);
		boolean display6 = month.isDisplayed();
		Reporter.log("Verifying the Month is displayed", true);
		
		Assert.assertTrue(display6);
		
	}
	
	@Test(priority =7)
	public void validateDate() {
		WebElement day = ya.getDate();
		day.sendKeys("01");
		Reporter.log("Entering 01 in the Day Text Box", true);
		boolean display7 = day.isDisplayed();
		Reporter.log("Verifying the Day is displayed", true);
		
		Assert.assertTrue(display7);
	}
	
	@Test(priority =8)
	public void validateYear() {
		WebElement year = ya.getYear();
		year.sendKeys("1995");
		Reporter.log("Entering 1995 in the Year Text Box", true);
		boolean display8 = year.isDisplayed();
		Reporter.log("Verifying the Year is displayed", true);
		Assert.assertTrue(display8);
	}
	
	@Test(priority =9)
	public void validateGender() {
		WebElement gender = ya.getGender();
		gender.sendKeys("Male");
		Reporter.log("Entering Male in the Gender Text Box", true);
		boolean display9 = gender.isDisplayed();
		Reporter.log("Verifying the Gender is displayed", true);
		
		Assert.assertTrue(display9);
		
	}
	
	@Test (priority =10)
	public void validateTerms() {
		
		WebElement terms = ya.validateTerms();
		boolean display10 = terms.isDisplayed();
		Reporter.log("Verifying the Terms are displayed", true);
		
		Assert.assertTrue(display10);
	}
	
	@Test (priority =11)
	public void validatePrivacyPolicy() {
		
		WebElement privacyPolicy = ya.validatePrivacyPolicy();
		boolean display11 = privacyPolicy.isDisplayed();
		Reporter.log("Verifying the Privacy Policy is displayed", true);
		
		Assert.assertTrue(display11);
	}
	
	@Test (priority =12)
	public void validateContinueButton() {
		
		WebElement continueButton = ya.validateContinueButton();
		boolean display12 = continueButton.isDisplayed();
		Reporter.log("Verifying the Continue Button is displayed", true);
		
		Assert.assertTrue(display12);
	}
	
	@Test (priority =13)
	public void validateSignIn() {
		
		WebElement signIn = ya.validateSignIn();
		boolean display13 = signIn.isDisplayed();
		Reporter.log("Verifying the Sign In is displayed", true);
		
		Assert.assertTrue(display13);
	}
	@AfterTest
	public void afterTest() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.quit();
	}



}
