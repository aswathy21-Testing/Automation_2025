package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxAndRadiobutton extends Base{
	
	public void checkboxDemo() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBox = driver.findElement(By.id("gridCheck']"));
		checkBox.click();
	}
	
	public void radioButtonDemo() {// assignment 2
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement femaleButton = driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		femaleButton.click();
		WebElement showSelectedValue = driver.findElement(By.id("button-one"));
		showSelectedValue.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckboxAndRadiobutton checkRadio = new CheckboxAndRadiobutton();
		checkRadio.initializeBrowser();
		//checkRadio.checkboxDemo();
		checkRadio.radioButtonDemo();

	}

}
