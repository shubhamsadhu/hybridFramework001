package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginTest extends BaseClass {
	
	
	
	@Test
	public  void loginTestCase() {
		LoginPage loginPage = new LoginPage();
		loginPage.testlogin(email, password);
	}
	
	@Test
	public void verifyTitleofLandingPage() {
		if(driver.getTitle().equals("Swag Labs")) {
			Assert.assertTrue(true);
			System.out.println(driver.getCurrentUrl());
		}else {
			System.out.println("title is wrong");
			Assert.assertTrue(false);
		}
	}

}
