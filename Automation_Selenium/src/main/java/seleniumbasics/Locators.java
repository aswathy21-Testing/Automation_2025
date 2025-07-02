package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void idLocator() {
		WebElement input1 = driver.findElement(By.id("single-input-field"));
		WebElement button1 = driver.findElement(By.id("button-one"));
		WebElement valueA = driver.findElement(By.id("value-a"));
		WebElement valueB = driver.findElement(By.id("value-b"));
	}
	
	public void nameLocator() {
		WebElement element1 = driver.findElement(By.name("description"));
		WebElement element2 = driver.findElement(By.name("keywords"));// 
		WebElement element3 = driver.findElement(By.name("daterange"));//from page DATE PICKERS
	}
	
	public void classLocator() {
		WebElement element1 = driver.findElement(By.className("mb-sec"));//top menu
	}
	
	public void linkTextLocator() {
		WebElement link1 = driver.findElement(By.linkText("check-box-demo.php"));
	}
	
	public void partialLinkText() {
		WebElement radioButton = driver.findElement(By.linkText("ajax-form"));
	}

	public void cssSelector() {
		WebElement msg = driver.findElement(By.cssSelector("input#single-input-field"));//tag#id
		WebElement topmenu = driver.findElement(By.cssSelector("div.mb-sec"));//tag.class
		WebElement showMessage = driver.findElement(By.cssSelector("button[id=button-one]"));//tag[attrType=attrValue]
		WebElement valueA = driver.findElement(By.cssSelector("input.form-control[id=value-a]"));//tag.class[attrType=attrValue]
		
		
	}
	
	public void absoluteXPathDemo() {
		WebElement msg = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
	}
	
	public void relativeXPathDemo() {
		WebElement valueB = driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement message = driver.findElement(By.xpath("//input[@id='single-input-field']"));
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
	}
	
	public void dynamicXpath() {
		WebElement message = driver.findElement(By.xpath("//input[contains(@id, 'single-input-field')]"));
		WebElement showMessage = driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement message1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));//id also possible
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators loc = new Locators();

	}

}
