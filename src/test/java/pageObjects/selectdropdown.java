package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testCases.BaseClass;

public class selectdropdown extends BaseClass {
	
	
	WebElement selectdroppdownElement = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	WebElement highestPriceItemElement = driver.findElement(By.xpath("//div/a[@id='item_5_title_link']"));
	
	public void selectDropdown() {
		System.out.println("-----click on dropdown-----");
		Select select = new Select(selectdroppdownElement);
		select.selectByValue("hilo");
		System.out.println("----Select high to low-------");
	}
	
	public void selectHighPriceItem() throws InterruptedException {
		Thread.sleep(3);
		highestPriceItemElement.click();
	}
	
	
	
	
	
}
