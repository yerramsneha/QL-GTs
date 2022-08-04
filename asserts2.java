package selwebdemo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class asserts2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\new\\msedgedriver.exe");
		WebDriver driver_Msedge= new EdgeDriver();  
		 driver_Msedge.navigate	().to("http://www.google.com/"); 
		driver_Msedge.findElement(By.name("q")).sendKeys("HYR Tutorials", Keys.ENTER);
		 String expectedTitle ="HYR Tutorials-Google Search";
		 String actualTitle = driver_Msedge.getTitle();
		 Assert.assertEquals(actualTitle,expectedTitle);
		 driver_Msedge.quit();
	}

	}


