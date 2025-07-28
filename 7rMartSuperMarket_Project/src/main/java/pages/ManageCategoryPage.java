package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import utilities.FileUploadUtility;

public class ManageCategoryPage {
	WebDriver driver;
		
	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement newLink;
	@FindBy(xpath = "//input[@id='category']") WebElement category;
	@FindBy(xpath = "134-selectable") WebElement dragSelectGroup;
	@FindBy(xpath = "(//ul[@class='ms-list'])[2]") WebElement dropSelectGroup;
	@FindBy(id = "main_img") WebElement chooseFile;
	@FindBy(xpath = "(//input[@name='top_menu'])[1]") WebElement yesOfTopMenu;
	@FindBy(xpath = "(//input[@name='show_home'])[2]") WebElement noOfLeftMenu;
	@FindBy(xpath = "//button[@name='create']") WebElement saveButton;
	
	
	
	public ManageCategoryPage clickOnNewLink() {
		newLink.click();
		return this;
	}
	public ManageCategoryPage inputCategory(String catName) {
		category.sendKeys(catName);
		return this;
	}
	public ManageCategoryPage dragAndDropSelectGroup() {
		Actions action = new Actions(driver);
		action.moveToElement(dragSelectGroup).click().doubleClick().perform();
		action.dragAndDrop(dragSelectGroup, dropSelectGroup).build().perform();
		return this;
	}
	
	public ManageCategoryPage uploadFile() {
		FileUploadUtility uploadUtility = new FileUploadUtility();
		uploadUtility.fileUploadForSendkeys(chooseFile, Constants.CHOOSEFILEMNGCTGRYPAGE);
		return this;
	}
	
	public ManageCategoryPage clickOnYesOfTopMenu() {
		yesOfTopMenu.click();
		return this;
	}
	public ManageCategoryPage clickOnNosOfLeftMenu() {
		noOfLeftMenu.click();
		return this;
	}
	
	
	public ManageCategoryPage clickOnSaveButton() {
		saveButton.click();
		return this;
	}
	
	//alert

}
