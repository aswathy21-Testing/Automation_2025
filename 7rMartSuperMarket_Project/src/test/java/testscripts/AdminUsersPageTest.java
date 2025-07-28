package testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;

public class AdminUsersPageTest extends Base {
	HomePage homePage;
	AdminUsersPage adminUsersPage;

	@Test
	public void createNewUser() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameAndPassword("admin", "admin");
		homePage = loginPage.clickSignIn();
		adminUsersPage = homePage.clickOnadminUsersMoreInfo();
		adminUsersPage.clickOnNew().enterUserNameAndPassword("a11a", "a11a@123").selectUserType("admin").clickSave();

		/*
		 * AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		 * adminUsersPage.clickOnadminUsersMoreInfo(); adminUsersPage.clickOnNew();
		 * adminUsersPage.enterUserNameAndPassword("aswasw", "aswathy111");
		 * adminUsersPage.selectUserType("admin"); adminUsersPage.clickSave();
		 */

		boolean isNewUserCreated = adminUsersPage.isAlertDisplayed();
		Assert.assertTrue(isNewUserCreated, "Error in creating new user");
	}

	// test case to check whether user able to delete a user from Admin Users
	@Test
	public void deleteAdminUser() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameAndPassword("admin", "admin");
		homePage = loginPage.clickSignIn();
		adminUsersPage = homePage.clickOnadminUsersMoreInfo();
		adminUsersPage.clickOnDeleteButton();
		boolean isUserDeleted = adminUsersPage.isDeleteSuccessAlertDisplayed();
		Assert.assertTrue(isUserDeleted, "Error");
	}

	// test case to check whether user able to update user info
	@Test
	public void updateUserInformation() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameAndPassword("admin", "admin");
		homePage = loginPage.clickSignIn();
		adminUsersPage = homePage.clickOnadminUsersMoreInfo();
		adminUsersPage.clickOnEditUserInfoButton().selectUserType("admin").clickOnUpdateButton();
		boolean isUserInfoUpdated = adminUsersPage.isUpdateSuccessAlertDisplayed();
		Assert.assertTrue(isUserInfoUpdated, "Error");

	}

	//test case to check whether user is able to change the status
	@Test
	public void changeStatusOfUser() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameAndPassword("admin", "admin");
		homePage = loginPage.clickSignIn();
		adminUsersPage = homePage.clickOnadminUsersMoreInfo();
		adminUsersPage.clickOnStatusChangeButton();
		boolean isUserStatusChanged = adminUsersPage.isStatusChangeAlertDisplayed();
		Assert.assertTrue(isUserStatusChanged, "Error");

	}
}
