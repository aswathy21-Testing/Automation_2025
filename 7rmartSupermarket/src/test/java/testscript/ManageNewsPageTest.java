package testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsPageTest extends Base{
  @Test
  public void isAbleToCreatNewNewsInfo() {
	  LoginPage loginPage = new LoginPage(driver);
	  loginPage.enterUsernameAndPassword("admin", "admin");
	  loginPage.clickSignIn();
	  
	  ManageNewsPage manageNewsPage = new ManageNewsPage(driver);
	  manageNewsPage.clickManageNewsTile();
	  manageNewsPage.clickNewLink();
	  manageNewsPage.enterNews();
	  manageNewsPage.clickSaveButton();
	  boolean isNewNewsCreated = manageNewsPage.isalertSuccessDisplayed();
	  Assert.assertTrue(isNewNewsCreated, "Error in creating new News");
  }
}
