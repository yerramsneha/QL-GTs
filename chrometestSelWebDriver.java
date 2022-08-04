package seldemo1;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chrometestSelWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // declaration and instantiation of objects/variables  
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\GuruSravaniLaxmiSree\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver_win32\\chromedriver.exe");  
		    
		    WebDriver driver_Chrome = new ChromeDriver(); 
		

		    driver_Chrome.navigate().to("http://www.google.com/");


		    //driver.set_window_size();
		    //driver.set_window_size(200,500);

		    Dimension d = new Dimension(480,620);

		    //Resize the current window to the given dimension

		    driver_Chrome.manage().window().setSize(d);
		   

		    //System.out.println(driver.manage().window().getSize());

		    // driver.findElement(By.id("lst-ib")).sendKeys("amazon");
		     //driver.close();
		    driver_Chrome.findElement(By.name("q")).sendKeys("Amazon.com");
	        driver_Chrome.findElement(By.name("q")).clear();
	        driver_Chrome.findElement(By.id("btnk")).click();
	        driver_Chrome.navigate().back();
	        driver_Chrome.navigate().forward();
	        driver_Chrome.navigate().refresh();
	        driver_Chrome.close();
	        driver_Chrome.quit();
			}
}



