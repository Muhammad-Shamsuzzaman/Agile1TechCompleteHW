package HomeWorkMar22;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjectModel.newTours;

public class pageNewTours_hwG {


	
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
		
	@Parameters({"firstName"})
	@Test(priority = 1)
	public void validateFirstName(String firstName){
		
		WebElement firstname = nt.getFirstName();
		firstname.sendKeys(firstName);
		
		
	}
	
	@Parameters({"lastName"})
	@Test(priority = 2)
	public void validateLastName(String lastName){
		
		WebElement lastname = nt.getLastName();
		lastname.sendKeys(lastName);
		
	}
	@Parameters({"phone"})
	@Test(priority = 3)
	public void validatePhone(String phone) {
		
		WebElement Phone = nt.getPhone();
		Phone.sendKeys(phone);
	}
	
	@Parameters({"email"})
	@Test(priority = 4)
	public void validateEmail(String email){
		WebElement Email = nt.getEmail();
		Email.sendKeys(email);
	}
	
	@Parameters({"address"})
	@Test(priority = 5)
	public void validateAddress(String address) {
		
		WebElement Address = nt.getAddress();
		Address.sendKeys(address);
	}
	
	@Parameters({"city"})
	@Test(priority =6)
	public void validateCity(String city) {
		WebElement City = nt.getCity();
		City.sendKeys(city);
	}
	
	@Parameters({"state"})
	@Test(priority =7)
	public void validateState(String state) {
		WebElement State = nt.getState();
		State.sendKeys(state);
	}
	
	@Parameters({"zipCode"})
	@Test(priority = 8)
	public void validatePostalCode(String zipCode) {
		
		WebElement postalCode = nt.getPostalCode();
		postalCode.sendKeys(zipCode);
	}
	
	@Parameters({"userName"})
	@Test(priority = 9)
	public void validateUserName(String userName) {
		WebElement email = nt.getUserName();
		email.sendKeys(userName);
	}
	
	@Parameters({"password"})
	@Test(priority = 10)
	public void validatePassword(String password) {
		WebElement Password = nt.getPassword();
		Password.sendKeys(password);
	}
	
	@Parameters({"confirmPassword"})
	@Test(priority = 11)
	public void validateConfirmPassword(String confirmPassword) {
		WebElement confirmpassword = nt.getConfirmPassword();
		confirmpassword.sendKeys(confirmPassword);
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
	@Parameters({"expectedtitle"})
	@Test(priority = 13)
	public void validateTitle(String expectedtitle) {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = expectedtitle;
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	@Parameters({"expectedurl"})
	@Test(priority =14)
	public void validateUrl(String expectedurl) {
		
		String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = expectedurl;
	    Assert.assertEquals(actualUrl, expectedUrl);
		
		
	}
		
		
	
	
	
		
	
	@AfterTest
	public void afterTest() throws InterruptedException{
		
		Thread.sleep(2000);
		driver.quit();
		
	}




}
