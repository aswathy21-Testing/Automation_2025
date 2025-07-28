package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@data-toggle='dropdown']") WebElement admin;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/logout']") WebElement logout;
	
	
	public HomePage clickAdmin() {
		admin.click();
		return this;
	}
	
	public HomePage clickLogout() {
		logout.click();
		return this;
	}
	
	
	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin'])[2]") WebElement adminUsersMoreInfo;
	public AdminUsersPage clickOnadminUsersMoreInfo() {
		adminUsersMoreInfo.click();
		return new AdminUsersPage(driver);
	}
	
	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category'])[2]") WebElement manageCategoryMoreInfo;
	public ManageCategoryPage clickOnManageCategoryMoreInfo() {
		manageCategoryMoreInfo.click();
		return new ManageCategoryPage(driver);
	}
	
}
