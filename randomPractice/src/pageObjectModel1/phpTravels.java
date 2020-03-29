package pageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class phpTravels {
	WebDriver driver;
	
	public phpTravels(WebDriver dr){
		
		driver = dr;
	}
	
	public WebElement getFirstName() {
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		
		return firstName;
	}
	
	public WebElement getLastName() {
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		
		return lastName;
	}
	
	public WebElement getPhone() {
		
		WebElement phone = driver.findElement(By.name("phone"));
		
		return phone;
	}
	
	public WebElement getEmail() {
		
		WebElement email = driver.findElement(By.name("email"));
		
		return email;
	}
	
	public WebElement getPassword() {
		
		WebElement password = driver.findElement(By.name("password"));
		
		return password; 
	}
	
	public WebElement getConfirmPassword() {
		
		WebElement confirmPassword = driver.findElement(By.name("confirmpassword"));
		
		return confirmPassword;
	}
	
	public WebElement verifySignUP() {
		
		WebElement signup = driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/div/div[2]/div/form/div[8]/button"));
		
		return signup;
	}

}
