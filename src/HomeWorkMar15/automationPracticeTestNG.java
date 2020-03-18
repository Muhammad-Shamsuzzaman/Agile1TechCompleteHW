package HomeWorkMar15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectModel.automationPractice;
import pageObjectModel.yahooAccount;

public class automationPracticeTestNG {
	
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
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		
		Thread.sleep(500);
		driver.navigate().back();
	}
	
	
	@Test(priority =1)
	public void validateSpecials() {
		
		ap.getSpcials().click();
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(title, "Prices drop - My Store");
		Assert.assertEquals(url, "http://automationpractice.com/index.php?controller=prices-drop");
		
		System.out.println("The title of the page is: " + title);
		System.out.println("The URL of the page is: " + url);
	}
	
	@Test(priority =2)
	public void validateNewProducts() {
		
		ap.getNewProducts().click();
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(title, "New products - My Store");
		Assert.assertEquals(url, "http://automationpractice.com/index.php?controller=new-products");
		
		System.out.println("The title of the page is: " + title);
		System.out.println("The URL of the page is: " + url);
	}
	@Test(priority =3)
	public void validateBestSellers() {
		
		ap.getBestSellers().click();
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(title, "Best sales - My Store");
		Assert.assertEquals(url, "http://automationpractice.com/index.php?controller=best-sales");
		
		System.out.println("The title of the page is: " + title);
		System.out.println("The URL of the page is: " + url);
	}
	@Test(priority =4)
	public void validateOurStores() {
		
		ap.getOurStores().click();
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(title, "Stores - My Store");
		Assert.assertEquals(url, "http://automationpractice.com/index.php?controller=stores");
		
		System.out.println("The title of the page is: " + title);
		System.out.println("The URL of the page is: " + url);
	}
	@Test(priority =5)
	public void validateContactUs() {
		
		ap.getContactUs().click();
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(title, "Contact us - My Store");
		Assert.assertEquals(url, "http://automationpractice.com/index.php?controller=contact");
		
		System.out.println("The title of the page is: " + title);
		System.out.println("The URL of the page is: " + url);
	}
	@Test(priority =6)
	public void validateTermsAndConditions() {
		
		ap.getTermsAndConditions().click();
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(title, "Terms and conditions of use - My Store");
		Assert.assertEquals(url, "http://automationpractice.com/index.php?id_cms=3&controller=cms");
		
		System.out.println("The title of the page is: " + title);
		System.out.println("The URL of the page is: " + url);
	}
	@Test(priority =7)
	public void validateAboutUs() {
		
		ap.getAboutUs().click();
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(title, "About us - My Store");
		Assert.assertEquals(url, "http://automationpractice.com/index.php?id_cms=4&controller=cms");
		
		System.out.println("The title of the page is: " + title);
		System.out.println("The URL of the page is: " + url);
	}
	@Test(priority =8)
	public void validateSiteMap() {
		
		ap.getSiteMap().click();
		
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		Assert.assertEquals(title, "Sitemap - My Store");
		Assert.assertEquals(url, "http://automationpractice.com/index.php?controller=sitemap");
		
		System.out.println("The title of the page is: " + title);
		System.out.println("The URL of the page is: " + url);
	}

	@AfterTest
	public void afterTest() {
		
		driver.quit();
	}
}
