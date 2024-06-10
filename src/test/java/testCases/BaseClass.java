package testCases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageObjects.ItemDetailsPage;
import pageObjects.LoginPage;
import pageObjects.ProductPage;
import utils.Logger1;
import utils.ReadConfig;

public class BaseClass {
	
	//read data from properties file
	ReadConfig readconfig = new ReadConfig();
	public String baseurl = readconfig.readurlfromConfigFile();
	public String email = readconfig.readusernamefromConfigFile();
	public String password =readconfig.readpasswordfromConfigFile() ;
	Logger logger = LogManager.getLogger("LoggerDemo");
	public static WebDriver driver;
	public LoginPage loginPage;

	

	//select browser via TestNG.xml 
	@BeforeClass
	public WebDriver setup() throws InterruptedException {
		String br ="chrome";
		
		if(br.equalsIgnoreCase("chrome")) {
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver= new ChromeDriver(opt);
		}else if(br.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}else{
			System.out.println("Invalid browser name");
		}
		
		
		driver.get(baseurl);
		logger.info("test logger");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		Logger log=LogManager.getLogger("logger demo");
		loginPage= new LoginPage(driver);
		loginPage.testlogin(email, password);
		logger.debug("enter username password");
		Thread.sleep(2000);
		return driver;
		
	}
	

	
	
	@AfterClass
	public void Teardown() {
		System.out.println("Browser Closed");
		driver.quit();
	}
	
	

	
	

}
