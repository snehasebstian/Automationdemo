package DemoExcelread;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Basesetup.LoginSetup;
import Pages.LoginPageFactory;
import Utils.ExcelRead;
import Utils.ScreenshootUtility;

public class Loginerexceldata extends LoginSetup{
	@Test(testName = "demo", dataProvider = "TestDemologin")
	public void excelreads(String user, String pass) throws IOException {
		LoginPageFactory loginpage=new LoginPageFactory(driver);
		loginpage.dologin(user, pass);
		
//		driver.findElement(By.id("username")).sendKeys(user);
//		driver.findElement(By.id("password")).sendKeys(pass);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
	}
	

	@DataProvider(name = "TestDemologin")
	public Object[][] dataproviders() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Object[][] obj= ExcelRead.getDataFromExcel("C:\\Users\\sneha\\eclipse-workspace2\\Demo_Testng\\src\\main\\resources\\ExcelFiles\\demologin.xlsx", "logindemo");
		return obj;
	}
}

	
