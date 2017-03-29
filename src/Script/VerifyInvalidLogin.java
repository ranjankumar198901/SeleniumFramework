package Script;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic.BaseTest;
import Generic.Excel;
import POM.LoginPage;

public class VerifyInvalidLogin extends BaseTest 
{
	@Test
	public void testVerifyInvalidLogin()
	{
		SoftAssert s = new SoftAssert();
		//Enter Invalid Un
		LoginPage l = new LoginPage(driver);
		
		int rc = Excel.getRowCount(INPUT_PATH, "VerifyInvalidLogin");
		System.out.println(rc);
		for(int i=1 ; i<=rc; i++)
		{
			System.out.println(i);
			String  un = Excel.GetCellValue(INPUT_PATH, "VerifyInvalidLogin", i, 0);
			String  pw = Excel.GetCellValue(INPUT_PATH, "VerifyInvalidLogin", i, 1);
			System.out.println(un);
			System.out.println(pw);
			//enter user name
			l.setusername(un);
		
			//Enter invalid password
			l.setpassword(pw);
		
			l.clicklogin();
		}
		//verify Error message
		l.verifyErrorIsPresent(s);
		s.assertAll();
	}
}
