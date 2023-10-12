package Automation.Zuora.PageObjectModel;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Automation.Zuora.BaseClass.BaseClass;
import Automation.Zuora.Utilites.Utilites;

public class Account_Creation extends BaseClass {
	static By newAcc = By.linkText("Add New Account");
	static By p = By.xpath("//*[@id=\"_label_ParentCustomerId\"]");
	static By pa = By.xpath("//*[@id=\"8ac69b0e8a873499018a8d593db030d0\"]/b/font");
	static By acc = By.xpath("//*[@id='accountName']");
	static By fn = By.id("billToContact_firstName");
	static By ln = By.id("billToContact_lastName");
	static By email = By.id("billToContact_workEmail");
	static By c = By.id("billToContact_country");
	static By saveAcc = By.xpath("//*[@id=\"saveAcc\"]");

	public void createAccount() throws Exception {
		click(newAcc);
		Thread.sleep(1000);
		WebElement b = Xpath(p);
		b.sendKeys("RKN");
		Thread.sleep(1000);
		click(pa);
		Xpath(acc).sendKeys(Utilites.accName);
		Xpath(fn).sendKeys(Utilites.firstName);
		Xpath(ln).sendKeys(Utilites.lastNname);
		Xpath(email).sendKeys(Utilites.random_EmailID());
		WebElement c1 = Xpath(c);
		Select dd = new Select(c1);
		dd.selectByVisibleText("India");
		click(saveAcc);
		Thread.sleep(8000);

	}
}
