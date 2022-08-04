package seldemo1;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class edgetestSelWebDriver {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\BhargavKella\\OneDrive - ValueMomentum, Inc\\Documents\\edgedriver_win64\\msedgedriver.exe"); 
WebDriver driver_Edge = new EdgeDriver();

driver_Edge.navigate().to("http://www.google.com/");
//driver.set_window_size();
//driver.set_window_size(200,500);
Dimension d = new Dimension(480,620);
//Resize the current window to the given dimension

 driver_Edge.manage().window().setSize(d);
 //System.out.println(driver.manage().window().getSize());
//driver.findElement(By.id("lst-ib")).sendKeys("amazon");
//driver.close();
 driver_Edge.findElement(By.name("q")).sendKeys("Amazon.com");
 Thread.sleep(3000);
//this is locating forms
 JavascriptExecutor jse=(JavascriptExecutor)driver_Edge; 
driver_Edge.findElement(By.name("btnK")).click(); 
jse.executeScript("window.scrollBy(0,100)");
driver_Edge.findElement(By.name("q")).clear();
//this is clearing user inputs
//performing click event
 driver_Edge.navigate().back();
 //this is back
 driver_Edge.navigate().forward();
//this is forward
 driver_Edge.navigate().refresh(); 
 //this is refresh
driver_Edge.close();
//this is close
driver_Edge.quit();
//this is quit
}
}

