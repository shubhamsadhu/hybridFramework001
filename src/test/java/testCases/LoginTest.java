package testCases;

import org.testng.annotations.Test;


public class LoginTest extends BaseClass {
//	 LoginPage loginPage = new LoginPage();
//	


	@Test
	public void TestWithValidData() throws InterruptedException {
	 
	  loginPage.testlogin(email, password);
	  
	}
	
	@Test
	public void TestWithInvalidData() throws InterruptedException {
		loginPage.testlogin("souare", "133443");
		
	}
	
	@Test
	public void TestWithEmpty() throws InterruptedException {
		loginPage.testlogin("","");
	}
	
	@Test
	public void TestWithValidPassword() throws InterruptedException {
		loginPage.testlogin(email, "24332");
	}
}
