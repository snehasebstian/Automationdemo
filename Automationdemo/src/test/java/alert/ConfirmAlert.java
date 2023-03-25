package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Basesetup.TestcaseExample;

@Test(testName = "comfirmalert")
public class ConfirmAlert extends TestcaseExample {
	public void simpleAlert() {
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		Alert comfirmalert = driver.switchTo().alert();
		String element = driver.switchTo().alert().getText();
		System.out.println(element);

		element.equalsIgnoreCase("This is a confirm alert. Do you want to accept or cancel?");
			
			comfirmalert.dismiss();
			System.out.println("You dismissed alert");
		}

	}
