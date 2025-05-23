package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import abstractcomponents.ReusableComponents;
import testCases.BaseClass;

public class LandingPage extends BaseClass{

	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div/a[@class='shopping_cart_link']")
	WebElement addToCartBtn;
	
	@FindBy(xpath = "//div[@class='header_secondary_container']")
	WebElement verifyPageHeader;
	
	@FindBy(xpath = "//div[@class='cart_item']")
	WebElement CheckNumberofItemsInCart;
	
	@FindBy(xpath = "//div/button[text()='Checkout']")
	WebElement CheckoutBtn;
	
	By resultBy = By.xpath("\"//div/button[text()='Checkout']\""); 
	
	public void checkIteminCart() {
		addToCartBtn.click();
		verifyPageHeader.click();
		Assert.assertEquals(false, null);
		System.out.println(verifyPageHeader.getText());
		waitforvisiblityoflocator(resultBy);
		CheckoutBtn.click();
	}
	
	
	
	
}
