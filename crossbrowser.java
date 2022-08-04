package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class crossbrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Chrome browser starts here
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");  
		WebDriver driver_Chrome= new ChromeDriver();
		driver_Chrome.manage().window().maximize();
		
		driver_Chrome.navigate().to("http://www.google.com/"); 
	    driver_Chrome.findElement(By.name("q")).click();
	    driver_Chrome.findElement(By.name("q")).sendKeys("amazon");
	    driver_Chrome.navigate().to("http://www.amazon.com/"); 
	    
	    JavascriptExecutor j = (JavascriptExecutor) driver_Chrome;
	    j.executeScript("window.scrollBy(0,300)");
	    Thread.sleep(2000);
	    
	    j.executeScript("window.scrollBy(300,800)");
	    Thread.sleep(2000);
	    
	    j.executeScript("window.scrollBy(0,-800)");
	    Thread.sleep(2000); 
	    //driver_Chrome.findElement(By.xpath("//*[@id=\"oFHYJapx5tLfxNnf4q63sA\"]/div[3]/a")).click();
	    driver_Chrome.navigate().back();  
	    Thread.sleep(2000);
	    
	    driver_Chrome.navigate().forward(); 
	    Thread.sleep(2000);
	   
	    driver_Chrome.close();
	    driver_Chrome.quit();
	    
	    
		
		//Edge browser starts here
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe"); 
		WebDriver driver_Edge = new EdgeDriver();
		
		driver_Edge.navigate().to("http://www.google.com/");
		driver_Edge.navigate().to("http://www.amazon.com/"); 
		
		JavascriptExecutor K = (JavascriptExecutor) driver_Edge;
		K.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		    
		j.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		
		driver_Edge.navigate().back();  
		Thread.sleep(2000);
	    driver_Edge.navigate().forward();
	    Thread.sleep(2000);
	    
	    driver_Edge.close();
	    driver_Edge.quit();
		    
	}

}
