package DemoExcelread;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Basesetup.BaseSetupclass;
import Utils.ExcelRead;
import Utils.ScreenshootUtility;

public class Demoregister extends BaseSetupclass {
	@Test(testName = "demoregister", dataProvider = "TestDemoregister")
	public void registerdata(String FirstName, String LastName, String Adress, String EmailAdress) throws IOException {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input [@placeholder='Last Name']")).sendKeys(LastName);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(Adress);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(EmailAdress);
		ScreenshootUtility.takeScreenshots();
	}

	@DataProvider(name = "TestDemoregister")
	public Object[][] dataproviders() throws EncryptedDocumentException, InvalidFormatException, IOException {
		Object[][] obj = ExcelRead.getDataFromExcel(
				"C:\\Users\\sneha\\eclipse-workspace2\\Demo_Testng\\src\\main\\resources\\ExcelFiles\\registerdemo.xlsx",
				"demoregister");
		return obj;
	}

}
