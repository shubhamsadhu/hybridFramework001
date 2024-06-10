package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import abstractcomponents.ReusableComponents;
import testCases.BaseClass;
//product page is a home of this application
public class ProductPage extends ReusableComponents {
   Select select;
   Select select1;
   
   WebDriver driver;
   
   public ProductPage(WebDriver driver) {
	   super(driver);
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
   }
   
   @FindBy(xpath = "//div/button[text()=\"Open Menu\"]")
   WebElement clickondrawerElement;
   
   @FindBy(xpath = "//nav/a[text()='Logout']")
   WebElement clickonlogout;
   
   @FindBy(xpath = "//select[@class='product_sort_container']")
   WebElement clickondropdown;
   
   @FindBy(xpath = "//div/a[@id='item_5_title_link']")
   WebElement clickonHightolow;
   
   @FindBy(xpath = "//div/a[@id='item_2_title_link']")
   WebElement clickonlowtoHigh;

	
	
	
	//
	public void selectDropdown() {
		select = new Select(clickondropdown);
		select.selectByValue("hilo");
	}
	
	//filter item from low to high
	public void selectlowtohigh() throws InterruptedException {
		Thread.sleep(3);
		select1 = new Select(clickondropdown);
		select1.selectByValue("lohi");
	}
	
	
	//click on item after filter
	public void selectHighPriceItem() throws InterruptedException {
		waitforElementAppear(clickonHightolow);
		clickonHightolow.click();
	}
	
	
	public void ClickOnAddtoCart() {
		  try {
				WebElement clickOnAddToCart=driver.findElement(By.id("shopping_cart_container"));
				clickOnAddToCart.click();
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				WebElement clickOnAddToCart2=driver.findElement(By.id("shopping_cart_container"));
				clickOnAddToCart2.click();
			}
	}
	
	public void GetTitleOfPage() throws InterruptedException {
		  String getPgTitle=driver.getCurrentUrl();
	  System.out.println("Title of page : "+getPgTitle);
	}
	
	
	public void clickondrawer() throws InterruptedException {
		Thread.sleep(1000);
		clickondrawerElement.click();
		Thread.sleep(800);
		clickonlogout.click();
	}
	
	
	
	
	
}
