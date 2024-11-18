package applicationLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogout 
{
//define Repository
	@FindBy(xpath="//a[@id='welcome']")
	WebElement clickWelcome;
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement clickLogout;

	//method for Logout
	public void verifyLogout() throws Throwable
	{
		
		clickWelcome.click();
		Thread.sleep(2000);
		clickLogout.click();
		
	}
}
