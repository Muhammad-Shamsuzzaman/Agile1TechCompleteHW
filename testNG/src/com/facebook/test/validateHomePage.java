package com.facebook.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class validateHomePage {
	WebDriver driver;
	@BeforeTest
	public void setupTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	}
	
	@Test
	public void validateTitle() {
		String title = driver.getTitle();
	     String url = driver.getCurrentUrl();	
 
	     System.out.println("The title of the page is: " + title);
	     
	     System.out.println("The URL of the page is: " + url);
	     
	     Assert.assertEquals("Register: Mercury Tours1", title);
		
	}
	
	@AfterTest
	
	public void finishTest() {
		
		driver.quit();
		
		
	}
		
	}

