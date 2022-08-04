package selwebdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;


public class Annotatation {
	WebDriver driver_Msedge= new EdgeDriver();  
	
	@SuppressWarnings("deprecation")
	@Before
	   public void launchapp() {
	      // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		  driver_Msedge.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      // Launch opposite
		  driver_Msedge.navigate().to("https://www.calculator.net/");
		  driver_Msedge.manage().window().maximize();
	   }
	   
	   @Test
	   public void calculatepercent() {
	      // Click on Math Calculators
		   driver_Msedge.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
	      
	      // Click on Percent Calculators
		   driver_Msedge.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
		   driver_Msedge.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
		   driver_Msedge.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Click Calculate Button
		   driver_Msedge.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
	      
	      // Get the Result Text based on its path
	      String result =
	    		  driver_Msedge.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();
	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
	      
	      if(result.equals("5")) {
	         System.out.println(" The Result is Pass");
	      } else {
	         System.out.println(" The Result is Fail");
	      }
	   }
	   
	   @AfterTest
	   public void terminatetest() {
		   driver_Msedge.close();
	
	
}
}
