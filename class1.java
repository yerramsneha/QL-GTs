package seldemo1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

    public static void main(String[] args) throws InterruptedException
    {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\GuruSravaniLaxmiSree\\\\OneDrive - ValueMomentum, Inc\\\\Documents\\\\chromedriver_win32\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        driver.navigate().to("https://demoqa.com/automation-practice-form");
          driver.findElement(By.id("firstName")).sendKeys("sravani");
          Thread.sleep(1000);
          //driver.findElement(By.id("firstName")).clear();
          driver.findElement(By.id("lastName")).sendKeys("dharmala");
          Thread.sleep(1000);
          driver.findElement(By.id("userEmail")).sendKeys("sravs@gmail.com");
          driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
          driver.findElement(By.id("userNumber")).sendKeys("2498592847");
          driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();

         WebElement Element = driver.findElement(By.id("currentAddress"));
           Element.clear();
          Element.sendKeys("Hyderabad");
  }
    }
