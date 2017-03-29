package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import POM.LoginPage;

public class VerifyVersion extends BaseTest
{
	@Test
	public void testVerifyVersion()
	{
		LoginPage l = new LoginPage(driver);
		l.verifyversion("v. 3.1");
			
	}
}
