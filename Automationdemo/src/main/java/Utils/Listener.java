package Utils;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Basesetup.LoginSetup;

public class Listener  extends LoginSetup implements ITestListener {
	
public void onTestStart(ITestResult result) {
		
	}
	
	public void onTestSuccess(ITestResult result) {
		try {
			ScreenshootUtility.takeScreenshots();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public void onTestFailure(ITestResult result) {
		
		try {
			ScreenshootUtility.takeScreenshots();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result) {
		
	}
	
	public void onTestFaileButWithinSuccessPercentage(ITestResult result) {
		
	}
	
	public void onStart(ITestContext context) {
		
	}
	
	public void onFinish(ITestContext context) {
		
	}

}
