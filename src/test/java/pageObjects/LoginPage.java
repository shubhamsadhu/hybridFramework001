package pageObjects;

import org.testng.annotations.Test;

import abstractcomponents.ReusableComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.BaseClass;


//login page is a landing page in this website
public class LoginPage extends ReusableComponents{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//div/input)[1]")
	WebElement emailtextfieldElement;
	
	By emailtextfieldBy = By.xpath("(//div/input)[1]");
	
	@FindBy(id  = "password")
	WebElement passwordElement;
	
	@FindBy(id  = "login-button")
	WebElement loginbtnElement;
	
	
	@Test
	public void testlogin(String email, String Password) throws InterruptedException {
		Thread.sleep(5);
		waitforElementAppear(emailtextfieldElement);
		emailtextfieldElement.sendKeys(email);
		passwordElement.sendKeys(Password);
		loginbtnElement.click();
	}


}
