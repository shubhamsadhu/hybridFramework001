package testCases;

import org.testng.annotations.Test;

import pageObjects.ProductPage;

public class LogOut extends BaseClass {

	ProductPage productPage;
	
	@Test()
	public void logout() throws InterruptedException {
		productPage = new ProductPage();
		productPage.clickondrawer();
	}
}
