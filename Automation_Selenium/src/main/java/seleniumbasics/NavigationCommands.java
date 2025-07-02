package seleniumbasics;

public class NavigationCommands extends Base{
	
	public void navigationCommands() {
		
		driver.navigate().to("https://www.amazon.in/");//to other site
		driver.navigate().back();//to go back
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigationCommands nav = new NavigationCommands();
		nav.initializeBrowser();
		nav.navigationCommands();

	}

}
