package HomeWorkMar15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModel.phpTravels;
import pageObjectModel.yahooAccount;

public class yahooAccountTestNG {
	
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
		
		ya.getFirstName().sendKeys("Thomas");
	}
	
	@Test(priority =2)
	public void validateLastName() {
		
		ya.getLastName().sendKeys("Mill");
	}
	
	@Test(priority =3)
	public void validateId() {
		
		ya.getUserId().sendKeys("thomasmill193");
	}
	
	@Test(priority =4)
	public void validatePassword() {
		
		ya.getPassword().sendKeys("ABcd@12345678");
	}
	
	@Test(priority =5)
	public void validatePhone() {
		
		ya.getPhone().sendKeys("7034857127");
	}
	
	@Test(priority =6)
	public void validateMonth(){
		
		WebElement month = ya.getMonth();
		Select monthmm = new Select(month);
		monthmm.selectByVisibleText("February");
		
	}
	
	@Test(priority =7)
	public void validateDate() {
		
		ya.getDate().sendKeys("01");
		
	}
	
	@Test(priority =8)
	public void validateYear() {
		
		ya.getYear().sendKeys("1995");
	}
	
	@Test(priority =9)
	public void validateGender() {
		
		ya.getGender().sendKeys("Male");
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
