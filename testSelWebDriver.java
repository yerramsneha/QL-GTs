import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author SatyaNagaKrishnaSaiN
 *
 */
public class testSelWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver = new ChromeDriver(); 
	    
	    driver.close();
	}

}
