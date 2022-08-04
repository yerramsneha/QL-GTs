package crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class seleniumserverdemo {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
		
	

			 throws InterruptedException {	
					System.setProperty("webdriver.edge.driver", "C:\\new\\msedgedriver.exe");
					WebDriver driver_Msedge= new EdgeDriver();  
					 driver_Msedge.manage().window().maximize();
					 driver_Msedge.get("file:///C:/Users/SaiKrishnaKumarKomma/OneDrive%20-%20ValueMomentum,%20Inc/BUSINESSS%20REGISTRATION/LOGIN.html");

				//First test case for valid login
				//Finding the web elements and passing the values
					 driver_Msedge.findElement(By.id("userName")).sendKeys("gunjankaushik");
					 driver_Msedge.findElement(By.id("password")).sendKeys("Password@123");
					 driver_Msedge.findElement(By.xpath("//*[@id=\"login\"]")).click();
				
				Thread.sleep(5000);

				//Capture the page heading and print on console
				System.out.println("The page heading is --- " + driver_Msedge.findElement(By.xpath("//div[@class=\"main-header\"]")).getText());
				
				//Logout from the session
				 driver_Msedge.findElement(By.id("submit")).click();
				
				
				//Second test case for invalid login credentials
				 driver_Msedge.findElement(By.id("userName")).sendKeys("abdc");
				 driver_Msedge.findElement(By.id("password")).sendKeys("Password");
				 driver_Msedge.findElement(By.id("login")).click();
				
				String expectedURL = "https://www.demoqa.com/login";
				String actualURL =  driver_Msedge.getCurrentUrl();
				
				if(actualURL.equalsIgnoreCase(expectedURL))
					System.out.println("Test passed !!!!");
				else
					System.out.println("Test failed");
				
				//Closing browser session
				 driver_Msedge.quit();

				{
				
		}
	}
	
}


