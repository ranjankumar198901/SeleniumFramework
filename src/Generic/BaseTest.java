package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconst
{
	public WebDriver driver;
	
	@BeforeMethod
	public void precondition()
	{
		System.setProperty(GECO_Key,GECKO_Value);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://localhost");
	}
	
	@AfterMethod
	public void postcondition()
	{
		driver.quit();
	}
	
}
