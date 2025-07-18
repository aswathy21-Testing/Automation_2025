package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest extends Base{
  @Test
  public void userAbleToLogout() {
	  LoginPage loginPage = new LoginPage(driver);
	  loginPage.enterUsernameAndPassword("admin", "admin");
	  loginPage.clickSignIn();
	  
	  HomePage homePage = new HomePage(driver);
	  homePage.clickAdmin();
	  homePage.clickLogout();
	 // System.out.println(driver.getTitle()); to get the title
	  String expected = "Login | 7rmart supermarket";
	  String actual = driver.getTitle();
	  Assert.assertEquals(expected, actual, "Error");
  }
}
