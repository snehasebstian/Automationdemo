package Basesetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class TestcaseExample {
	public static WebDriver driver;

	@BeforeTest
	public void TestLaunch() {
		//int a=10;
		
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");		
		driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://demo.guru99.com/test/delete_customer.php");
		//driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.get("https://demo.guru99.com/popup.php");
		//driver.get("https://demoqa.com/browser-windows");
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}

}
