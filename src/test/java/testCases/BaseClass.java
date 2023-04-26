package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
	
	@BeforeMethod
	//select browser via TestNG.xml 
	public void setup() throws InterruptedException {
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
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		Logger log=LogManager.getLogger("logger demo");
		loginPage= new LoginPage();
		loginPage.testlogin(email, password);
		Thread.sleep(2000);
		
	}
	
	
	@AfterMethod
	public void Teardown() {
		System.out.println("Browser Closed");
		driver.quit();
	}
	
	
	
	public void waitForAppear(WebElement element1) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element1));
	}
	
	

}
