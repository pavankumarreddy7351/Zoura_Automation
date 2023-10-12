package Automation.Zuora.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import Automation.Zuora.BaseClass.BaseClass;

public class SandBox2 extends BaseClass {
	static By myApps = By.xpath("//div[normalize-space()='My Apps']");
	static By sandBox = By.xpath(
			"//*[@id=\"single-spa-application:@platform-ui/app-builder\"]/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div/div[2]/div/a");
	//static By launch = By.xpath("/html/body/div[12]/div[3]/ul/li[1]");
	public void sandBox2() throws Exception {
		Thread.sleep(2000);
		driver.findElement(myApps).click();
		Reporter.log("myApps", false);
		Thread.sleep(2000);
		driver.findElement(sandBox).click();
		Reporter.log("sandBox", true);
		//Thread.sleep(1900);
		//driver.findElement(launch).click();
		Thread.sleep(10000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://one.zuora.com/one-id/home")) {
			System.out.println("expected");
		}
		else {
			System.out.println("testing wrong");
		}
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
	}
}
