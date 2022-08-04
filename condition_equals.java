package seldemo1;
import org.junit.Assert;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class condition_equals { 
public static void main(String[] args)   
{  
  // TODO Auto-generated method stub  
System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\GuruSravaniLaxmiSree\\\\\\\\OneDrive - ValueMomentum, Inc\\\\\\\\Documents\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");  
WebDriver driver = new ChromeDriver();  
driver.navigate().to("https://www.amazon.com/"); Assert.assertEquals("5Adult",driver.findElement(By.id("divpaxinfo")).getText());  
System.out.println(driver.findElement(By.id("divpaxinfo")).getText());  
}}  
