package POM;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Generic.BasePage;

public class LoginPage extends BasePage 
{

	@FindBy(name ="username")
	private WebElement UnTB;
	
	@FindBy(name = "pwd")
	private WebElement PwTB;
	
	@FindBy(xpath = "//a[.='Login']")
	private WebElement LoginBtn;
	
	@FindBy(xpath = "//span[contains(., 'invalid')]")
	private WebElement errmsg;
	
	@FindBy(xpath ="//nobr[contains(.,'v')]")
	private WebElement Strversion;
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
	public void setusername(String Un)
	{
		UnTB.sendKeys(Un);
	}

	public void setpassword(String pwd)
	{
		PwTB.sendKeys(pwd);
	}
	
	public void clicklogin()
	{
		LoginBtn.click();
	}
	
	public void verifyversion(String eversion)
	{
		String aversion = Strversion.getText();
		Assert.assertEquals(aversion, eversion);
	}
	
	public void verifyErrorIsPresent(SoftAssert s)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
			try
		{
				
				wait.until(ExpectedConditions.visibilityOf(errmsg));
				Reporter.log("Error Message is Displayed",true);
		}
		catch(TimeoutException e)
		{
				Reporter.log("Error Message is not displated ");
				s.fail();
		}
	}
}
