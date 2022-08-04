package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 
{

	private static Dimension d;
	private static By drvier;
	
    public static void main(String[] args) 
	{
	

		 // TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\poori\\ChromeDriver.exe");
		 WebDriver driver = new ChromeDriver();

		 driver.navigate().to("https://www.google.co.in/");
		
		drvier.findElement((SearchContext) By.id("lst.ib")).sendKeys("https://www.google.com/");
		 driver.close();
		    }
	}


