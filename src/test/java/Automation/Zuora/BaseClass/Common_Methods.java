package Automation.Zuora.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Common_Methods {
	public static WebDriver driver;
	public static Actions action;
	public static ChromeOptions options;
	public static WebElement Xpath(By Xpath) {
		return driver.findElement(Xpath);
	}

	public static void enterText(By Xpath, String text) {
		driver.findElement(Xpath).click();
		driver.findElement(Xpath).clear();
		driver.findElement(Xpath).sendKeys(text);
	}

	public static String getText(By Xpath) {
		return driver.findElement(Xpath).getText();
	}

	public static void click(By Xpath) {
		driver.findElement(Xpath).click();
	}

	public static void clear(By Xpath) {
		driver.findElement(Xpath).clear();
	}

	public static void getAttribute(By Xpath, String getText) {
		driver.findElement(Xpath).getAttribute(getText);
	}

	public String getURL() {
		return driver.getCurrentUrl();
	}

	public static void actionClick(By Xpath) {
		action = new Actions(driver);
		WebElement element = driver.findElement(Xpath);
		action.moveToElement(element).click().perform();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}
}
