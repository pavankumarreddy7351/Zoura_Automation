package Automation.Workday.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties pro;

	@BeforeSuite
	public void launchApplication() {
		pro = new Properties();
		File proFile = new File(System.getProperty("user.dir")
				+ ".//src/test/java/Automation/Workday/Configuration/configuration.properties");
		try {
			FileInputStream fis = new FileInputStream(proFile);
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (pro.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (pro.getProperty("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Automation.Workday.Utilites.Utilites.PAGE_Load_TIME,
				TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Automation.Workday.Utilites.Utilites.IMPLICIT_WAIT_TIME,
				TimeUnit.SECONDS);
		driver.get(pro.getProperty("URL"));

	}

	@AfterSuite
	public void closeApplication() {
		driver.close();
		driver.quit();
	}
}
