package Automation.Workday.PageObjectModel;

import org.openqa.selenium.By;
import org.testng.Reporter;

import Automation.Workday.BaseClass.BaseClass;

public class SandBox2 extends BaseClass {
	static By myApps = By.xpath("//div[normalize-space()='My Apps']");
	static By sandBox = By.xpath(
			"//*[@id=\"single-spa-application:@platform-ui/app-builder\"]/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div/div[1]/div/a/div[1]/div[1]/span");

	public void sandBox2() throws Exception {
		Thread.sleep(2000);
		driver.findElement(myApps).click();
		Reporter.log("myApps", false);
		Thread.sleep(2000);
		driver.findElement(sandBox).click();
		Reporter.log("sandBox", false);
		Thread.sleep(5000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://one.zuora.com/one-id/home")) {
			System.out.println("expected");
		}
		else {
			System.out.println("testing wrong");
		}
	}
}
