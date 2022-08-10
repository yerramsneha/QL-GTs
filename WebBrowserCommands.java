package CommandsInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowserCommands {

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChaitanyaGopalasetty\\Downloads\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://online.tsrtcpass.in/");
	
		
		System.out.println("Title of the Page : "+driver.getTitle());
		
		System.out.println("Printing the current URL : "+driver.getCurrentUrl());
		

		System.out.println("Printing the Page source : "+driver.getPageSource());
		
		
		
	}

}
