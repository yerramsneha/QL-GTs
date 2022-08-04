package seldemo1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcommand
{

public static void main(String[] args) 
{

    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\GuruSravaniLaxmiSree\\\\OneDrive - ValueMomentum, Inc\\\\Documents\\\\chromedriver_win32\\\\chromedriver.exe");
    // Create a new instance of the Chrome driver
     WebDriver driver_Chrome = new ChromeDriver();

    // Open ToolsQA web site
    String appUrl = "https://www.amazon.in/";
    driver_Chrome.get(appUrl);

    // Click on Registration link
    driver_Chrome.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div")).click();

    // Go back to Home Page
    driver_Chrome.navigate().back();

    // Go forward to Registration page
    driver_Chrome.navigate().forward();

    // Go back to Home page
    driver_Chrome.navigate().to(appUrl);

    // Refresh browser
    driver_Chrome.navigate().refresh();

    // Close browser
    driver_Chrome.close();
}
}