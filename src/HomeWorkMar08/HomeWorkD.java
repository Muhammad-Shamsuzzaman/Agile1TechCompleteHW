package HomeWorkMar08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkD {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email_create")).sendKeys("rokydeg8@yahoo.com");
		
		driver.findElement(By.linkText("Specials")).click();
		
		String title1 = driver.getTitle();
		
		String url1 = driver.getCurrentUrl();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("New products")).click();
		
		String title2 = driver.getTitle();
		
		String url2 = driver.getCurrentUrl();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Best sellers")).click();
		
		String title3 = driver.getTitle();
		
		String url3 = driver.getCurrentUrl();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Our stores")).click();
		
		String title4 = driver.getTitle();
		
		String url4 = driver.getCurrentUrl();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Contact us")).click();
		
		String title5 = driver.getTitle();
		
		String url5 = driver.getCurrentUrl();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Terms and conditions of use")).click();
		
		String title6 = driver.getTitle();
		
		String url6 = driver.getCurrentUrl();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("About us")).click();
		
		String title7 = driver.getTitle();
		
		String url7 = driver.getCurrentUrl();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Sitemap")).click();
		
		String title8 = driver.getTitle();
		
		String url8 = driver.getCurrentUrl();
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		System.out.println("The title of the page is: " + title1);
		
		System.out.println("The URL of the page is: " + url1);
		
		System.out.println("The title of the page is: " + title2);
		
		System.out.println("The URL of the page is: " + url2);
		
		System.out.println("The title of the page is: " + title3);
		
		System.out.println("The URL of the page is: " + url3);
		
		System.out.println("The title of the page is: " + title4);
		
		System.out.println("The URL of the page is: " + url4);
		
		System.out.println("The title of the page is: " + title5);
		
		System.out.println("The URL of the page is: " + url5);
		
		System.out.println("The title of the page is: " + title6);
		
		System.out.println("The URL of the page is: " + url6);
		
		System.out.println("The title of the page is: " + title7);
		
		System.out.println("The URL of the page is: " + url7);
		
		System.out.println("The title of the page is: " + title8);
		
		System.out.println("The URL of the page is: " + url8);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	

	}

}
