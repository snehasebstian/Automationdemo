package testcase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Basesetup.RegisterRadioButton;

public class Checkbox extends RegisterRadioButton {
	public void checkbox()
	{
	List <WebElement> Checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	int size = Checkboxes.size();
	System.out.println(size);
	for(int i=0;i<size;i++)
	{
		String text=Checkboxes.get(i).getAttribute("value");
		if(text.equalsIgnoreCase("Cricket"))
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Checkboxes.get(i).click();
			Boolean checkbox=Checkboxes.get(i).isSelected();
			Assert.assertTrue(checkbox);
		}
	}
	
}

}
