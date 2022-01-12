package pomTest;

import org.testng.annotations.Test;

import pomPage.LoginPage;

public class LoginTest extends BaseTest{
 
	@Test
	public void loginToApp() {
		lp.loginWithValidInput();
		lp.enterPin();
	}
}
