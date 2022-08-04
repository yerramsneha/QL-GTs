package selwebdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowser {

	
	
	WebDriver driver = null;
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		System.out.println("Browser name is :" + browserName);
		if( browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\new\\chromedriver.exe");
		 driver = new ChromeDriver();  
		}
		else if( browserName.equalsIgnoreCase("MicrosoftEdge")) {
			System.setProperty("webdriver.edge.driver", "C:\\new\\msedgedriver.exe");
			 driver = new EdgeDriver();  
		}
		
	}
{
	
}
	@Test
public void test1() {
driver.get("https://www.google.co.in/");
	}
	@AfterTest
public void teardown() throws Exception {
	driver.close();
	System.out.println("Test Completed Sucessfully");
	Thread.sleep(4000);
}
	
	{
}
}
