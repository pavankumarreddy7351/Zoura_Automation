package Automation.Zuora.PageObjectModel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import Automation.Zuora.BaseClass.BaseClass;

public class Create_Order_Page extends BaseClass{
//static By cd=By.xpath("//*[@id=\"z-action-nav\"]/li[2]/a/span");
	static By cd=By.xpath("//a[@class='button-style-1']//span[contains(text(),'create order')]");
//static By sub=By.xpath("/html/body/z-unified-nav-v2/div/app-order/div/div/div/oui-create-order/oui-subscription-view/div[1]/oui-subscription-list/div[1]/div/button[1]");
	static By sub=By.xpath("//button[text()=' Create subscription']");
//static By con=By.xpath("/html/body/z-unified-nav-v2/div/app-order/div/div/div/oui-create-order/oui-create-subscription-ui/div/form/div[7]/button[3]");
	static By con=By.xpath("//button[@data-e2e='continue']");
//static By search=By.xpath("/html/body/z-unified-nav-v2/div/app-order/div/div/div/oui-create-order/oui-add-rateplan/div[1]/oui-product-search/div/div[2]/zui-search/div/div/input");
	static By search=By.xpath("//input[@name='query']");
//static By five=By.xpath("/html/body/z-unified-nav-v2/div/app-order/div/div/div/oui-create-order/oui-add-rateplan/div[1]/oui-product-search/oui-product-list/div/zui-table/zui-row-group/zui-row/zui-cell[1]/span");
	static By five=By.xpath("//span[@data-e2e='product-toggle']");
//static By check=By.xpath("//*[@id=\"8ac680458a6a8e01018a6c023f7c617c\"]/label/span");
	static By check=By.xpath("(//span[@class='indicator'])[1]");
//static By add=By.xpath("/html/body/z-unified-nav-v2/div/app-order/div/div/div/oui-create-order/oui-add-rateplan/div[2]/button[3]");
	static By add=By.xpath("//button[normalize-space()='Add Product']");
//static By review=By.xpath("/html/body/z-unified-nav-v2/div/app-order/div/div/div/oui-create-order/oui-subscription-ui-rateplan/div[2]/button[2]");
	static By review=By.xpath("//button[contains(text(),'Review Order')]");
//static By active=By.xpath("/html/body/z-unified-nav-v2/div/app-order/div/div/div/oui-create-order/oui-subscription-view/div[2]/button[4]");
	static By active=By.xpath("//button[contains(text(),'Activate')]");
	static By sublist=By.xpath("/html/body/z-unified-nav-v2/div/app-order/div/div/div/oui-order-view/oui-subscription-view/div/oui-subscription-list/div[2]/oui-subscription/div[1]/div/a");
	//static By sublist=By.xpath("a[data-e2e='subscription-link']");
//static By creatBill=By.xpath("//*[@id=\"single-spa-application:@platform-ui/subscription\"]/div/z-unified-nav-v2/div[2]/div/div[1]/div[2]/div[1]/button/span[1]");
	static By creatBill=By.xpath("//span[text()='Create Bill Run']");
//static By run=By.xpath("//*[@id=\"create-bill-run-header-line\"]/div/div/div[1]/div[2]/div[2]/button/span[1]");
	static By run=By.xpath("(//button[@type='button'])[3]");
//static By yes=By.xpath("/html/body/div[7]/div[3]/div/div[3]/div/button[2]");
	static By yes=By.xpath("//span[normalize-space()='Yes']");
public void createOrder() throws InterruptedException {
	driver.findElement(cd).click();
	Thread.sleep(5000);
	driver.findElement(sub).click();
	Thread.sleep(5000);
	driver.findElement(con).click();
	Thread.sleep(5000);
	driver.findElement(search).sendKeys("Five9 Agent Assist");
	Thread.sleep(5000);
	driver.findElement(five).click();
	Thread.sleep(5000);
	
	driver.findElement(check).click();
	Thread.sleep(5000);
	driver.findElement(add).click();
	Thread.sleep(5000);
	driver.findElement(review).click();
	Thread.sleep(5000);
	driver.findElement(active).click();
	Thread.sleep(5000);
	driver.findElement(sublist).click();
	Thread.sleep(5000);
	driver.findElement(creatBill).click();
	Thread.sleep(5000);
	driver.findElement(run).click();
	Thread.sleep(5000);
	driver.findElement(yes).click();
	Thread.sleep(5000);
	
	
	
}
}
