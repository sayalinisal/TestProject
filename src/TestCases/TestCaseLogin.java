package TestCases;

import org.testng.annotations.Test;

import Actions.LoginActions;
import Actions.Logout;
import Utilities.BaseClass;

public class TestCaseLogin extends BaseClass{
	
	LoginActions loginActions = new LoginActions();
	Logout logout = new Logout();
	
	String username = "sayalinisal139@gmail.com";
	String password = "sayali";
	
	@Test(priority=1)
	//@Parameters({"username","password"})
	public void loginToApp() throws InterruptedException {
		
		loginActions.clickOnSignInButton(driver);
		loginActions.enterUserName(username, driver);
		loginActions.enterPassword(password, driver);
		loginActions.clickOnLogInField(driver);
		
	}
	
	@Test(priority=2)
	public void signoutapp() throws InterruptedException {
		logout.LogoutApp("", driver);
	}

}
