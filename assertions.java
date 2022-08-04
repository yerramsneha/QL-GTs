package demo1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class assertions {
	public static void main(String [] args) {
		WebDriver driver;
	      System.setProperty("webdriver.chrome.driver", "C:\\poori\\ChromeDriver.exe");
		  driver = new ChromeDriver();
		 driver.navigate().to("https://demoqa.com/automation-practice-form");
		 
		 Assert.assertFalse(false);
		 
		 System.out.println(driver.findElement(By.cssSelector("input[id*='gender-radio-2']")).isSelected());
		   Assert.assertNotEquals("Hello", "How are you"); 
		   Assert.assertEquals("Hello", "Hello"); 
		   
		   Assert.assertNull(null);  
		   System.out.println("Hello...This is javaTpoint"); 
		   
		   
		   Assert.assertNull(10);  
		    System.out.println("Hello World");  
		          
		   

		}
		 }
		