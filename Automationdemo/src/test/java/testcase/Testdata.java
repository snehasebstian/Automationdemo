package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Basesetup.LoginSetup;
import Utils.ScreenshootUtility;

public class Testdata extends LoginSetup{
	SoftAssert verify = new SoftAssert();

	@Test(testName = "valid", priority = 1)
	public void validLogin() throws IOException {
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("password")).clear();

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String expectedTitle = "Home - las";
		String actualTitle = driver.getTitle();
		SoftAssert verify = new SoftAssert();
		verify.assertEquals(expectedTitle, actualTitle);
		ScreenshootUtility.takeScreenshots();
		driver.findElement(By.xpath("//button[contains(text(),'End tour')]")).click();
	}
	@Test(testName = "Roles", priority = 2)
	public void rolePage() {
		driver.findElement(By.linkText("User Management")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Roles")).click();
		String expectedUrl = ("https://qalegend.com/billing/public/roles");
		String actualUrl = driver.getCurrentUrl();
		verify.assertEquals(actualUrl, expectedUrl);
	}
	@Test(testName = "Contacts", priority = 3)
	public void Contacts() {
		driver.findElement(By.linkText("Contacts")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Suppliers")).click();
		String expectedUrl = ("https://qalegend.com/billing/public/contacts?type=supplier");
		String actualUrl = driver.getCurrentUrl();
		verify.assertEquals(actualUrl, expectedUrl);

	}
	@Test(testName = "sell", priority = 5)
	public void sellPage() {
		driver.findElement(By.linkText("Sell")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("All sales")).click();
		String expectedUrl = ("https://qalegend.com/billing/public/sells");
		String actualUrl = driver.getCurrentUrl();
		verify.assertEquals(actualUrl, expectedUrl);

	}
	@Test(testName = "addsalePage", priority = 4)
	public void productPage() {
		driver.findElement(By.linkText("Products")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("List Products")).click();
		String expectedUrl = ("http://qalegend.com/billing/public/sells/create");
		String actualUrl = driver.getCurrentUrl();
		verify.assertEquals(actualUrl, expectedUrl);

	}
	@Test(testName = "purchasePage", priority = 6)
	public void purchasePage() {
		driver.findElement(By.linkText("Purchases")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("List Purchases")).click();
		String expectedUrl = ("http://qalegend.com/billing/public/purchases");
		String actualUrl = driver.getCurrentUrl();
		verify.assertEquals(actualUrl, expectedUrl);

	}
	@Test(testName = "userPage", priority = 7)
	public void userPage() {
		driver.findElement(By.linkText("User Management")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Users")).click();
		String expectedUrl = ("http://qalegend.com/billing/public/users");
		String actualUrl = driver.getCurrentUrl();
		verify.assertEquals(actualUrl, expectedUrl);
	}
		
}
	
	  
	   
