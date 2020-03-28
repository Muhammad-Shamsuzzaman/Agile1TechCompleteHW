package stepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.newTours;

public class stepImplementation_newTours {
	
	WebDriver driver;
	
	newTours nt;
	
	@Given("^user is on the registration page$")
	public void user_is_on_the_registration_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		nt = new newTours(driver);
		
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	    
	}

	@When("^user enters firstname$")
	public void user_enters_firstname()  {
		nt.getFirstName().sendKeys("Tommy");
	}

	@When("^user enters lastname$")
	public void user_enters_lastname() {
		nt.getLastName().sendKeys("Lee");
	    
	}

	@When("^user enters phone number$")
	public void user_enters_phone_number() {
		nt.getPhone().sendKeys("7031234567");
	    
	}

	@When("^user enters email$")
	public void user_enters_email() {
		nt.getEmail().sendKeys("tommylee@yahoo.com");  
	}

	@When("^user enters address$")
	public void user_enters_address() {
		nt.getAddress().sendKeys("10400 Eaton Pl, Suite 105");  
	}

	@When("^user enters city$")
	public void user_enters_city() {
		nt.getCity().sendKeys("Fairfax"); 
	}
	
	@When("^user enters the state$")
	public void user_enters_the_state() {
		nt.getState().sendKeys("Virginia");
	}

	@When("^user enters postalcode$")
	public void user_enters_postalcode() {
		nt.getPostalCode().sendKeys("22030");
	}

	@When("^user enters username$")
	public void user_enters_username() {
		nt.getUserName().sendKeys("mcc1919");
	}

	@When("^user enters password$")
	public void user_enters_password() {
		nt.getPassword().sendKeys("Abcd1234");
	}

	@When("^user enters confirmpassword$")
	public void user_enters_confirmpassword() {
		nt.getConfirmPassword().sendKeys("Abcd1234"); 
	}

	@Then("^user should be able to verify the submit button is displayed and enabled$")
	public void user_should_be_able_to_verify_the_submit_button_is_displayed_and_enabled() {
		WebElement submit = nt.verifySubmit();
		boolean enable = submit.isEnabled();
		
		boolean display = submit.isDisplayed();
		
		Assert.assertTrue(enable);
		Assert.assertTrue(display);
		
	}

	@Then("^user should be able to read the title of the page$")
	public void user_should_be_able_to_read_the_title_of_the_page() {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Register: Mercury Tours";
		
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("^user should be able to read the URL of the page$")
	public void user_should_be_able_to_read_the_URL_of_the_page() {
		String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = "http://newtours.demoaut.com/mercuryregister.php";
	    Assert.assertEquals(actualUrl, expectedUrl);
	}
	@Then("^user should close the browser$")
	public void user_should_close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	   
	}



}
