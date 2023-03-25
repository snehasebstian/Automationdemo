package Pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class InvalidUserPage {
		WebDriver driver;
		public InvalidUserPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this); 
			this.driver = driver;
		}
		@FindBy(id="username")
		WebElement username;
		
		@FindBy(id="password")
		WebElement password;
		@FindBy(xpath="//button[@type='submit']")
		WebElement submit;
		public void donotlogUser(String user,String pass)
		{
			username.sendKeys(user);
			password.sendKeys(pass);
			submit.click();
		}


}
