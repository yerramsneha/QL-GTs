package seldemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

    public static void main(String[] args) throws InterruptedException
    {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        driver.navigate().to("https://www.amazon.in/");
      //*[@id="a-page"]
        
         driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).click();
        driver.findElement(By.id("userEmail")).sendKeys("ap-email");
        driver.findElement(By.id("continue")).submit();
        driver.findElement(By.id("password")).sendKeys("ap-password");
        driver.findElement(By.xpath("auth-signin-button-announce")).submit();

        		
    }}
//*[@id="ap_email"]