/*
 * fetch highest price details
 * click on add to cart button 
 * write script to test all links
 */

package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.BaseClass;

public class brokenLinksScript extends BaseClass {
	
	public brokenLinksScript() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	WebElement addtocartbuttonElement;
	
	
	
	public void getbrokenlinks() {
		
	}

}
