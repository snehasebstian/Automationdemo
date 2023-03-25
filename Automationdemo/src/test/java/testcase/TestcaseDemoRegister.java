package testcase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Basesetup.RegisterRadioButton;

public class TestcaseDemoRegister extends RegisterRadioButton {
	@Test(testName="Demoregister",priority=2)
	public void demoregisterradio() {
		List<WebElement> Radio = driver.findElements(By.xpath("//input[@type='radio']"));
		int size = Radio.size();

		System.out.println(size);

		for (int i = 0; i < size; i++) {
			String text = Radio.get(i).getAttribute("value");
			if (text.equalsIgnoreCase("FeMale")) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				Radio.get(i).click();
				Boolean Radiobutton=Radio.get(i).isSelected();
				Assert.assertTrue(Radiobutton);
			}
		}		
	}
	@Test(testName="Data",priority=1)
	public void getaData()
	{

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sneha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("sebastian");
		}
}
