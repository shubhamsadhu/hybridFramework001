package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;




public class LoginTest extends BaseClass {
	
//	
	@Test
	public void starttest() throws InterruptedException {
		loginPage.testlogin(email, password);
	}

}
