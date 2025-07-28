package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WaitUtility;

public class LoginPage {
	
	WebDriver driver;
	WaitUtility wait = new WaitUtility();
	
	public LoginPage(WebDriver driver) {//constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);//?
	}
	
	@FindBy(xpath = "//input[@type='text']") WebElement userName;
	@FindBy(xpath = "//input[@type='password']") WebElement passWord;
	@FindBy(xpath = "//button[@type='submit']") WebElement signIn;
	@FindBy(xpath = "//p[text()='Dashboard']") WebElement dashboard;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']") WebElement loginAlert;
	
	
	/*public void enterUsernameAndPassword(String userNameFiled, String passWordField) {
		userName.sendKeys(userNameFiled);
		passWord.sendKeys(passWordField);
	}
	public void clickSignIn() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //here WebDriverWait is a class
		//wait.until(ExpectedConditions.elementToBeClickable(signIn));//wait until click for 10s
		//wait.waitForElementToClick(driver, signIn);    //slashed since got error while execution
		signIn.click();
	}*/
	
	//here not going to any other page so LoginPage itself used to return
	public LoginPage enterUsernameAndPassword(String userNameFiled, String passWordField) {//chaining
		userName.sendKeys(userNameFiled);
		passWord.sendKeys(passWordField);
		return this;
	}
	//here when clicking login button, It will take to Home page, so HomePage objt used to return
	public HomePage clickSignIn() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //here WebDriverWait is a class
		//wait.until(ExpectedConditions.elementToBeClickable(signIn));//wait until click for 10s
		//wait.waitForElementToClick(driver, signIn);    
		signIn.click();
		return new HomePage(driver);
	}
	
	
	
	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
	}
	
	public boolean isLoginAlertDisplayed() {
		return loginAlert.isDisplayed();
	}

}
