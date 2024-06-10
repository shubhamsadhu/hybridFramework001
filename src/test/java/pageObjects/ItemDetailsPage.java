/*
 * fetch highest price details
 * click on add to cart button 
 */

package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractcomponents.ReusableComponents;


public class ItemDetailsPage extends ReusableComponents  {
	
	WebDriver driver;
	
	public ItemDetailsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement addtocartbuttonElement;
	
	@FindBy(className  = "inventory_details_price")
	WebElement fetchitemprice;
	
	@FindBy(id = "back-to-products")
	WebElement clickonBacktoProductBtn;
	
	
	public void AddtoCart() {
		waitforElementAppear(fetchitemprice);
		System.out.println(fetchitemprice.getText());
		addtocartbuttonElement.click();
	}
	
	public void ClickonBacktoProductBtn() {
		clickonBacktoProductBtn.click();
	}

}
