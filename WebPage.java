package Lastproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {

	public static void main(String[] args) throws InterruptedException
{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChaitanyaGopalasetty\\Downloads\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("file:///C:/Users/ChaitanyaGopalasetty/Event%20Online%20Form.html");
		
		driver.findElement(By.name("Event date")).click();
		
		driver.findElement(By.name("fname")).click();
		
		driver.findElement(By.name("fname")).sendKeys("Chaitanya");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("Lname")).click();
		
		driver.findElement(By.name("Lname")).sendKeys("Gopalasetty");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("phone")).click();
		
		driver.findElement(By.name("phone")).sendKeys("6302896901");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Country")).click();
		
		driver.findElement(By.id("Country")).sendKeys("Indian");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("State")).click();
		
		driver.findElement(By.id("State")).sendKeys("Andhra Pradesh");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("District")).click();
		
		driver.findElement(By.id("District")).sendKeys("Vizianagaram");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("button")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("Reset button")).click();
		
	}

}
