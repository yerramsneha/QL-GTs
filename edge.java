package demo1;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class edge 
{
	

		

		private static Dimension d;
		private static By drvier;
		
	    public static void main(String[] args) 
		{
		

			 // TODO Auto-generated method stub
			System.setProperty("webdriver.edge.driver","C:\\poori\\msedgedriver.exe");
			 WebDriver driver = new EdgeDriver();

			 driver.navigate().to("https://www.google.co.in/");
			driver.manage().window().setSize((Dimension) d);
			System.out.println(driver.manage().window().getSize());
			drvier.findElement((SearchContext) By.id("lst.ib")).sendKeys("https://www.google.com/");
			 driver.close();
			    }

	    
		}




