package stepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.yahooAccount;

public class stepImplementation_yahooAccount {
	
	WebDriver driver;
	
	yahooAccount ya;
	
	@Given("^user is on the yahoo sign up page$")
	public void user_is_on_the_yahoo_sign_up_page() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		ya = new yahooAccount(driver);
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
	}

	@When("^I enter first name$")
	public void i_enter_first_name() {
		WebElement firstName = ya.getFirstName();
		firstName.sendKeys("Thomas");
		boolean display1 = firstName.isDisplayed();
		Assert.assertTrue(display1);
	}

	@When("^I enter last name$")
	public void i_enter_last_name() {
		WebElement lastName = ya.getLastName();
		lastName.sendKeys("Mill");
		boolean display2 = lastName.isDisplayed();
		Assert.assertTrue(display2);
	}

	@When("^I enter email$")
	public void i_enter_email() {
		WebElement emailAddress = ya.getUserId();
		emailAddress.sendKeys("thomasmill193");
		boolean display3 = emailAddress.isDisplayed();
		Assert.assertTrue(display3);
	}

	@When("^I enter password$")
	public void i_enter_password() {
		WebElement password = ya.getPassword();
		password.sendKeys("ABcd@12345678");
		boolean display4 = password.isDisplayed();
		Assert.assertTrue(display4);
	}

	@When("^I enter phone number$")
	public void i_enter_phone_number() {
		WebElement phone = ya.getPhone();
		phone.sendKeys("7031234567");
		boolean display5 = phone.isDisplayed();
		Assert.assertTrue(display5);
		
	}

	@When("^I select birth month$")
	public void i_select_birth_month() {
		WebElement month = ya.getMonth();
		Select monthmm = new Select(month);
		monthmm.selectByVisibleText("February");
		boolean display6 = month.isDisplayed();
		Assert.assertTrue(display6);
	}

	@When("^I enter birth day$")
	public void i_enter_birth_day() {
		WebElement day = ya.getDate();
		day.sendKeys("01");
		boolean display7 = day.isDisplayed();
		Assert.assertTrue(display7);
	}

	@When("^I enter birth year$")
	public void i_enter_birth_year() {
		WebElement year = ya.getYear();
		year.sendKeys("1995");
		boolean display8 = year.isDisplayed();
		Assert.assertTrue(display8);
	}

	@When("^I enter gender$")
	public void i_enter_gender() {
		WebElement gender = ya.getGender();
		gender.sendKeys("Male");
		boolean display9 = gender.isDisplayed();
		Assert.assertTrue(display9);
	}

	@Then("^I read terms and conditions$")
	public void i_read_terms_and_conditions() {
		WebElement terms = ya.validateTerms();
		boolean display10 = terms.isDisplayed();
		Assert.assertTrue(display10);
	}

	@Then("^I read privacy policy$")
	public void i_read_privacy_policy() {
	WebElement privacyPolicy = ya.validatePrivacyPolicy();
	boolean display11 = privacyPolicy.isDisplayed();
	Assert.assertTrue(display11);
	}

	@Then("^I verify Continue button is displayed$")
	public void i_verify_Continue_button_is_displayed() {
		WebElement continueButton = ya.validateContinueButton();
		boolean display12 = continueButton.isDisplayed();
		Assert.assertTrue(display12);
	}

	@Then("^I verify Sing in button is displayed$")
	public void i_verify_Sing_in_button_is_displayed() {
		WebElement signIn = ya.validateSignIn();
		boolean display13 = signIn.isDisplayed();
		Assert.assertTrue(display13);
	}

	@Then("^I close the browser$")
	public void i_close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.quit();
	}

}
