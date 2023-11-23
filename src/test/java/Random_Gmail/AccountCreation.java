package Random_Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Automation.Zuora.BaseClass.BaseClass;

public class AccountCreation extends BaseClass{
	@Test
	public void genrateMail() throws Exception {
		driver.get("https://accounts.google.com/signup/v2/createaccount?theme=glif&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.id("firstName")).sendKeys("Testing123");
		driver.findElement(By.cssSelector(".VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#day")).sendKeys("12");
		WebElement month=driver.findElement(By.id("month"));
		Select select=new Select(month);
		select.selectByVisibleText("May");
		driver.findElement(By.cssSelector("#year")).sendKeys("1998");
		
		WebElement gender=driver.findElement(By.id("gender"));
		Select select1=new Select(gender);
		select1.selectByVisibleText("Male");
		driver.findElement(By.cssSelector(".VfPpkd-vQzf8d")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='Username']")).sendKeys("Testing123");
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(2000);
		WebElement text=driver.findElement(By.cssSelector("button[class$='fBRZbb TrZEUc']:first-of-type"));
		String r=text.getText();
		System.out.println(r);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='Username']")).sendKeys(r);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("*Testing@1234");
		driver.findElement(By.xpath("//input[@name='PasswdAgain']")).sendKeys("*Testing@1234");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".VfPpkd-RLmnJb")).click();
		
		
		
	}

}
