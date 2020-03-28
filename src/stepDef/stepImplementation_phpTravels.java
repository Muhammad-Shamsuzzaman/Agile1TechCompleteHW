package stepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjectModel.phpTravels;

public class stepImplementation_phpTravels {
	WebDriver driver;
	phpTravels pt;
	
	@Given("^user is on the sign up page$")
	public void user_is_on_the_sign_up_page() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		pt = new phpTravels(driver);
		
		driver.manage().deleteAllCookies();
		
		Thread.sleep(1000);
		
		driver.get("https://www.phptravels.net/register");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();

	}
	
	@When("^user enters firstName$")
	public void user_enters_firstName() {
		pt.getFirstName().sendKeys("John");
	}

	@When("^user enters lastName$")
	public void user_enters_lastName() {
		pt.getLastName().sendKeys("Stewart");
	}
	
	@When("^user enters phone Number$")
	public void userEntersPhoneNumber(){
		
		pt.getPhone().sendKeys("7031234567");
	}
	
	@When("^user enters Email$")
	public void userEntersEmail(){
		
		pt.getEmail().sendKeys("johnstewart@yahoo.com");
	}
	
	@When("^user enters Password$")
	public void userEntersPassword(){
		
		pt.getPassword().sendKeys("Abcd1234");
	}
	
	@When("^user enters Confirmpassword$")
	public void userEntersConfirmPassword(){
		
		pt.getConfirmPassword().sendKeys("Abcd1234");
	}


	@Then("^user should be able to read and validate the text of Sign Up button$")
	public void user_should_be_able_to_read_and_validate_the_text_of_Sign_Up_button() {
		WebElement signup = pt.verifySignUP();
		
		String actualText = signup.getText();
		
		String expectedText = "SIGN UP";
		
		Assert.assertEquals(expectedText, actualText);
	}

	@Then("^user should be able to read and validate the title of the page$")
	public void user_should_be_able_to_read_and_validate_the_title_of_the_page() {
		String actualTitle = driver.getTitle();
		String expectedlTitle = "Register";
		Assert.assertEquals(expectedlTitle, actualTitle);
	    
	}

	@Then("^user should be able to read and validate the URL of the page$")
	public void user_should_be_able_to_read_and_validate_the_URL_of_the_page() {
	    String actualUrl = driver.getCurrentUrl();
		
		String expectedUrl = "https://www.phptravels.net/register";
	     
	     Assert.assertEquals(actualUrl,expectedUrl);
	}
	
	@Then("^user should close The browser$")
	public void userCloseTheBrowser() throws InterruptedException {
	   Thread.sleep(2000);
	   
	   driver.quit();
	}



	
}
