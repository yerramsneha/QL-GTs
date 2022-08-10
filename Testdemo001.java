package selenium001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testdemo001 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		 //set path of msedgedriver.exe path
	      System.setProperty("webdriver.edge.driver",
	         "C:\\Users\\ChaitanyaGopalasetty\\OneDrive - ValueMomentum, Inc\\Documents\\edgedriver_win64\\msedgedriver.exe");
	      
	      WebDriver driver = new EdgeDriver();
	      driver.get("https://www.ltmetro.com/");
	      driver.navigate().forward();
	      driver.getCurrentUrl();
	      driver.findElement(By.id("lst-id"));
	       driver.quit();
	}

}
