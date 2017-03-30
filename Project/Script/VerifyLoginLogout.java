package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import POM.EnterTimeTrackPage;
import POM.LoginPage;

public class VerifyLoginLogout extends BaseTest 
{
	@Test
	public void testVerifyLoginLogout()
	{
		//Enter valid un
		LoginPage l = new LoginPage(driver);
		l.setusername("admin");
		
		// enter valid password
		l.setpassword("manager");
		
		//click on Login
		l.clicklogin();
		
		//verify homepapge is displayed
		EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
		e.verifyTitle("actiTIME - Enter Time-Track");
		
		//click logout
		e.clicklogout();
		
		
		
	}
}
