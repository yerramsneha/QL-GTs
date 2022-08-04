package webDriver;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		
		Assert.assertFalse(false);
		System.out.println(driver.findElement(By.cssSelector("input[id*='hobbies-checkbox-1']")).isSelected());
		

		Assert.assertTrue(true);
		System.out.println(driver.findElement(By.cssSelector("input[id*='hobbies-checkbox-1']")).isSelected());
		
		
        Assert.assertNotEquals("Hello", "How are you");  
        System.out.println("\nThe strings don't match and passed the given test case");  
        //if the object passed is null, the print statement is executed else not
        Assert.assertNull(null);  
        System.out.println("Object sent is null");
        Assert.assertNull(1);  
        System.out.println("Hello...This is javaTpoint");  
        
        Assert.assertNotNull(1);  
        System.out.println("The object passed isn't null");
        Assert.assertNotNull(null);  
        System.out.println("The object passed is null");  
				
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
