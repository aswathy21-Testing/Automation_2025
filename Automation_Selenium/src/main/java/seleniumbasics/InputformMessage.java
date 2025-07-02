package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InputformMessage extends Base{
	
	public void enterMessage() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement message = driver.findElement(By.id("single-input-field"));
		message.sendKeys("Aswathy");
		WebElement showMessage = driver.findElement(By.xpath("//button[@id='button-one']"));
		showMessage.click();
	}
	
	public void enterTwoInputFields() {//assignment 2
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement valueA = driver.findElement(By.id("value-a"));
		valueA.sendKeys("2");
		WebElement valueB = driver.findElement(By.id("value-b"));
		valueB.sendKeys("5");
		WebElement getTotal = driver.findElement(By.id("button-two"));
		getTotal.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputformMessage inputForm = new InputformMessage();
		inputForm.initializeBrowser();
		//inputForm.enterMessage();
		inputForm.enterTwoInputFields();

	}

}
