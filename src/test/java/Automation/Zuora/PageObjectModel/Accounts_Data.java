package Automation.Zuora.PageObjectModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Automation.Zuora.BaseClass.BaseClass;

public class Accounts_Data extends BaseClass{
	static By data=By.cssSelector("tbody.MuiTableBody-root.css-1xnox0e");
	public void accounting_Data() throws IOException {
		WebElement d=driver.findElement(data);
		String s=d.getText();
		System.out.println(s);
//		 File file =    new File("C:\\Users\\puchha.pavan\\Downloads.Data.xlsx");
//		 FileInputStream inputStream = new FileInputStream(file);
//		 HSSFWorkbook wb=new HSSFWorkbook(inputStream);
//		 HSSFSheet sheet=wb.getSheet("STUDENT_DATA");
//		 int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		 
	}
	
}
