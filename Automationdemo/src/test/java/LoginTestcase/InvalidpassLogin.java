package LoginTestcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Basesetup.LoginSetup;
import Pages.Invalidpass;
import Utils.ExcelRead;

public class InvalidpassLogin extends LoginSetup {
	@Test(testName = "logindemo", priority=3,dataProvider = "Incorrectpass",groups= {"SanityTest"})
	
	public void getVerify(String user, String pass) throws IOException {
		Invalidpass invalidpassword=new Invalidpass(driver);
		invalidpassword.donotlogPass(user, pass);
		
//		driver.findElement(By.id("username")).sendKeys(user);
//		driver.findElement(By.id("password")).sendKeys(pass);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
		String expectedTitle = "Home - las";
		String actualTitle = driver.getTitle();
		SoftAssert verify = new SoftAssert();
		verify.assertEquals(expectedTitle, actualTitle);
	}
	@DataProvider(name = "Incorrectpass")
	public Object[][] logindata() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Object[][] obj1= ExcelRead.getDataFromExcel("C:\\Users\\sneha\\eclipse-workspace2\\Demo_Testng\\src\\main\\resources\\ExcelFiles\\demologin.xlsx", "loginsheet");
		return obj1;
	}
	   

}
