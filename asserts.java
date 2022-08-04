package selwebdemo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class asserts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\new\\msedgedriver.exe");
		WebDriver driver_Msedge= new EdgeDriver();  
		 driver_Msedge.navigate().to("http://www.google.com/"); 
		 driver_Msedge.navigate().to("https://demoqa.com/automation-practice-form"); 
		 	Assert.assertFalse(true);
		System.out.println(driver_Msedge.findElement(By.cssSelector("input[id*='Sports']")).isSelected());
		Assert.assertFalse(false);
		System.out.println(driver_Msedge.findElement(By.cssSelector("input[id*='Sports']")).isSelected());
	
		
}}
