package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testCases.BaseClass;

public class LoginPage extends BaseClass {
	
	WebElement emailtextfield = driver.findElement(By.xpath("(//div/input)[1]"));
	WebElement passwordtextfield = driver.findElement(By.id("password"));
	WebElement loginbtn = driver.findElement(By.id("login-button"));
	
	public void testlogin(String email, String Password) throws InterruptedException {
		Thread.sleep(5);
		waitForAppear(By.xpath("(//div/input)[1]"));
		emailtextfield.sendKeys(email);
		passwordtextfield.sendKeys(Password);
		loginbtn.click();
	}
	
	public void clearfields() {
		emailtextfield.clear();
		passwordtextfield.clear();
	}
}
