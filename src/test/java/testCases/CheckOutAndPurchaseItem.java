package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class CheckOutAndPurchaseItem extends BaseClass {
	private LandingPage landingPage;
	
	@Test
	public void checkItemInCart() {
		landingPage = new LandingPage();
		landingPage.checkIteminCart();
	}
}
