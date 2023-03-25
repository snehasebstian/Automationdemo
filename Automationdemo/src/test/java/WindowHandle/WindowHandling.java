package WindowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Basesetup.TestcaseExample;

public class WindowHandling extends TestcaseExample {
	@Test(testName = "windowhandle")
	public void verifyMutiplehandle() {
		//driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		driver.findElement(By.linkText("Click Here")).click();
		String MainWindow = driver.getWindowHandle();

		Set<String> list = driver.getWindowHandles();
		Iterator<String>element = list.iterator();

		while (element.hasNext()) {
			String ChildWindow = element.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				driver.switchTo().window(ChildWindow);
				driver.findElement(By.name("emailid")).sendKeys("sneha123@gmail.com");

				driver.findElement(By.name("btnLogin")).click();

				driver.close();
			}
		}

		driver.switchTo().window(MainWindow);
	}
}
