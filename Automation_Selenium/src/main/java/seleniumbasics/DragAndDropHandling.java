package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropHandling extends Base{
	
	public void dragAndDropDemo() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement drag1 = driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		Actions action = new Actions(driver);
		action.moveToElement(drag1).click();//moveToElement - to mouse hover the element, then click
		action.doubleClick(drag1).perform();// manually no need
		//actions.moveToElement(draggable1).doubleClick().perform(); this can also used
		WebElement drop = driver.findElement(By.xpath("//div[@id='mydropzone']"));
		action.dragAndDrop(drag1, drop).build().perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragAndDropHandling dragDrop = new DragAndDropHandling();
		dragDrop.initializeBrowser();
		dragDrop.dragAndDropDemo();

	}

}
