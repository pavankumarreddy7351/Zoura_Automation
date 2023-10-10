package Automation.Workday.TestCases;

import org.testng.annotations.Test;

import Automation.Workday.ObjectManager.Object_Manager;

public class ZoruaTestCases extends Object_Manager {

	@Test(priority = 1)
	public static void loginPage() throws Exception {
		login.userName(pro.getProperty("username"), pro.getProperty("password"));

	}

	@Test(priority = 2)
	public void sandbox() throws Exception {
		sandbox2.sandBox2();
	}
}
