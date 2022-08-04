package demo1;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class crossbrowser 
{
	
    
    

           public static void main(String[] args) 
           {

        	   System.setProperty("webdriver.chrome.driver","C:\\poori\\ChromeDriver.exe");
                //WebDriver driver = new ChromeDriver(); 
               System.setProperty("webdriver.edge.driver","C:\\poori\\msedgedriver.exe");

             //driver_Chrome.navigate().to("http://www.google.com/");
              //driver_Edge.navigate().to("http://www.google.com/");
                 WebDriver driver_Chrome = new EdgeDriver();
                 WebDriver driver_Edge = new ChromeDriver();

                driver_Chrome.navigate().to("http://www.google.com/");
                  driver_Edge.navigate().to("http://www.amazon.com/");
                //driver.set_window_size();
                  //driver.set_window_size(200,500);

                  Dimension d = new Dimension(480,620);

                  //Resize the current window to the given dimension

                  driver_Chrome.manage().window().setSize(d);
                  driver_Edge.manage().window().setSize(d);

                  //System.out.println(driver.manage().window().getSize());
                  driver_Chrome.findElement(By.name("q")).sendKeys("google.com");
                  driver_Chrome.findElement(By.name("q")).clear();
                  driver_Chrome.findElement(By.id("btnk")).click();
                  driver_Chrome.navigate().back();
                  driver_Chrome.navigate().forward();
                  driver_Chrome.navigate().refresh();
                  driver_Chrome.close();
                  driver_Chrome.quit();

                  // driver.findElement(By.id("lst-ib")).sendKeys("amazon");
                  // driver.close();
              }

    }

