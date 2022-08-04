package seldemo1;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
@SuppressWarnings("unused")
public class annotation
{
// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
//@SuppressWarnings("deprecation")
@BeforeTest
public void launchapp()
{
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.navigate().to("http://www.calculator.net");
driver.manage().window().maximize();

}
@Test
public void calculatepercent()
{
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
String result = driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();// Print a Log In message to the screen
System.out.println(" The Result is " + result);
if(result.equals("5"))
{
	System.out.println(" The Result is Pass");
}
else
{
	System.out.println(" The Result is Fail");
}}
@AfterTest
 public void terminatetest()
{
driver.close();
 }
}

