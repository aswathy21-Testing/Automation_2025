package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class FileUploadUtility {
	
	public void fileUploadForSendkeys(WebElement element, String path) {
		element.sendKeys(path);
		
	}
	
	public void fileUploadForRobotClass(WebElement element, String path) throws AWTException {
		StringSelection selection = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);//copy path to clipboard. why null here?
		Robot robot = new Robot();
		robot.delay(2000);// without delay, not happened the upload. sometimes we have to use delay if upload not happening(stucked at choose file page)
		robot.keyPress(KeyEvent.VK_CONTROL);// to press ctrl key
		robot.keyPress(KeyEvent.VK_V);// to press V key
		robot.keyRelease(KeyEvent.VK_CONTROL);// to release ctrl
		robot.keyRelease(KeyEvent.VK_V);// to release V
		robot.keyPress(KeyEvent.VK_ENTER);// to press enter
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
