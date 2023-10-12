package Automation.Zuora.ObjectManager;

import Automation.Zuora.BaseClass.BaseClass;
import Automation.Zuora.PageObjectModel.Account_Creation;
import Automation.Zuora.PageObjectModel.Accounts_Data;
import Automation.Zuora.PageObjectModel.Create_Order_Page;
import Automation.Zuora.PageObjectModel.Customer_Page;
import Automation.Zuora.PageObjectModel.LoginPage;
import Automation.Zuora.PageObjectModel.SandBox2;

public class Object_Manager extends BaseClass{
	public static LoginPage login=new LoginPage();
	public static SandBox2 sandbox2=new SandBox2();
	public static Customer_Page customer=new Customer_Page();
	public static Accounts_Data acc=new Accounts_Data();
	public static Account_Creation accCreation=new Account_Creation();
	public static Create_Order_Page orderPage=new Create_Order_Page();
	
	
}
