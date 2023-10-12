package Automation.Zuora.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Automation.Zuora.ObjectManager.Object_Manager;

public class ZoruaTestCases extends Object_Manager {

	@Test(priority = 1)
	public static void loginPage() throws Exception {
		login.userName(pro.getProperty("username"), pro.getProperty("password"));

	}

	@Test(priority = 2)
	public void sandbox() throws Exception {
		sandbox2.sandBox2();
	}

	@Test(priority = 3)
	public void customerDetails() throws Exception {
		customer.customerAcc();
	}
	@Test(priority = 4)
	public void accountDetails() throws IOException {
		acc.accounting_Data();
	}
	@Test(priority = 5)
	public void accountingCreate() throws Exception {
		accCreation.createAccount();
	}
	@Test(priority = 6)
	public void orderPage() throws Exception {
		orderPage.createOrder();
	}
	
}
