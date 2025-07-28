package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	
	WebDriver driver;
	
	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//locating fields
	@FindBy(xpath = "(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'])[2]") WebElement manageNewsTile;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/news/add']") WebElement newLink;
	@FindBy(xpath = "//textarea[@id='news']") WebElement enterNewsArea;
	@FindBy(xpath = "//button[@name='create']") WebElement saveButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement alertSuccess;
	
	
	//actions on fileds
	public void clickManageNewsTile() {
		manageNewsTile.click();
	}
	public void clickNewLink() {
		newLink.click();
	}
	public void enterNews() {
		enterNewsArea.sendKeys("Test News by Aswathy @obsqura");
	}
	public void clickSaveButton() {
		saveButton.click();
	}
	public boolean isalertSuccessDisplayed() {
		return alertSuccess.isDisplayed();
	}
	


}
