import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.quit();
	}

}
