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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjectModel.phpTravels;

public class phpTravels_hwG {


	
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
	@Parameters({"firstName"})
	@Test (priority =1)
	public void validateFirstName(String firstName) {
	
	WebElement firstname = pt.getFirstName();
	firstname.sendKeys(firstName);
}

	@Parameters({"lastName"})
	@Test (priority =2)
	public void validateLastName(String lastName) {
	
	WebElement lastname = pt.getLastName();
	lastname.sendKeys(lastName);
	
	}
	
	@Parameters({"phone"})
	@Test (priority =3)
	public void validatePhone(String phone) {
	
	WebElement Phone = pt.getPhone();
	Phone.sendKeys(phone);
}
	@Parameters({"email"})
	@Test (priority =4)
	public void validateEmail(String email) {
	
	WebElement Email = pt.getEmail();
	Email.sendKeys(email);
}
	
	@Parameters({"password"})
	@Test (priority =5)
	public void validatePassword(String password) {
	
	WebElement Password = pt.getPassword();
	Password.sendKeys(password);
}
	
	@Parameters({"confirmPassword"})
	@Test (priority =6)
	public void validateConfirmPassword(String confirmPassword) {
	
	WebElement confirmpassword = pt.getConfirmPassword();
	confirmpassword.sendKeys(confirmPassword);
}
	
	@Parameters({"expectedText"})
	@Test (priority =7)
	public void validateSignUp(String expectedText) {
	
	WebElement signup = pt.verifySignUP();
	
	String actualText = signup.getText();
	
	
	String expectedtext = expectedText;
	
	Assert.assertEquals(expectedtext, actualText);
}
	
	@Parameters({"expectedTitle"})
	@Test(priority =8)
	public void validateTitle(String expectedTitle){
	
	String actualTitle = driver.getTitle();
	String expectedtitle = expectedTitle;
	Assert.assertEquals(expectedtitle, actualTitle);
	
}
	
	@Parameters({"expectedUrl"})
	@Test(priority =9)
	public void validateUrl(String expectedUrl) {
	
	String actualUrl = driver.getCurrentUrl();
	String expectedurl = expectedUrl;
     
     Assert.assertEquals(actualUrl,expectedurl);
	
}

	@AfterTest
	public void afterTest() throws InterruptedException {
	Thread.sleep(2000);
	driver.quit();
	
	
}


}
