package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.LoginPage;
import utils.ReadConfig;

public class BaseClass {
	
	//read data from properties file
	ReadConfig readconfig = new ReadConfig();
	public String baseurl = readconfig.readurlfromConfigFile();
	public String email = readconfig.readusernamefromConfigFile();
	public String password =readconfig.readpasswordfromConfigFile() ;
	public static WebDriver driver;
	public LoginPage loginPage;
	
	@BeforeClass
	//select browser via TestNG.xml 
	public void setup() throws InterruptedException {
		String br ="chrome";
		
		if(br.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}else if(br.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}else{
			System.out.println("Invalid browser name");
		}
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	
	@AfterClass
	public void Teardown() {
		System.out.println("Browser Closed");
		driver.quit();
	}
	
	public  void loginTestCase() throws InterruptedException {
		loginPage= new LoginPage();
		Thread.sleep(2);
		loginPage.testlogin(email, password);
		System.out.println("login success");
	}
	
	
	public void waitForAppear(By findby) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
	}
	
	public void waitForWebelement(WebElement findby) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(findby));
	}
	

}
