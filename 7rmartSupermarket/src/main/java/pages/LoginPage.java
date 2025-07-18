package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {//constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);//?
	}
	
	@FindBy(xpath = "//input[@type='text']") WebElement userName;
	@FindBy(xpath = "//input[@type='password']") WebElement passWord;
	@FindBy(xpath = "//button[@type='submit']") WebElement signIn;
	@FindBy(xpath = "//p[text()='Dashboard']") WebElement dashboard;
	
	public void enterUsernameAndPassword(String userNameFiled, String passWordField) {
		userName.sendKeys(userNameFiled);
		passWord.sendKeys(passWordField);
	}
	
	public void clickSignIn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //here WebDriverWait is a class
		wait.until(ExpectedConditions.elementToBeClickable(signIn));//wait until click for 10s
		signIn.click();
	}
	
	public boolean isDashboardDisplayed() {
		return dashboard.isDisplayed();
	}

}
