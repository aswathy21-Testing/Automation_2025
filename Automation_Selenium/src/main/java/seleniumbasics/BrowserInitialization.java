package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInitialization {
	
	public void browserInitialization() {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserInitialization obj = new BrowserInitialization();
		obj.browserInitialization();
				

	}

}
