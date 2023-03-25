package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Basesetup.TestcaseExample;

@Test(testName = "alertverfiy")
public class AlertTest extends TestcaseExample {

	public void alertverfiy() {
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Alert alertclass = driver.switchTo().alert();

		alertclass.accept();
		alertclass.accept();

	}

}
