package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import constants.Constants;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginPageTest extends Base{
	
	@Test
	/*public void verifyUserAbleToLoginWithInvalidUserAndValidPassword() {// hard coded
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameAndPassword("Admin", "admin");
		loginPage.clickSignIn();
		boolean isHomePageLoaded = loginPage.isDashboardDisplayed();
		Assert.assertTrue(isHomePageLoaded, "Home page is not loaded");
	}
	
	public void verifyUserAbleToLoginWithInvalidUserAndValidPassword() {//use of Constants class
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameAndPassword("Admin", "admin");
		loginPage.clickSignIn();
		boolean isHomePageLoaded = loginPage.isDashboardDisplayed();
		Assert.assertTrue(isHomePageLoaded, Constants.ERRORMESSAGEFORLOGIN);
	}*/
  
	public void verifyUserAbleToLoginWithInvalidUserAndValidPassword() throws IOException {//read data from excel
		LoginPage loginPage = new LoginPage(driver);
		String userName = ExcelUtility.readStringData(3, 0, "LoginPageTest");// copy sheet name from excel sheet and paste here
		String passWord = ExcelUtility.readStringData(3, 1, "LoginPageTest");
		loginPage.enterUsernameAndPassword(userName, passWord);
		loginPage.clickSignIn();
		boolean isLoginAlertDisplayed = loginPage.isLoginAlertDisplayed();
		Assert.assertTrue(isLoginAlertDisplayed, Constants.ERRORMESSAGEFORLOGIN);
	}
  
	 //Data Provider
	
	  @Test(dataProvider = "Credentials")
	  public void verifyUserCanAbleToLoginwithInvalidPassword(String userName, String passWord) {
		  LoginPage loginPage = new LoginPage(driver);
		  loginPage.enterUsernameAndPassword(userName, passWord);
		  loginPage.clickSignIn();
		  boolean isHomePageLoaded = loginPage.isDashboardDisplayed();
		  Assert.assertTrue(isHomePageLoaded, "Home page is not loaded");
		  }
	  
	 
	@DataProvider(name = "Credentials")
	public Object[][] testData(){
		Object[][] data = {{"admin", "admin"}, {"Admin", "Admin"}};
		return data;
	}
	
	@Test
	@Parameters({"userName", "passWord"})
	public void verifyUserAbleTooginWithValidUserAndValidPassword(String userName, String passWord) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameAndPassword(userName, passWord);
		loginPage.clickSignIn();
		boolean isHomePageLoaded = loginPage.isDashboardDisplayed();
		Assert.assertTrue(isHomePageLoaded, "Home page is not loaded");
	}
}
