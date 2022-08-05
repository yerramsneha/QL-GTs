package seldemo;
  
  
import org.junit.Assert;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class Checkboxtest {  
  
    public static void main(String[] args) {  
    // TODO Auto-generated method stub  
        System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver_win32\\\\chromedriver.exe");  
        WebDriver driver = new ChromeDriver();  
        driver.navigate().to("https://demoqa.com");  
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //Assert.assertFalse(true);
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        
          
    }  
  
}  
