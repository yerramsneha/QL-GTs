package seldemo1;
 
import org.junit.Assert;  
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
public class condition_true {
	public static void main(String[] args) {
{  
// TODO Auto-generated method stub  
System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\GuruSravaniLaxmiSree\\\\\\\\OneDrive - ValueMomentum, Inc\\\\\\\\Documents\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");  
WebDriver driver = new ChromeDriver();  
driver.navigate().to("https://www.udemy.com");  
Assert.assertFalse(true);  
System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
          
} 
}}