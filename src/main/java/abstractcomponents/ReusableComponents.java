package abstractcomponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableComponents {

	WebDriver driver;
	public ReusableComponents(WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitforElementAppear(By findBy) {
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
}
