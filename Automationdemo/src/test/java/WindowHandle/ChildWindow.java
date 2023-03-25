package WindowHandle;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Basesetup.TestcaseExample;
@Test

public class ChildWindow extends TestcaseExample{
	public void childwindow()
	{
		driver.findElement(By.linkText("Click Here")).click();
		String MainWindow = driver.getWindowHandle();

		List<String> windowhandles=new ArrayList<String>(driver.getWindowHandles());
		Iterator<String>element = windowhandles.iterator();

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
