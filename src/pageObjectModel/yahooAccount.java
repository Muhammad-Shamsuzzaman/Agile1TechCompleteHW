package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class yahooAccount {
	
	WebDriver driver;
	
	public yahooAccount(WebDriver dr){
		
		driver =dr;
	}
	
	public WebElement getFirstName() {
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		
		return firstName;
	}
	
	public WebElement getLastName() {
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		
		return lastName;
	}
	
	public WebElement getUserId() {
		
		WebElement userId = driver.findElement(By.name("yid"));
		
		return userId;
	}
	
	public WebElement getPassword() {
		
		WebElement password = driver.findElement(By.name("password"));
		
		return password;
	}
	
	public WebElement getPhone() {
		
		WebElement phone = driver.findElement(By.name("phone"));
		
		return phone;
	}
	
	public WebElement getMonth() {
		
		WebElement month = driver.findElement(By.name("mm"));
		
		return month;
		
	}
	
	public WebElement getDate() {
		
		WebElement date = driver.findElement(By.name("dd"));
		
		return date;
	}
	
public WebElement getYear() {
		
		WebElement year = driver.findElement(By.name("yyyy"));
		
		return year;
	}
	
	public WebElement getGender() {
		
		WebElement gender = driver.findElement(By.name("freeformGender"));
		
		return gender;
	}
	

}
