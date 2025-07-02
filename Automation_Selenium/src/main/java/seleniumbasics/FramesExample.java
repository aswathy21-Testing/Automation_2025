package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {
	WebDriver driver;
	
	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
	}
	
	public void framesDemo() {
		WebElement iframejMeter = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframejMeter);
		WebElement jMeter = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		jMeter.click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FramesExample frames = new FramesExample();
		frames.initializeBrowser();
		frames.framesDemo();
		

	}

}
