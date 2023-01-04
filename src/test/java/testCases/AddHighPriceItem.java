package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.selectdropdown;


public class AddHighPriceItem extends BaseClass {
	//create object
	selectdropdown selectdropdownpage;
	
	
	
	@Test(enabled = false)
	public void verifyTitleofLandingPage(){
		if(driver.getTitle().equals("Swag Labs")) {
			Assert.assertTrue(true);
			System.out.println(driver.getCurrentUrl());
		}else {
			System.out.println("title is wrong");
			Assert.assertTrue(false);
		}
	}
	
	@Test()
	public void selectDropdown() throws InterruptedException {
		selectdropdownpage = new selectdropdown();
		selectdropdownpage.selectDropdown();
		selectdropdownpage.selectHighPriceItem();
		System.out.println("Item is selected");
	}
	

}
