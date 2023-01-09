package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.selectdropdown;


public class AddHighPriceItem extends BaseClass {
	//create object
	selectdropdown selectdropdownpage;
	
	@Test(priority = 1)
	public void initialize() throws InterruptedException {
		loginTestCase();
	}
	
	@Test()
	public void selectDropdown() throws InterruptedException {
		if(driver.getTitle().equals("Swag Labs")) {
			Assert.assertTrue(true);
			System.out.println(driver.getCurrentUrl());
		}else {
			System.out.println("title is wrong");
			Assert.assertTrue(false);
		}
		selectdropdownpage = new selectdropdown();
		selectdropdownpage.selectDropdown();
		selectdropdownpage.selectHighPriceItem();
		System.out.println("Item is selected");
		
	}
	

}
