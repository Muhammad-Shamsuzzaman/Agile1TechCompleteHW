package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automationPractice {
	
	WebDriver driver;
	
	public automationPractice(WebDriver dr) {
		
		driver = dr;
	}
	
	public WebElement getSpcials() {
		
		WebElement specials = driver.findElement(By.linkText("Specials"));
		
		return specials;
	}
	
	public WebElement getNewProducts() {
		
		WebElement newProducts = driver.findElement(By.linkText("New products"));
		
		return newProducts;
	}
	
	public WebElement getBestSellers() {
		
		WebElement bestSellers = driver.findElement(By.linkText("Best sellers"));
		
		return bestSellers;
	}
	
	public WebElement getOurStores() {
		
		WebElement ourStores = driver.findElement(By.linkText("Our stores"));
		
		return ourStores;
	}
	
	public WebElement getContactUs() {
		
		WebElement contactUs = driver.findElement(By.linkText("Contact us"));
		
		return contactUs;
	}
	
	public WebElement getTermsAndConditions() {
		
		WebElement termsConditions = driver.findElement(By.linkText("Terms and conditions of use"));
		
		return termsConditions;
	}
	
	public WebElement getAboutUs() {
		
		WebElement aboutUs = driver.findElement(By.linkText("About us"));
		
		return aboutUs;
	}
	
	public WebElement getSiteMap() {
		
		WebElement siteMap = driver.findElement(By.linkText("Sitemap"));
		
		return siteMap;
	}
	

}
