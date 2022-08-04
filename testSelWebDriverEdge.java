package webDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class testSelWebDriverEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver_Edge = new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "C:\\edgedriver_win64\\msedgedriver.exe");  
	    
		driver_Edge.navigate().to("http://www.google.com/");

	    driver_Edge.findElement(By.name("q")).sendKeys("Amazon.com"); 
	    //this is used to find the given element.
	    driver_Edge.findElement(By.name("q")).clear();
	    //this is used to find the search bar by using the name attribute of the HTML.
	    driver_Edge.findElement(By.name("q")).sendKeys(Keys.ENTER);
	    //this is used to pass the search command using the ENTER key on the keyboard.
	    driver_Edge.navigate().back();  
	    //this is used to send the page one step back.
	    driver_Edge.navigate().forward(); 
	    //this is used to send the page one step forward.
	    driver_Edge.navigate().refresh();
	    //this is used to refresh the page.
		driver_Edge.close();
		
		
		
		
	}

}
