package HomeWorkMar08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkA {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstName")).sendKeys("Muhammad");
		
		driver.findElement(By.name("lastName")).sendKeys("Shamsuzzaman");
		
		driver.findElement(By.name("phone")).sendKeys("7034857126");
		
		driver.findElement(By.name("userName")).sendKeys("rokydeg8@yahoo.com");
		
		driver.findElement(By.name("address1")).sendKeys("10400 Eaton Pl, Suite 105");
		
		driver.findElement(By.name("city")).sendKeys("Fairfax");
		
		driver.findElement(By.name("state")).sendKeys("Virginia");
		
		driver.findElement(By.name("postalCode")).sendKeys("22193");
		
		driver.findElement(By.name("email")).sendKeys("mcc1919");
		
		driver.findElement(By.name("password")).sendKeys("Abcd1234");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("Abcd1234");
		
		WebElement submit = driver.findElement(By.name("register"));
		
		
		boolean enable =  submit.isEnabled();
		
		boolean display =  submit.isDisplayed();
		
		 System.out.println("Submit button is enabled = " + enable);
		 
	     System.out.println("Submit button is displayed = " + display);
		
	     String title = driver.getTitle();
	     String url = driver.getCurrentUrl();
	     
	     System.out.println("The title of the page is: " + title);
	     
	     System.out.println("The URL of the page is: " + url);
	     
	     Thread.sleep(5000);
	     
	     driver.quit();
	     
		

	}

}
