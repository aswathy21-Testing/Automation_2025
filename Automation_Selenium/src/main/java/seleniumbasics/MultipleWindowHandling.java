package seleniumbasics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	WebDriver driver;
	
	public void multipleWindowHandlingDemo() {
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");// parent window
		driver.manage().window().maximize();
		WebElement contactUs = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		contactUs.click();
		WebElement loginPortal = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		loginPortal.click();
		
		String parent = driver.getWindowHandle();//to handle parent window
		System.out.println(parent);// parent window id
		
		Set<String> childWindows = driver.getWindowHandles();//all windows
		String title = "";
		for(String windows:childWindows) {
			//System.out.println(windows);//print all windows including parent
			if(!windows.equals(parent)) {// exclude parent
				System.out.println(windows);
				driver.switchTo().window(windows);//to switch to windows other than parent
				title = driver.getTitle();// to get title of each window to identify them
				System.out.println(title);
			}
			if(title.equals("WebDriver | Contact Us")) {
				WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
				firstName.sendKeys("Aswathy");
				
			}
				
			if(title.equals("WebDriver | Login Portal")) {
				WebElement userName = driver.findElement(By.id("text"));
				userName.sendKeys("aswathy1");
			}
			driver.switchTo().window(parent);// return to parent
		}	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleWindowHandling multipleWindow = new MultipleWindowHandling();
		multipleWindow.multipleWindowHandlingDemo();

	}

}
