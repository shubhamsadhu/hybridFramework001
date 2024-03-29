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
  private ProductPage selectdropdownpage;
  private ProductPage selectdropdownpage1;
  private ItemDetailsPage itemDetailsPage;
	
   /*
    * 1.verify Title
    * 2.Click on dropdown
    * 3.select high to low
    * 4.fetch price of item 
    * 5.click on add to cart button
    */
  
  @BeforeMethod
  public void initialize() {
	  selectdropdownpage = new ProductPage();
	  itemDetailsPage = new ItemDetailsPage();
	  selectdropdownpage1 = new ProductPage();
  }
   
   @Test()
   public void verifytitle() {
		if(driver.getTitle().equals("Swag Labs")) {
			AssertJUnit.assertTrue(true);
			System.out.println(driver.getCurrentUrl());
		}else {
			System.out.println("title is wrong");
			AssertJUnit.assertTrue(false);
		}
   }
	
	
   
	@Test()
	public void selectDropdown() throws InterruptedException {
		
		selectdropdownpage.selectDropdown();
		selectdropdownpage.selectHighPriceItem();
		System.out.println(driver.getCurrentUrl());
		itemDetailsPage.AddtoCart();
		itemDetailsPage.ClickonBacktoProductBtn();	    
	    selectdropdownpage.ClickOnAddtoCart();
	    System.out.println("**drawer**");
	}
	
	@Test()
  public void selectlowestPriceitem() throws InterruptedException {

		selectdropdownpage1.selectlowtohigh();
		System.out.println("low to high filterd");
		
	}
	

}
