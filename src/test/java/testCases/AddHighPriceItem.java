package testCases;



import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.ItemDetailsPage;
import pageObjects.ProductPage;


public class AddHighPriceItem extends BaseClass {
	//create object
   ProductPage selectdropdownpage;
   ItemDetailsPage itemDetailsPage;
	
   /*
    * 1.verify Title
    * 2.Click on dropdown
    * 3.select high to low
    * 4.fetch price of item 
    * 5.click on add to cart button
    */
	
	
	@Test()
	public void selectDropdown() throws InterruptedException {
		if(driver.getTitle().equals("Swag Labs")) {
			Assert.assertTrue(true);
			System.out.println(driver.getCurrentUrl());
		}else {
			System.out.println("title is wrong");
			Assert.assertTrue(false);
		}
		selectdropdownpage = new ProductPage();
		selectdropdownpage.selectDropdown();
		selectdropdownpage.selectHighPriceItem();
		System.out.println(driver.getCurrentUrl());
		itemDetailsPage = new ItemDetailsPage();
		itemDetailsPage.AddtoCart();
		itemDetailsPage.ClickonBacktoProductBtn();
//	    selectdropdownpage.GetTitleOfPage();
	    
	    selectdropdownpage.ClickOnAddtoCart();
	    System.out.println("**drawer**");
	
		
		
		
	}
	
	
	

}
