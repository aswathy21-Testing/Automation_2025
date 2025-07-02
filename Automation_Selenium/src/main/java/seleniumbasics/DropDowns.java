package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowns extends Base{
	
	public void dropDownDemo() {
        driver.navigate().to("https://selenium.qabible.in/select-input.php");
        WebElement  drop= driver.findElement(By.xpath("//select[@id='single-input-field']"));
		  	Select select = new Select(drop);
		  //	select.s
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
