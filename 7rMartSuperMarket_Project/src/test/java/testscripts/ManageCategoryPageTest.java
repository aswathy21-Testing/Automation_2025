package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryPageTest extends Base {
	HomePage homePage;
	ManageCategoryPage managePage;
	
	
	@Test
	public void checkUserAbleToAddNewCategory() throws IOException {
		LoginPage loginPage = new LoginPage(driver);
		String userName = ExcelUtility.readStringData(1, 0, "LoginPageTest");// copy sheet name from excel sheet and paste here
		String passWord = ExcelUtility.readStringData(1, 1, "LoginPageTest");																		// paste here
		loginPage.enterUsernameAndPassword(userName, passWord);
		homePage = loginPage.clickSignIn();
		
		managePage = homePage.clickOnManageCategoryMoreInfo();
		managePage.clickOnNewLink().inputCategory("testCategory1").dragAndDropSelectGroup().uploadFile().clickOnYesOfTopMenu().clickOnNosOfLeftMenu().clickOnSaveButton();


			}
}
