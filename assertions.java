package Assertions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class assertions {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChaitanyaGopalasetty\\Downloads\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("applyweb");
		
		driver.findElement(By.name("q")).click();

		
		driver.navigate().to("https://applyweb.collegenet.com/account/new/create?origin=https://www.applyweb.com/cgi-bin/applymenu?instcode=lwg");
		
		Assert.assertFalse(false);
		
		driver.findElement(By.cssSelector("input[id*='email']")).click();
		
		driver.findElement(By.cssSelector("input[id*='email']")).sendKeys("dog@gmail.com");
		
		driver.findElement(By.cssSelector("input[id*='password']")).click();
		
		driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("password");
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='email']")).isSelected());
		
		Assert.assertFalse(true);
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='email']")).isSelected());
		
		Assert.assertNotEquals("Hello","hello");//This is useful for the printing that entered two Strings are not equal
	
		System.out.println("Two Strings are not equal");
		
	}

}
