package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	
	public void handleAlerts() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement clickMe = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMe.click();
		driver.switchTo().alert().accept();//to ok the alert
	}
	
	public void handleSecondAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement ClickMeTwo = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		ClickMeTwo.click();
		driver.switchTo().alert().dismiss();//to cancel alert
	}
	
	public void handlePromptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement promptBox = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		promptBox.click();
		driver.switchTo().alert().sendKeys("Hello Aswathy");
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alertHandle = new AlertHandling();
		alertHandle.initializeBrowser();
		//alertHandle.handleAlerts();
		//alertHandle.handleSecondAlert();
		alertHandle.handlePromptAlert();

	}

}
