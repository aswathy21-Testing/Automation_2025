package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import pages.LoginPage;

public class LoginPageTest extends Base{
  @Test
  public void verifyValiUserAndValidPsswordCanAbleToLogin() {//program to enter username, passwd and click login
	 /* WebElement userName = driver.findElement(By.xpath("//input[@id='loginform-username']"));
	  userName.sendKeys("carol");
	  WebElement passWord = driver.findElement(By.xpath("//input[@id='loginform-password']"));
	  passWord.sendKeys("1q2w3e4r");
	  WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
	  login.click();*/
	  
	  LoginPage loginPage = new LoginPage(driver);//passing driver from Base class to the LoginPage class
	  loginPage.enterUsernameAndPassword("carol", "1q2w3e4r");
	  loginPage.clickLoginButton();
  }
  
  @Test
  public void verifyValidUserAndInvalidPasswordCanAbleToLogin() {//program to enter username, passwd and click login
		  LoginPage loginPage = new LoginPage(driver);
		  loginPage.enterUsernameAndPassword("carol", "1q2w3e4t");
		  loginPage.clickLoginButton();
	  }
  
  @Test
  public void verifyInvalidUserAndValidPasswordCanAbleToLogin() {//program to enter username, passwd and click login
		  LoginPage loginPage = new LoginPage(driver);
		  loginPage.enterUsernameAndPassword("arol", "1q2w3e4r");
		  loginPage.clickLoginButton();
	  }
  
  @Test
  public void verifyInvalidUserAndInvalidPasswordCanAbleToLogin() {//program to enter username, passwd and click login
		  LoginPage loginPage = new LoginPage(driver);
		  loginPage.enterUsernameAndPassword("arol", "1q2w3e4t");
		  loginPage.clickLoginButton();
	  }
  
  //Data Provider
  
  @Test(dataProvider = "Credentials")
  public void verifyUserCanAbleToLogin(String userName, String passWord) {//program to enter username, passwd and click login
		  LoginPage loginPage = new LoginPage(driver);
		  loginPage.enterUsernameAndPassword(userName, passWord);
		  loginPage.clickLoginButton();
	  }
  
  @DataProvider(name = "Credentials")
  public Object[][] testData(){//object is a class
	  Object[][] data = {{"carol", "1q2w3e4r"}, {"carol", "1q2w3e4t"}, {"arol", "1q2w3e4r"}, {"arol", "1q2w3e4t"}};//mulidmensional array
	  return data;
  }
  //Parameter
  
  @Test
  @Parameters({"userName", "passWord"})
  public void verifyUserCanAbleToLoginUsingParameterConcept(String userName, String passWord) {//program to enter username, passwd and click login
		  LoginPage loginPage = new LoginPage(driver);
		  loginPage.enterUsernameAndPassword(userName, passWord);//value pass through xml file that we created and thi ts run through xml file
		  loginPage.clickLoginButton();
	  }
  
}
