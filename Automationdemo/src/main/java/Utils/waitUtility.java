package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitUtility {
	WebDriver driver;
	public void implicitWait(WebDriver driver,long time)
	{
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		
	}
	
	public void explicitWait(WebDriver driver,WebElement element,long time)
	{
		this.driver=driver;
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
