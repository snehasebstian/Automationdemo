package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Basesetup.LoginSetup;
import Utils.ScreenshotValidity;


public class Testcasevalidate extends LoginSetup{
	
		SoftAssert verify = new SoftAssert();

		@Test(testName = "valid", priority = 1)
		public void validLogin() throws IOException {
			driver.findElement(By.id("username")).clear();
			driver.findElement(By.id("password")).clear();

			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("password")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			String expectedTitle = "Home - las";
			String actualTitle = driver.getTitle();
			SoftAssert verify = new SoftAssert();
			verify.assertEquals(expectedTitle, actualTitle);
			
			driver.findElement(By.xpath("//button[contains(text(),'End tour')]")).click();
		}
		@Test(testName = "Roles", priority = 2)
		public void rolePage() throws IOException {
			driver.findElement(By.linkText("User Management")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.linkText("Roles")).click();
			String expectedUrl = ("https://qalegend.com/billing/public/roles");
			String actualUrl = driver.getCurrentUrl();
			verify.assertEquals(actualUrl, expectedUrl);
			ScreenshotValidity.takescreenshotsmethod();
		}
		}
			


