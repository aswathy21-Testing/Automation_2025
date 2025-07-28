package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUsersPage {
	
	WebDriver driver;
	PageUtility utility = new PageUtility();
	
	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement newLnk;
	@FindBy(id = "username") WebElement userName;
	@FindBy(id = "password") WebElement passWord;
	@FindBy(xpath="//select[@name='user_type']") WebElement userType;
	@FindBy(xpath="//button[@name='Create']") WebElement saveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	@FindBy(xpath ="//a[@href=\'https://groceryapp.uniqassosiates.com/admin/user/delete?del=14855&page_ad=1\']") WebElement deleteButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement deleteSuccessAlert;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/user/edit?edit=14858&page_ad=1']") WebElement editUserType;
	@FindBy(xpath = "//button[@name='Update']") WebElement updateButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement updateSuccessAlert;
	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/user/status?id=14858&st=inactive&page_ad=1'])[2]")WebElement statusChange;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement statusChangeAlert;
	
	
	public AdminUsersPage clickOnNew() {
		newLnk.click();
		return this;
	}
	
	public AdminUsersPage enterUserNameAndPassword(String uName, String pWord) {
		userName.sendKeys(uName);
		passWord.sendKeys(pWord);
		return this;
	}
	
	public AdminUsersPage selectUserType(String uType) {
	//	Select select = new Select(userType);
	//	select.selectByValue(uType);
		
		utility.selectByValue(userType, uType); //use of utility class
		return this;
	}
	
	public AdminUsersPage clickSave() {
		saveButton.click();
		return this;
	}
	
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}
	
	
	public AdminUsersPage clickOnDeleteButton() {
		deleteButton.click();
		driver.switchTo().alert().accept();
		return this;
	}
	public boolean isDeleteSuccessAlertDisplayed() {
		return deleteSuccessAlert.isDisplayed();
	}
	
	
	public AdminUsersPage clickOnEditUserInfoButton() {
		editUserType.click();
		return this;
	}
	public AdminUsersPage clickOnUpdateButton() {
		updateButton.click();
		return this;
	}
	public boolean isUpdateSuccessAlertDisplayed() {
		return updateSuccessAlert.isDisplayed();
	}
	
	
	public AdminUsersPage clickOnStatusChangeButton() {
		statusChange.click();
		return this;
	}
	public boolean isStatusChangeAlertDisplayed() {
		return statusChangeAlert.isDisplayed();
	}

}
