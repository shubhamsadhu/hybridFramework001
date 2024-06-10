package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageObjects.ProductPage;

public class LogOut extends BaseClass {

	ProductPage productPage;
	
	@Test()
	public void logout() throws InterruptedException {
		productPage = new ProductPage(driver);
		productPage.clickondrawer();
	}
}
