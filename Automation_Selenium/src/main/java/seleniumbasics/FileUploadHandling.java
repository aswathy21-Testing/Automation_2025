package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadHandling {
	WebDriver driver;
	
	public void fileUploadDemo() {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		chooseFile.sendKeys("G:\\Aswathy_HSST_CSE\\86.  HSST Computer Science.pdf");// no need to click but manually we have to click to choose file
		WebElement upload = driver.findElement(By.id("file-submit"));
		upload.click();
	}
	
	public void robotClassFileUpload() throws AWTException {
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		
		WebElement selectPdf = driver.findElement(By.id("pickfiles"));
		selectPdf.click();
		StringSelection selection = new StringSelection("G:\\Aswathy_HSST_CSE\\86.  HSST Computer Science.pdf");
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

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		FileUploadHandling fileUpload = new FileUploadHandling();
		//fileUpload.fileUploadDemo();
		fileUpload.robotClassFileUpload();

	}

}
