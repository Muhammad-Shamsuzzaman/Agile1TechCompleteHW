package pageObjectModel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class automationPractice {
	
	WebDriver driver;
	
	public automationPractice(WebDriver dr) {
		
		driver = dr;
	}
	
	public WebElement getEmailAddress() {
		
		WebElement emailAddress = driver.findElement(By.id("email_create"));
		
		return emailAddress;
	}
	
	public WebElement validateCreateAccount() {
		
		WebElement createAccount = driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span"));
		
		return createAccount;
	}
	
	public WebElement validateTitleMr() {
		
		WebElement mr = driver.findElement(By.id("id_gender1"));
		
		return mr;
		
		
	}
	
	public WebElement validateTitleMrs() {
		
		WebElement mrs = driver.findElement(By.id("id_gender2"));
		
		return mrs;
		
		
	}
	
	public WebElement validateFirstName() {
		
		WebElement firstName = driver.findElement(By.id("customer_firstname"));
		
		return firstName;
	}
	
	public WebElement validateLastName() {
		
		WebElement lastName = driver.findElement(By.id("customer_lastname"));
		
		return lastName;
	}
	
	public WebElement validatePassword() {
		
		WebElement password= driver.findElement(By.id("passwd"));
		
		return password;
	}
	
	public WebElement getDate() {
		
		WebElement date = driver.findElement(By.id("days"));
		
		return date;
	}
	
	public WebElement getMonth() {
		
		WebElement month = driver.findElement(By.name("months"));
		
		return month;
	}
	
	public WebElement getYear() {
		
		WebElement year = driver.findElement(By.name("years"));
		
		return year;
	}
	
	public WebElement validateNewsLetter() {
		
		WebElement newsLetter = driver.findElement(By.id("newsletter"));
		
		return newsLetter;
	}
	
	public WebElement validateSpecialOffers() {
		
		WebElement specialOffers = driver.findElement(By.id("optin"));
		
		return specialOffers;
	}
	
	public WebElement validateCompany() {
		
		WebElement company = driver.findElement(By.id("company"));
		
		return company;
	}
	
	public WebElement validateAddress() {
		
		WebElement address = driver.findElement(By.id("address1"));
		
		return address;
	}
	
	public WebElement validateCity() {
		
		WebElement city = driver.findElement(By.id("city"));
		
		return city;
	}
	
	public WebElement validateState() {
		
		WebElement state = driver.findElement(By.id("id_state"));
		
		return state;
	}
	
	public WebElement validateZipCode() {
		
		WebElement zipCode = driver.findElement(By.id("postcode"));
		
		return zipCode;
	}
	
	public WebElement validateAdditionalInformation() {
		
		WebElement additionalInformation = driver.findElement(By.id("other"));
		
		return additionalInformation;
	}
	
	public WebElement validateHomePhone() {
		
		WebElement homePhone = driver.findElement(By.id("phone"));
		
		return homePhone;
	}
	
	public WebElement validateMobilePhone() {
		
		WebElement mobilePhone = driver.findElement(By.id("phone_mobile"));
		
		return mobilePhone;
	}
	
	public WebElement validateAlias() {
		
		WebElement alias = driver.findElement(By.id("alias"));
		
		return alias;
	}
	
	public WebElement validateRegister() {
		
		WebElement register = driver.findElement(By.id("submitAccount"));
		
		return register;
	}

}
