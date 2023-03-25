package Basesetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import constants.Constant;



public class RegisterRadioButton {
	public static WebDriver driver;
	@BeforeTest
	public void urllanuch()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}	

}
