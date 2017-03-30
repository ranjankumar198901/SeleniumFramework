package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.BasePage;

public class EnterTimeTrackPage extends BasePage
{
	
	@FindBy(xpath = "//a[.='Logout']")
	public WebElement logoutlink;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void clicklogout()
	{
		logoutlink.click();
	}

}
