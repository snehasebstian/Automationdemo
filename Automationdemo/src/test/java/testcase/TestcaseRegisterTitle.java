package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import Basesetup.RegisterRadioButton;

public class TestcaseRegisterTitle extends  RegisterRadioButton {
	@Test(testName="title")
	public void registerdemo()
	{
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Register";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		
	}

}
