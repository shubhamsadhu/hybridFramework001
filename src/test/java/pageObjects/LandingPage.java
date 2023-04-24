package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	public void checkIteminCart() {
		addToCartBtn.click();
		verifyPageHeader.click();
		System.out.println(verifyPageHeader.getText());
		waitForAppear(CheckoutBtn);
		CheckoutBtn.click();
	}
	
	
	
	
}
