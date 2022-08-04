package seldemo1;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class testSelWebDriver {
public static void main(String[] args) {
// TODO Auto-generated method st// declaration and instantiation of objects/variables
System.setProperty("webdriver.chrome.driver", "C:\\Users\\BhargavKella\\OneDrive - ValueMomentum, Inc\\Documents\\chromedriver_win32\\chromedriver.exe"); 
System.setProperty("webdriver.edge.driver", "C:\\Users\\BhargavKella\\OneDrive - ValueMomentum, Inc\\Documents\\edgedriver_win64\\msedgedriver.exe"); 
WebDriver driver_Chrome = new ChromeDriver();
WebDriver driver_Edge = new EdgeDriver();
driver_Chrome.navigate().to("https://www.amazon.in/");
driver_Edge.navigate().to("http:///www.amazon.in/");
//driver.set_window_size();
//driver.set_window_size(200,500);
Dimension d = new Dimension(480,620);
//Resize the current window to the given dimension
driver_Chrome.manage().window().setSize(d);
driver_Edge.manage().window().setSize(d);

//System.out.println(driver.manage().window().getSize());
// driver.findElement(By.id("lst-ib")).sendKeys("amazon");
//driver.close();        
}
}

