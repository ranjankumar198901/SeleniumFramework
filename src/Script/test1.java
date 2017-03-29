package Script;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class test1 
{
	@Test
	public void test() 
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost/login.do");

		
		
		
	
			WebDriverWait wait = new WebDriverWait(driver, 10);
			try
			{
				
				wait.until(ExpectedConditions.titleIs("actiTIME - Login"));
				Reporter.log("Title is matching ",true);
				
			}
			catch(TimeoutException e) 
			{
				Reporter.log("Title is not matching", true);
				Assert.fail();
			}
			
		}
		
	}

	

