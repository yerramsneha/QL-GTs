package demo1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;



public class annotations 
{
	WebDriver driver = new ChromeDriver();
	   @Before
	   public void launchapp() {
	      // Puts an Implicit wait, Will wait for 10 seconds before throwing exception
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      // Launch website
	      driver.navigate().to("http://www.calculator.net");
	      driver.manage().window().maximize();
	   }
	   
	   @org.junit.Test
	   public void calculatepercent() {
	      // Click on Math Calculators
	      driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
	      
	      // Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();
	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
	      
	      if(result.equals("5")) {
	         System.out.println(" The Result is Pass");
	      } else {
	         System.out.println(" The Result is Fail");
	      }
	   }
	   
	   @After
	   public void terminatetest() 
	   {
	      driver.close();
	   }
	}


	