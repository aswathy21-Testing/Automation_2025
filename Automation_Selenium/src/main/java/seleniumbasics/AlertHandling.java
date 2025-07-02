package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	
	public void handleAlerts() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMe.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alertHandle = new AlertHandling();
		alertHandle.initializeBrowser();
		alertHandle.handleAlerts();

	}

}
