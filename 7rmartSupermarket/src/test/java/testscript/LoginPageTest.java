package testscript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pages.LoginPage;

public class LoginPageTest extends Base{
	
	@Test
	public void verifyUserAbleToLoginWithInvalidUserAndValidPassword() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsernameAndPassword("Admin", "admin");
		loginPage.clickSignIn();
		boolean isHomePageLoaded = loginPage.isDashboardDisplayed();
		Assert.assertTrue(isHomePageLoaded, "Home page is not loaded");
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
		Object[][] data = {{"admin", "Admin"}, {"Admin", "Admin"}};
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
