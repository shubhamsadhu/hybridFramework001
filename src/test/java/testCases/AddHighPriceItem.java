package testCases;




import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.ItemDetailsPage;
import pageObjects.ProductPage;


public class AddHighPriceItem extends BaseClass {
	//create object
private ItemDetailsPage itemDetailsPage;
private ProductPage productPage;

	
   /*
    * 1.verify Title
    * 2.Click on dropdown
    * 3.select high to low
    * 4.fetch price of item 
    * 5.click on add to cart button
    */
  
	  @BeforeMethod
	  public void objectinitialize() {
		  
		  
	}

   
   @Test(description = "To validate title of application")
   public void verifytitle() {
		if(driver.getTitle().equals("Swag Labs")) {
			AssertJUnit.assertTrue(true);
			System.out.println(driver.getCurrentUrl());
		}else {
			System.out.println("title is wrong");
			AssertJUnit.assertTrue(false);
		}
   }
	
	
   
	@Test(description = "To validate sorting of product")
	public void selectDropdown() throws InterruptedException {
		productPage = new ProductPage();
		productPage.selectDropdown();
		productPage.selectHighPriceItem();
		System.out.println(driver.getCurrentUrl());
		itemDetailsPage = new ItemDetailsPage();
		itemDetailsPage.AddtoCart();
		itemDetailsPage.ClickonBacktoProductBtn();	    
	    productPage.ClickOnAddtoCart();
	    System.out.println("**drawer**");
	}
	
	@Test(enabled = false)
  public void selectlowestPriceitem() throws InterruptedException {

//		selectdropdownpage1.selectlowtohigh();
		System.out.println("low to high filterd");
		
	}
	

}
