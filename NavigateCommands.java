package CommandsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands 
{
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ChaitanyaGopalasetty\\Downloads\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("Zomato");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.zomato.com/");
				
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		
		driver.navigate().to("https://www.zomato.com/mumbai/order-food-online?delivery_subzone=77482");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.zomato.com/mumbai/restaurants?place_name=Veermata+Jijabai+Technological+Institute%2C+Matunga%2C+Mumbai&dishv2_id=30308");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.zomato.com/mumbai/art-of-dum-worli/order?contextual_menu_params=eyJkaXNoX3NlYXJjaCI6eyJ0aXRsZSI6IkJlc3QgaW4gQmlyeWFuaSIsImRpc2hfaWRzIjpbIjMwMzA4Il0sImN1aXNpbmVfaWRzIjpbXX19");
	
		driver.navigate().forward();
	}

}
