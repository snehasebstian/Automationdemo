package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Basesetup.BaseSetupclass;

public class TestCaseClass extends BaseSetupclass
{
	@Test(testName="demotest")
	
	public void demotestcase()
	{

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sneha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("sebastian");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Muthuplackal");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("sneha123@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("6282882923");
	}
}
