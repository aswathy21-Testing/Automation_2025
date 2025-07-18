package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;

public class AdminUsersPageTest extends Base{
  @Test
  public void createNewUser() {
	 LoginPage loginPage = new LoginPage(driver);
	 loginPage.enterUsernameAndPassword("admin", "admin");
	 loginPage.clickSignIn();
	 
	 AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
	 adminUsersPage.clickOnadminUsersMoreInfo();
	 adminUsersPage.clickOnNew();
	 adminUsersPage.enterUserNameAndPassword("aswasw", "aswathy111");
	 adminUsersPage.selectUserType("admin");
	 adminUsersPage.clickSave();
	 
	 boolean isNewUserCreated = adminUsersPage.isAlertDisplayed();
	 Assert.assertTrue(isNewUserCreated, "Error in creating new user");
  }
}
