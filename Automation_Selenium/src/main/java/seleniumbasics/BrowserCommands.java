package seleniumbasics;

public class BrowserCommands extends Base{
	
	public void browserCommands() {
		//to get title of current page
		String title = driver.getTitle();
		System.out.println(title);
		//to get the url of current page
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//to return html code of current page - page source
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands com = new BrowserCommands();
		com.initializeBrowser();
		com.browserCommands();

	}

}
