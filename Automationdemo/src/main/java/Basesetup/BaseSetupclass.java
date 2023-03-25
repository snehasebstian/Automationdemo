package Basesetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class BaseSetupclass {
	public static WebDriver driver;
	@BeforeTest
	public void browserLaunch()
	{

		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://demo.automationtesting.in/Register.html");
	}

}

