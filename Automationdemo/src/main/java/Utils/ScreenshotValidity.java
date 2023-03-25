package Utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Basesetup.TestcaseExample;



public class ScreenshotValidity  extends TestcaseExample //LoginSetup// 
{
	public static void takescreenshotsmethod() throws IOException {
		DateFormat dateFormat=new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss");
		Date datetime=new Date();
		TakesScreenshot screenshot1=(TakesScreenshot)driver;
		File file= screenshot1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\sneha\\eclipse-workspace2\\Demo_Testng\\src\\main\\resources\\Screenshots" +dateFormat.format(datetime)+".png"));
	}

		 
		 }

	

