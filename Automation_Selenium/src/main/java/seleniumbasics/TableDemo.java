package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableDemo extends Base{
	
	public void getFullTableData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement fullTable = driver.findElement(By.xpath("//table[@id='dtBasicExample']"));//xpath for table. for that search for table tag in DOM and take the XPath
		System.out.println(fullTable.getText());
	}
	
	public void getSingleRowData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement secondRow = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]"));
		System.out.println(secondRow.getText() );
	}
	
	public void getSingleData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement data = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[1]"));
		System.out.println(data.getText());
	}
	
	public void getColumnData() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> columnData = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[3]"));
		for(WebElement i:columnData) {
			System.out.println(i.getText());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableDemo tableDemo = new TableDemo();
		tableDemo.initializeBrowser();
		tableDemo.getFullTableData();
		System.out.println("***********************************************");
		tableDemo.getSingleRowData();
		System.out.println("***********************************************");
		tableDemo.getSingleData();
		System.out.println("***********************************************");
		tableDemo.getColumnData();

	}

}
