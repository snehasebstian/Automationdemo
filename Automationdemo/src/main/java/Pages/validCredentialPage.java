package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class validCredentialPage {
	WebDriver driver;
	public validCredentialPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this); 
		this.driver = driver;
	}
	@FindBy(id="username")
	WebElement user;
	
	@FindBy(id="password")
	WebElement pass;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	public void doLog(String username,String password)
	{
		user.sendKeys(username);
		pass.sendKeys(password);
		submit.click();
	}
	
}
