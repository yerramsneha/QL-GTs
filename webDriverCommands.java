package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class webDriverCommands {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");  
	    
	    
		WebDriver driver = new ChromeDriver();
	   
	    driver.navigate().to("http://www.google.com/");
	    driver.manage().window().maximize();
	    
	    String Title =  driver.getTitle();
	    System.out.println("\n The title of the current page is: " + Title);
	   
		String URL = driver.getCurrentUrl();
	    System.out.println("\n The URL of the current page is: " + URL);
	    
	    String PageSrc = driver.getPageSource();  
	    System.out.println("\n The PageSource of the current page is: " + PageSrc);
	    
	    
	    //filling a form
	  
	    driver.navigate().to("https://"
	    		+ ""
	    		+ ".com/automation-practice-form/");  
	    
	    driver.findElement(By.id("firstName")).sendKeys("Sai");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("lastName")).sendKeys("Nitin");
	    Thread.sleep(1000);
	    driver.findElement(By.id("lastName")).clear();
	    
	    driver.findElement(By.id("userEmail")).sendKeys("bnitinx51@gmail.com");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	    
	    driver.findElement(By.id("userNumber")).sendKeys("1234567890");
	    
	    driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div")).clear();
	    driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div")).sendKeys("Meow");
	    
	    /*
        WebElement ElementTest = driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]"));
        ElementTest.clear();
        ElementTest.sendKeys("Meow");
        */
	    driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
	    
        WebElement Element = driver.findElement(By.id("currentAddress"));
        Element.clear();
        Element.sendKeys("Hyderabad");
	    
	    //driver.close();
	    //driver.quit();
		
		
	}
	

}
