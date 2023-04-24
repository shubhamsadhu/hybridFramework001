package pageObjects;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.BaseClass;

public class LoginPage extends BaseClass {
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div/input)[1]")
	WebElement emailtextfieldElement;
	
	@FindBy(id  = "password")
	WebElement passwordElement;
	
	@FindBy(id  = "login-button")
	WebElement loginbtnElement;
	
	
	@Test
	public void testlogin(String email, String Password) throws InterruptedException {
		Thread.sleep(5);
		waitForAppear(emailtextfieldElement);
		emailtextfieldElement.sendKeys(email);
		passwordElement.sendKeys(Password);
		loginbtnElement.click();
	}

}
