package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseurl = "https://www.saucedemo.com/";
	public String email = "standard_user";
	public String password = "secret_sauce";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new EdgeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
	
	@AfterClass
	public void Teardown() {
		System.out.println("Browser Closed");
		driver.quit();
	}
	

}
