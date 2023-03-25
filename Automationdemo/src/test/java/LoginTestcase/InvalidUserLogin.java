package LoginTestcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Basesetup.LoginSetup;
import Pages.InvalidUserPage;
import Utils.ExcelRead;

public class InvalidUserLogin extends LoginSetup{
@Test(testName = "logindemo",priority=2, dataProvider = "incorrectuser",groups= {"SmokeTest"})
	
	public void getVerify(String user, String pass) throws IOException {
	InvalidUserPage invaliduser=new InvalidUserPage(driver);
	invaliduser.donotlogUser(user, pass);
		
//		driver.findElement(By.id("username")).sendKeys(user);
//		driver.findElement(By.id("password")).sendKeys(pass);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
		String expectedTitle = "Home - las";
		String actualTitle = driver.getTitle();
		SoftAssert verify = new SoftAssert();
		verify.assertEquals(expectedTitle, actualTitle);
	}
	@DataProvider(name = "incorrectuser")
	public Object[][] logindata() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Object[][] obj1= ExcelRead.getDataFromExcel("C:\\Users\\sneha\\eclipse-workspace2\\Demo_Testng\\src\\main\\resources\\ExcelFiles\\demologin.xlsx", "invaliduser");
		return obj1;
	}
	   


}
