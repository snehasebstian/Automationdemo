package alert;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Basesetup.TestcaseExample;
import Utils.ScreenshotValidity;
@Test(testName="promptalert")

public class PromptAlert extends TestcaseExample{
	public void promptalert() throws IOException
	{ 
		WebElement element =driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
		element.click();
		Alert alert = driver.switchTo().alert(); 
		 alert.sendKeys("yes");
		 alert.accept();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 ScreenshotValidity.takescreenshotsmethod();
		 
	  }
	
	}


