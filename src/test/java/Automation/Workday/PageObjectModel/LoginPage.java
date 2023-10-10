package Automation.Workday.PageObjectModel;

import org.openqa.selenium.By;
import org.testng.Reporter;

import Automation.Workday.BaseClass.BaseClass;

public class LoginPage extends BaseClass{
	static By userName=By.xpath("//*[@id='mui-2']");
	static By passWord=By.xpath("//*[@id='mui-5']");
	static By checkBox=By.xpath("//*[@class='PrivateSwitchBase-input css-1m9pwf3']");
	static By sign=By.xpath("//*[@id=\"login_card-body\"]/div/div[6]/button");
	public  void userName(String username,String password) throws Exception {
		driver.findElement(userName).sendKeys(username);
		Reporter.log("userName",true);
		driver.findElement(passWord).sendKeys(password);
		Reporter.log("passWord",true);
		driver.findElement(checkBox).click();
		Reporter.log("checkBox",true);
		driver.findElement(sign).click();
		Reporter.log("sign",true);
		Thread.sleep(2000);
	}
	

}
