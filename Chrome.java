package seldemo;


//import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Chrome {

  public static void main(String[] args) {

      // declaration and instantiation of objects/variables  
      System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");  
     // System.setProperty("webdriver.edge.driver", "C:\\Users\\SatyaBhavaniGedela\\OneDrive - ValueMomentum, Inc\\Documents\\edgedriver_win64\\msedgedriver.exe");  

      WebDriver driver_Chrome = new ChromeDriver(); 
     // WebDriver driver_Edge = new EdgeDriver();

      driver_Chrome.navigate().to("http://www.google.com/");
     // driver_Edge.navigate().to("http://www.google.com/");

      //driver.set_window_size();
      //driver.set_window_size(200,500);

      Dimension d = new Dimension(480,620);

      //Resize the current window to the given dimension

      driver_Chrome.manage().window().setSize(d);
     // driver_Edge.manage().window().setSize(d);

      //System.out.println(driver.manage().window().getSize());
      
  }

}
