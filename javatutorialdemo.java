package selwebdemo;


	//import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class javatutorialdemo {


		public static void main(String[] args) {
		
			// declaration and instantiation of objects/variables  
			System.setProperty("webdriver.chrome.driver", "C:\\new\\chromedriver.exe");
			WebDriver driver_Chrome= new ChromeDriver();  
		
			 driver_Chrome.navigate().to("http://www.google.com/"); 
			 driver_Chrome.navigate().to("www.javatpoint.com");  
			// driver_Chrome.findElement(By.id("lst-ib")).sendKeys("amazon");
				driver_Chrome.close();
		}

	}


