package selenium001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forward {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChaitanyaGopalasetty\\Downloads\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/");
		
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://www.tutorialspoint.com/market/login.asp");
		
		driver.navigate().forward();
		
		Thread.sleep(6000);
		
		Thread.sleep(6000);

		driver.close();
	}

}
