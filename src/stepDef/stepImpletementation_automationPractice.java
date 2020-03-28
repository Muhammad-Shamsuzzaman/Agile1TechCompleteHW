package stepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.automationPractice;

public class stepImpletementation_automationPractice {
	
	WebDriver driver;
	automationPractice ap;
	
	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		ap = new automationPractice(driver);
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(500);
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	    
	}

	@When("^I enter the email address$")
	public void i_enter_the_email_address() {
		ap.getEmailAddress().sendKeys("thomasmill193@yahoo.com");
	}

	@When("^I click on create account$")
	public void i_click_on_create_account() {
		ap.validateCreateAccount().click();  
	}

	@When("^I click on Mr\\. Radio Button$")
	public void i_click_on_Mr_Radio_Button() {
		ap.validateTitleMr().click(); 
	}

	@When("^I enter my first name$")
	public void i_enter_my_first_name() {
		ap.validateFirstName().sendKeys("Glen"); 
	}

	@When("^I enter my last name$")
	public void i_enter_my_last_name() {
		ap.validateLastName().sendKeys("McGrath");
	}

	@When("^I enter new password$")
	public void i_enter_new_password(){
		ap.validatePassword().sendKeys("GlenMcg94");
	}

	@When("^I select date$")
	public void i_select_date() {
		WebElement day = ap.getDate();
		Select daydd = new Select(day);
		daydd.selectByValue("10");  
	}

	@When("^I select month$")
	public void i_select_month() {
		WebElement month = ap.getMonth();
		Select monthmm = new Select (month);
		monthmm.selectByIndex(6);
	}

	@When("^I select year$")
	public void i_select_year() {
		WebElement year = ap.getYear();
		Select yearyy = new Select (year);
		yearyy.selectByValue("2000");  
	}

	@When("^I click on Sign Up for newsletter$")
	public void i_click_on_Sign_Up_for_newsletter() {
		ap.validateNewsLetter().click();
	}

	@When("^I click on receive special offers$")
	public void i_click_on_receive_special_offers() {
		ap.validateSpecialOffers().click(); 
	}

	@When("^I enter my company name$")
	public void i_enter_my_company_name() {
		ap.validateCompany().sendKeys("Agile1Tech"); 
	}

	@When("^I enter my address$")
	public void i_enter_my_address() {
		ap.validateAddress().sendKeys("10400 Eaton Pl Suite # 105");
	}

	@When("^I enter my city$")
	public void i_enter_my_city() {
		ap.validateCity().sendKeys("Fairfax");
	}

	@When("^I select my state$")
	public void i_select_my_state() {
		WebElement state = ap.validateState();
		Select statess = new Select (state);
		statess.selectByVisibleText("Virginia");
	}

	@When("^I enter my zipcode$")
	public void i_enter_my_zipcode() {
		ap.validateZipCode().sendKeys("22030");   
	}

	@When("^I enter additional information$")
	public void i_enter_additional_information() {
		ap.validateAdditionalInformation().sendKeys("Thank you");
	}

	@When("^I enter home phone number$")
	public void i_enter_home_phone_number() {
		ap.validateHomePhone().sendKeys("5716455899");  
	}

	@When("^I enter mobile phone number$")
	public void i_enter_mobile_phone_number() {
		ap.validateMobilePhone().sendKeys("5716455899");  
	}

	@When("^I enter alias$")
	public void i_enter_alias() {
		ap.validateAlias().sendKeys("Agile1Tech");  
	}

	@Then("^I verify register button is displayed$")
	public void i_verify_register_button_is_displayed() {
		WebElement register = ap.validateRegister();
		boolean display = register.isDisplayed();
		Assert.assertTrue(display);
	}

	@Then("^I validate the URL$")
	public void i_validate_the_URL() {
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
		Assert.assertEquals(actualUrl, expectedUrl); 
	}

	@Then("^I validate the Title$")
	public void i_validate_the_Title() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login - My Store";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Then("^I Close the browser$")
	public void CloseBrowser() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.quit(); 
	}



}
