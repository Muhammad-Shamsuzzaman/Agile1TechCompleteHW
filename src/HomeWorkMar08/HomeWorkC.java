package HomeWorkMar08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWorkC {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstName")).sendKeys("Thomas");
		
		driver.findElement(By.name("lastName")).sendKeys("Mill");
		
		driver.findElement(By.name("yid")).sendKeys("thomasmill193");
		
		driver.findElement(By.name("password")).sendKeys("ABcd@12345678");
		
		driver.findElement(By.name("phone")).sendKeys("7034857127");
		
		WebElement month = driver.findElement(By.name("mm"));
		//Important
		Select monthmm = new Select(month);
		
		monthmm.selectByVisibleText("February");
		
		driver.findElement(By.name("dd")).sendKeys("01");
		
		driver.findElement(By.name("yyyy")).sendKeys("1995");
		
		driver.findElement(By.name("freeformGender")).sendKeys("Male");
		
		Thread.sleep(5000);
		
		driver.close();



	}

}
