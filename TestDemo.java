package selenium001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChaitanyaGopalasetty\\Downloads\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.javatpoint.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.javatpoint.com/selenium-webdriver-commands");
		
		driver.navigate().back();
		
		driver.navigate().refresh();
		
		Thread.sleep(7000);
		
		driver.close();
	
	}

}
