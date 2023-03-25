package LoginTestcase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Basesetup.LoginSetup;
import Pages.validCredentialPage;
import Utils.ExcelRead;


public class ValidCredential extends LoginSetup{
	@Test(testName = "demo",priority=4, dataProvider = "TestDemologin",groups= {"SanityTest"})
	public void getLogin(String username, String password) throws IOException {
		validCredentialPage validuserpass=new validCredentialPage(driver);
		validuserpass.doLog(username, password);
		
//		driver.findElement(By.id("username")).sendKeys(username);
//	driver.findElement(By.id("password")).sendKeys(password);
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
		String expectedTitle = "Home - las";
		String actualTitle = driver.getTitle();
		SoftAssert verify = new SoftAssert();
		verify.assertEquals(expectedTitle, actualTitle);
	}
	@DataProvider(name = "TestDemologin")
	public Object[][] dataproviders() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Object[][] obj= ExcelRead.getDataFromExcel("C:\\Users\\sneha\\eclipse-workspace2\\Demo_Testng\\src\\main\\resources\\ExcelFiles\\demologin.xlsx", "logindemo");
		return obj;
	}
	@Test(testName="dashboard",priority=5,dataProvider="dashboarduser")
	   public void dashBoardpage(String FirstName,String lastname,String email,String user,String pass,String confirmpass) throws IOException
	   {
		driver.findElement(By.xpath("//button[contains(text(),'End tour')]")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-block btn-primary']")).click();
		driver.findElement(By.id("first_name")).sendKeys(FirstName);
		driver.findElement(By.id("last_name")).sendKeys(lastname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("confirm_password")).sendKeys(confirmpass);
		driver.findElement(By.id("submit_user_button")).click();
	   }
	@DataProvider(name="dashboarduser")
	public Object[][] datapeoviders() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Object[][] obj1= ExcelRead.getDataFromExcel("C:\\Users\\sneha\\eclipse-workspace2\\Demo_Testng\\src\\main\\resources\\ExcelFiles\\demologin.xlsx", "userpage");
		
		return obj1;
		
	}
}
