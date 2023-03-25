package LoginTestcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Basesetup.LoginSetup;
import Pages.Loginconditions;
import Utils.ExcelRead;

public class InvalidCredential extends LoginSetup {
	@Test(testName = "invalid sign",priority=1, dataProvider = "invalid details",groups= {"SmokeTest"})
	public void getLogin(String username, String password) throws IOException {
		Loginconditions donotlog=new Loginconditions(driver);
		donotlog.donotLogin(username, password);
		
//		driver.findElement(By.id("username")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
		String expectedTitle = "Home - las";
		String actualTitle = driver.getTitle();
		SoftAssert verify = new SoftAssert();
		verify.assertEquals(expectedTitle, actualTitle);
	}
	@DataProvider(name = "invalid details")
	public Object[][] dataproviders() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Object[][] obj= ExcelRead.getDataFromExcel("C:\\Users\\sneha\\eclipse-workspace2\\Demo_Testng\\src\\main\\resources\\ExcelFiles\\demologin.xlsx","invalid userpass");
		return obj;
	}

}
