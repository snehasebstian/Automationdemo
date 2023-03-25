package testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Basesetup.TestcaseExample;

public class FacebookTestcase extends TestcaseExample {
	@Test(testName = "facebooktestcase")

	public void facebooklanuch() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("snehasebastian234@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sneha123");
	}

}
