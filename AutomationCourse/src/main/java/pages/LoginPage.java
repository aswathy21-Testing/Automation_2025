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
	@FindBy(xpath = "//input[@id='loginform-username']") WebElement userName;//to locate element username. Instead of driver.findElmnt
	//@FindBy(xpath = "//input[@id='loginform-username']") private WebElement userName;//Hence we can achieve encapsulation, elements will be private in this class
	@FindBy(xpath = "//input[@id='loginform-password']") WebElement passWord;
	@FindBy(xpath = "//button[@type='submit']") WebElement login;
	
	public void enterUsernameAndPassword(String userNameFiled, String passWordField) {//method to interact with elements
		userName.sendKeys(userNameFiled);
		passWord.sendKeys(passWordField);
	}
	
	//wait
	public void clickLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); //here WebDriverWait is a class
		wait.until(ExpectedConditions.elementToBeClickable(login));//wait until click for 10s
		login.click();
	}
	
	

	
}
