package seldemo1;

import org.junit.Assert;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class asserttrue  
{  
  
    public static void main(String[] args) throws InterruptedException   
           {  
        // TODO Auto-generated method stub  
    	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\BhargavKella\\\\OneDrive - ValueMomentum, Inc\\\\Documents\\\\chromedriver_win32\\\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();  
        driver.navigate().to("https://demoqa.com/automation-practice-form");  
          
          Assert.assertTrue(true);  
System.out.println(driver.findElement(By.cssSelector("input[id*='hobbies-checkbox-1']")).isSelected());  
          
    Thread.sleep(4000);
    driver.quit();
    }  
  
}  