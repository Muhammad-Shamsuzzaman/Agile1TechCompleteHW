package pageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class newTours {
	WebDriver driver;
	
	public newTours(WebDriver dr) {
		
		driver = dr;
	}
	
	public WebElement getFirstName() {
		WebElement firstName = driver.findElement(By.name("firstName"));
		
		return firstName;
		
	}
	public WebElement getLastName() {
		WebElement lastName = driver.findElement(By.name("lastName"));
		
		return lastName;

}
	
	public WebElement getPhone() {
		
		WebElement phone = driver.findElement(By.name("phone"));
		
		return phone;
	}
	
	public WebElement getEmail() {
		
		WebElement email = driver.findElement(By.name("userName"));
		
		return email;
	}
	
	public WebElement getAddress() {
		
		WebElement address = driver.findElement(By.name("address1"));
		
		return address;
	}
	
	public WebElement getCity() {
		
		WebElement city = driver.findElement(By.name("city"));
		
		return city;
	}
	
	public WebElement getState() {
		
		WebElement state = driver.findElement(By.name("state"));
		
		return state;
	}
	
	public WebElement getPostalCode() {
		
		WebElement postalCode = driver.findElement(By.name("postalCode"));
		
		return postalCode;
	}
	
	public WebElement getUserName() {
		
		WebElement email = driver.findElement(By.name("email"));
		
		return email;
	}
	
	public WebElement getPassword() {
		
		WebElement password = driver.findElement(By.name("password"));
		
		return password;
	}
	
	public WebElement getConfirmPassword() {
		
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		
		return confirmPassword;
	}
	
	public WebElement verifySubmit() {
		
		WebElement submit = driver.findElement(By.name("register"));
		
		return submit;
		
	}
	
}