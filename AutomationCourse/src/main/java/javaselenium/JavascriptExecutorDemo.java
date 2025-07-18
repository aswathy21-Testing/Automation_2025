package javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {
	
	WebDriver driver;
	
	public void JavascriptExecutorMethod() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("window.scrollBy(0,1000)");//one arg
		//executor.executeScript("window.scrollBy(0,-500)");
		
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		//executor.executeScript("aguments[0].sendKeys(Bags");", search);
		executor.executeScript("arguments[0].click();", "search");//two args
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavascriptExecutorDemo javascript = new JavascriptExecutorDemo();
		javascript.JavascriptExecutorMethod();

	}

}
