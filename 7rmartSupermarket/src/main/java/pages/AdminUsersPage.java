package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {
	
	WebDriver driver;
	
	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'])[2]") WebElement adminUsersMoreInfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement newLnk;
	@FindBy(id = "username") WebElement userName;
	@FindBy(id = "password") WebElement passWord;
	@FindBy(xpath="//select[@name='user_type']") WebElement userType;
	@FindBy(xpath="//button[@name='Create']") WebElement saveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	
	public void clickOnadminUsersMoreInfo() {
		adminUsersMoreInfo.click();
	}
	
	public void clickOnNew() {
		newLnk.click();
	}
	
	public void enterUserNameAndPassword(String uName, String pWord) {
		userName.sendKeys(uName);
		passWord.sendKeys(pWord);
	}
	
	public void selectUserType(String uType) {
		Select select = new Select(userType);
		select.selectByValue(uType);
	}
	
	public void clickSave() {
		saveButton.click();
	}
	
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

}
