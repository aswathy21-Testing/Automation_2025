package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElements extends Base{
	
	public void findElementsDemo() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement i:checkBoxes) {
			i.click();
		}
	}
	
	public void multipleInput() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='check-box-list']"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElements findElements = new FindElements();
		findElements.initializeBrowser();
		findElements.findElementsDemo();

	}

}
