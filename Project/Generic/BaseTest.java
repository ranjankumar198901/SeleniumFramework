package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public abstract class BaseTest implements Autoconst
{
	public WebDriver driver;
	
	@Parameters({ "Browser" })
	@BeforeMethod
	public void precondition(String Browser)
	{
		try
		{
			if(Browser.equalsIgnoreCase("FireFox"))
			{	
				System.setProperty(GECO_Key,GECKO_Value);
				driver = new FirefoxDriver();
			}
			else if (Browser.equalsIgnoreCase("chrome"))
			{	
				System.setProperty(Chrome_key, Chrome_value);
				driver= new ChromeDriver();
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
			driver.get("http://localhost");
		}
		catch (WebDriverException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
	}
	
}
