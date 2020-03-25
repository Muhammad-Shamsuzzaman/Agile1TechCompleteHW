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

import pageObjectModel.automationPractice;

public class automationPractice_hwD {
	

	
	
	WebDriver driver;
	automationPractice ap;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		ap = new automationPractice(driver);
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(500);
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {	
	Thread.sleep(500);
	
	}
	
	
	@Test(priority =1)
	public void validateSpecials() {
		
		ap.getEmailAddress().sendKeys("thomasmill193@yahoo.com");
		Reporter.log("Entering thomasmill193@yahoo.com in the Email Address Text Box", true);
		
	}
	
	@Test (priority =2)
	public void validateCreateAccount() {
		
		ap.validateCreateAccount().click();
		Reporter.log("Verifying the Create Account is displayed", true);
	}
	
	@Test (priority =3)
	public void validateTitleMr() {
		
		ap.validateTitleMr().click();
		Reporter.log("Selecting Mr. in the Title Radio Button", true);
	}
	
	@Test (priority =4)
	public void validateFirstName() {
		
		ap.validateFirstName().sendKeys("Glen");
		Reporter.log("Entering Glen in the First Name Text Box", true);
		
	}
	
	@Test (priority = 5)
	public void validateLastName() {
		
		ap.validateLastName().sendKeys("McGrath");
		Reporter.log("Entering McGrath in the Last Name Text Box", true);
	}
	
	@Test (priority = 6)
	public void validatePassword() {
		
		ap.validatePassword().sendKeys("GlenMcg94");
		Reporter.log("Entering GlenMcg94 in the Password Text Box", true);
		
	}
	
	@Test (priority = 7)
	public void validateDate() {
		
		WebElement day = ap.getDate();
		Reporter.log("Verifying the Day is displayed", true);
		Select daydd = new Select(day);
		daydd.selectByValue("10");
		Reporter.log("Selecting 10 from the Day drop down menu", true);
	}
	
	@Test (priority =8)
	public void validateMonth() {
		
		WebElement month = ap.getMonth();
		Reporter.log("Verifying the Month is displayed", true);
		Select monthmm = new Select (month);
		monthmm.selectByIndex(6);
		Reporter.log("Selecting June from the Month drop down menu", true);
	}
	@Test (priority = 9)
	public void validateYear() {
		
		WebElement year = ap.getYear();
		Reporter.log("Verifying the Year is displayed", true);
		Select yearyy = new Select (year);
		yearyy.selectByValue("2000");
		Reporter.log("Selecting 2000 from the Year drop down menu", true);
	}
	
	@Test (priority =10)
	public void validateNewsLetter() {
		
		ap.validateNewsLetter().click();
		Reporter.log("Selecting News Letter Radio Button", true);
	}
	
	@Test (priority =11)
	public void validateSpecialOffers() {
		
		ap.validateSpecialOffers().click();
		Reporter.log("Selecting Special Offers Radio Button", true);
	}
	
	@Test(priority =12)
	public void validateCompany() {
		
		ap.validateCompany().sendKeys("Agile1Tech");
		Reporter.log("Entering Agile1Tech in the Company Text Box", true);
	}
	
	@Test (priority =13)
	public void validateAddress() {
		
		ap.validateAddress().sendKeys("10400 Eaton Pl Suite # 105");
		Reporter.log("Entering 10400 Eaton Pl Suite # 105 in the Address Text Box", true);
	}
	
	@Test(priority =14)
	public void validateCity() {
		
		ap.validateCity().sendKeys("Fairfax");
		Reporter.log("Entering Fairfax in the City Text Box", true);
	}
	
	@Test (priority =15)
	public void valdateState() {
		
		WebElement state = ap.validateState();
		Reporter.log("Verifying the State is displayed", true);
		
		Select statess = new Select (state);
		statess.selectByVisibleText("Virginia");
		Reporter.log("Selecting Virginia from the State drop down menu", true);
	}
	
	@Test (priority = 16)
	public void valdateZipCode() {
		
		ap.validateZipCode().sendKeys("22030");
		Reporter.log("Entering 22030 in the Zip Code Text Box", true);
	}
	
	@Test (priority =17)
	public void validateAdditionalInformation() {
		
		ap.validateAdditionalInformation().sendKeys("Thank you");
		Reporter.log("Entering Thank you in the Additional Information Text Box", true);
	}
	
	@Test (priority = 18)
	public void validateHomePhone() {
		
		ap.validateHomePhone().sendKeys("5716455899");
		Reporter.log("Entering 5716455899 int the Phone Text Box", true);
	}
	
	@Test (priority =19)
	public void validateMobilePhone() {
		
		ap.validateMobilePhone().sendKeys("5716455899");
		Reporter.log("Entering 5716455899 int the Mobile Phone Text Box", true);
	}
	
	@Test (priority =20)
	public void validateAlias() {
		
		ap.validateAlias().sendKeys("Agile1Tech");
		Reporter.log("Entering Agile1Tech int the Alias Text Box", true);
	}
	
	@Test (priority =21)
	public void validateRegister() {
		
		WebElement register = ap.validateRegister();
		boolean display = register.isDisplayed();
		Reporter.log("Verifying Register Button is displayed", true);
		
		Assert.assertTrue(display);
	}
	
	@Test (priority =22)
	public void validateUrl() {
		
		String actualUrl = driver.getCurrentUrl();
		Reporter.log("Verifying Actual Url of the page", true);
		String expectedUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
		
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@Test (priority =23)
	public void validateTitle() {
		
		String actualTitle = driver.getTitle();
		Reporter.log("Verifying Actual Title of the page", true);
		String expectedTitle = "Login - My Store";
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.quit();
	}


}
