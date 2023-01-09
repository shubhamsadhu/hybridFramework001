package testCases;

import org.testng.annotations.Test;




public class LoginTest extends BaseClass {
	
//	
	@Test
	public void starttest() throws InterruptedException {
		loginPage.testlogin("", password);
		loginPage.clearfields();
		loginPage.testlogin(email, password);
	}

}
