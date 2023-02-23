package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;


import testCases.BaseClass;
//product page is a home of this application
public class ProductPage extends BaseClass {
   Select select;
   Select select1;
	JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
	
	WebElement selectdroppdownElement = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	WebElement highestPriceItemElement = driver.findElement(By.xpath("//div/a[@id='item_5_title_link']"));
	WebElement getheader=driver.findElement(By.xpath("//div/span[@class='title']"));
	WebElement lowestPriceItemElement = driver.findElement(By.xpath("//div/a[@id='item_2_title_link']"));
	
	
	
	//
	public void selectDropdown() {
		select = new Select(selectdroppdownElement);
		select.selectByValue("hilo");
	}
	
	//filter item from low to high
	public void selectlowtohigh() throws InterruptedException {
		Thread.sleep(3);
		select1 = new Select(selectdroppdownElement);
		select1.selectByValue("lohi");
	}
	
	
	//click on item after filter
	public void selectHighPriceItem() throws InterruptedException {
		waitForWebelement(highestPriceItemElement);
		highestPriceItemElement.click();
	}
	
	//click on item after filter
	public void selectLowPriceItem() throws InterruptedException {
		waitForWebelement(lowestPriceItemElement);
		lowestPriceItemElement.click();
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
	
	
	public void ClickOnDrower() throws InterruptedException {
//		  new WebDriverWait(driver, Duration.ofSeconds(10)).ignoring(StaleElementReferenceException.class)
//		    .until(ExpectedConditions.elementToBeClickable(drawer));
	

		  try {
				WebElement drawer=driver.findElement(By.xpath("(//div/button)[1]"));
				  drawer.click();
			}
			catch(org.openqa.selenium.StaleElementReferenceException ex)
			{
				  WebElement drawer1=driver.findElement(By.xpath("(//div/button)[1]"));
				  drawer1.click();
			}
		  
		  

	}
	
	
	
	
	
}
