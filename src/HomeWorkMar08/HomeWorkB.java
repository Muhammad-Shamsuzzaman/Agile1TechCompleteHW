package HomeWorkMar08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

public class HomeWorkB {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_Win32_3.150.1\\IEDriverServer.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new InternetExplorerDriver();
	
		//driver.manage().deleteAllCookies();
	
		driver.get("https://www.phptravels.net/register");
		
	
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		//driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Muhammad");
		
		driver.findElement(By.name("lastname")).sendKeys("Shamsuzzaman");
		
		driver.findElement(By.name("phone")).sendKeys("7034857126");
		
		driver.findElement(By.name("email")).sendKeys("rokydeg8@yahoo.com");
		
		driver.findElement(By.name("password")).sendKeys("Abcd1234");
		
		driver.findElement(By.name("confirmpassword")).sendKeys("Abcd1234");
		
		WebElement signup = driver.findElement(By.xpath("//button[@type = 'submit']"));
		boolean enable = signup.isEnabled();
		boolean display = signup.isDisplayed();
		System.out.println("The Sign Up button is enabled: " + enable);
		System.out.println("The Sign Up button is enabled: " + display);
		
		String text = signup.getText();
		
		 String title = driver.getTitle();
		 
	     String url = driver.getCurrentUrl();
	     
	    
	     
	     System.out.println("The text of Sign Up button is: " + text);
	     
	     System.out.println("The title of the page is: " + title);
	     
	    
	     
	     
	     
	     Thread.sleep(2000);
	     
	     driver.quit();
	     
	

	}

}
