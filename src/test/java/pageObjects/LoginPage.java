package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testCases.BaseClass;

public class LoginPage extends BaseClass {
//	WebDriver driver;
//	//contructor
//	public LoginPage(WebDriver driver) {
//		this.driver=driver;
//	}
	
	WebElement emailtextfield = driver.findElement(By.id("user-name"));
	WebElement passwordtextfield = driver.findElement(By.id("password"));
	WebElement loginbtn = driver.findElement(By.id("login-button"));
	
	public void testlogin(String email, String Password) {
		emailtextfield.clear();
		emailtextfield.sendKeys(email);
		passwordtextfield.clear();
		passwordtextfield.sendKeys(Password);
		loginbtn.click();
	}
	
	
}
