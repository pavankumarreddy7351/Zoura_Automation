package Automation.Zuora.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Automation.Zuora.BaseClass.BaseClass;

public class Customer_Page extends BaseClass {
	static By customer = By.cssSelector("div.css-5nflrw");
	static By aa = By.linkText("View All Accounts");

	public void customerAcc() throws Exception {
		WebElement e = driver.findElement(customer);
		action.moveToElement(e).build().perform();
		Thread.sleep(2000);
//		WebElement a = driver.findElement(aa);
//		action.moveToElement(a).click();
//		Thread.sleep(8000);
		driver.findElement(aa).click();
		Thread.sleep(3000);

	}

}
