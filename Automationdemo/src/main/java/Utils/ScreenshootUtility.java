package Utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Basesetup.BaseSetupclass;
//import Basesetup.LoginSetup;

public class ScreenshootUtility extends BaseSetupclass{
	public static void takeScreenshots() throws IOException {
		DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyy");
		Date date=new Date();
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File file= screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\sneha\\eclipse-workspace2\\Demo_Testng\\src\\main\\resources\\Screenshots" +dateFormat.format(date)+".png"));
	}

}
