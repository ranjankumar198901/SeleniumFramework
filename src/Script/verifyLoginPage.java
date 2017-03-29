package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Excel;
import POM.LoginPage;

public class verifyLoginPage extends BaseTest
{
	@Test
	public void testVerifyLoginPage()
	{
		
		LoginPage l = new LoginPage(driver);
		//l.verifyTitle("actiTIME - Login");
		
		String eTitle = Excel.GetCellValue(INPUT_PATH, "verifyLoginPage", 1, 0);
		l.verifyTitle(eTitle);
	}
}
