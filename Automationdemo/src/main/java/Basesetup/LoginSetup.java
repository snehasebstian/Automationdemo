package Basesetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
///import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import constants.Constant;
//import org.testng.annotations.BeforeTest;

public class LoginSetup {
	public static WebDriver driver;
	public static Properties property;
	
    @Parameters({"browsers"})
	@BeforeClass(alwaysRun = true)

	public void urllanuch(String browsers) throws Exception   {
    	property = new Properties();
    	FileInputStream input = new FileInputStream(System.getProperty("user.dir")+Constant.CONFIGfILE);
    	property.load(input);
	switch (browsers){
	
	case "chrome":
		System.setProperty(Constant.CHROMEDRIVER,property.getProperty("chromefilepath"));
		 driver=new ChromeDriver();
		driver.manage().window().maximize();	
		break;
		
	case "firefox":
		System.setProperty(Constant.FIREFOXDRIVER,property.getProperty("firefoxfilepath"));
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();	
		break;
		
	case "edge":
		System.setProperty(Constant.EDGEDRIVER, property.getProperty("edgefilepath"));
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		break;
		
		default:
			System.out.println("invalid driver");
	}
	
	driver.get("http://qalegend.com/billing/public/login");
		String title = driver.getTitle();
		System.out.print(title);
		
	}

}
