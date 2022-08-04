package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\new\\msedgedriver.exe");
		WebDriver driver_Msedge= new EdgeDriver(); 
		 driver_Msedge.manage().window().maximize();
		 driver_Msedge.get("file:///C:/Users/SaiKrishnaKumarKomma/OneDrive%20-%20ValueMomentum,%20Inc/BUSINESSS%20REGISTRATION/LOGIN.html");
		 driver_Msedge.findElement(By.xpath("/html/body/center/form/table/tbody/tr[1]/td[2]/input")).sendKeys("gunjankaushik");
		 Thread.sleep(500);
		 driver_Msedge.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Saikrishna@gamil.com");
		 Thread.sleep(500);
		 driver_Msedge.findElement(By.xpath("/html/body/center/form/table/tbody/tr[3]/td[2]/input")).sendKeys("Password@123");
		 Thread.sleep(500);
		 driver_Msedge.findElement(By.xpath("/html/body/center/form/a")).click();
		 driver_Msedge.findElement(By.xpath("/html/body/fieldset/input[1]")).sendKeys("RJ GROUP OF COMPANIES");
		 Thread.sleep(500);
		 driver_Msedge.findElement(By.xpath("/html/body/fieldset/input[2]")).sendKeys("RJ GROUP OF COMPANIES");
		 Thread.sleep(500);
		 driver_Msedge.findElement(By.xpath("/html/body/fieldset/textarea[1]")).sendKeys("xyz colony");
		 Thread.sleep(500);
		 driver_Msedge.findElement(By.xpath("/html/body/fieldset/textarea[2]")).sendKeys("xyz country");
		 Thread.sleep(500);
		 driver_Msedge.findElement(By.xpath("/html/body/fieldset/input[4]")).sendKeys("xyz ");
		 Thread.sleep(500);
		 driver_Msedge.findElement(By.xpath(" /html/body/fieldset/input[5]")).sendKeys("123 ");
		 Thread.sleep(500);
 driver_Msedge.findElement(By.xpath("/html/body/fieldset/input[6]")).sendKeys("123 ");
 Thread.sleep(500);
 driver_Msedge.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("krishna@123 ");
 Thread.sleep(500);
 driver_Msedge.findElement(By.xpath("//*[@id=\"gsearch\"]")).sendKeys("my website ");
 Thread.sleep(500);
 driver_Msedge.findElement(By.xpath("/html/body/fieldset/input[9]")).sendKeys("importat ");
 Thread.sleep(500);
 driver_Msedge.findElement(By.xpath("/html/body/fieldset/textarea[3]")).sendKeys("ghhj98765 ");
 Thread.sleep(500);
 driver_Msedge.findElement(By.xpath("/html/body/fieldset/textarea[3]")).sendKeys("ghhj98765 ");
 Thread.sleep(500);
 driver_Msedge.findElement(By.xpath("/html/body/textarea")).sendKeys("xyz colony");
 Thread.sleep(500);
 driver_Msedge.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("12233445");
 Thread.sleep(500);
 driver_Msedge.findElement(By.xpath("/html/body/i[2]/i/input[2]")).sendKeys("sai");
 Thread.sleep(500);
 driver_Msedge.findElement(By.xpath("/html/body/i[2]/i/textarea")).sendKeys("dcsajzxchbj colony");
 Thread.sleep(500);
 driver_Msedge.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("321637");
 Thread.sleep(500);
 driver_Msedge.findElement(By.xpath("/html/body/i[2]/i/a/center/button")).click();
 Thread.sleep(500);
	}
}
