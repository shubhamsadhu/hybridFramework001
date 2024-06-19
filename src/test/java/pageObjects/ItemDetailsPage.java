/*
 * fetch highest price details
 * click on add to cart button 
 */

package pageObjects;
import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import abstractcomponents.ReusableComponents;
import testCases.BaseClass;


public class ItemDetailsPage extends BaseClass  {
	
	
	public ItemDetailsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement addtocartbuttonElement;
	
	@FindBy(className  = "inventory_details_price")
	WebElement fetchitemprice;
	 
	@FindBy(id = "back-to-products")
	WebElement clickonBacktoProductBtn;
	
	
	public void AddtoCart() {
		Assert.assertTrue(fetchitemprice.isDisplayed());  //it pass if it return true
		waitforElementAppear(fetchitemprice);
		System.out.println(fetchitemprice.getText());
		addtocartbuttonElement.click();
	}
	
	public void ClickonBacktoProductBtn() {
		clickonBacktoProductBtn.click();
	}
 
}
