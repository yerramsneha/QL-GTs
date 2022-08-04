package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commands {
	
public static <varchar> void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriver driver;
	      System.setProperty("webdriver.chrome.driver", "C:\\poori\\ChromeDriver.exe");
		  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DEAIaIQobChMIsbaUzr2M-QIVyDMrCh2B6QDcEAAYASAAEgJJZPD_BwE%26hvadid%3D398134035836%26hvdev%3Dc%26hvlocphy%3D9062140%26hvnetw%3Dg%26hvqmt%3De%26hvrand%3D6593340146388900968%26hvtargid%3Dkwd-837441119212%26hydadcr%3D24542_1971411%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		 driver.findElement(By.id("ap_email")).sendKeys("poornima.chukka@valuemomentum.com");
		 Thread.sleep(4000);
		 driver.findElement(By.id("ap_email")).clear();
		 
		 
		 
		  //driver.findElement(By.linkText("Create your Amazon account")).click();
			String str= driver.findElement(By.linkText("Create your Amazon account")).getText();
			 System.out.println("Link Text is:"+str);
			
			 boolean d=driver.findElement(By.id("continue")).isDisplayed();
			 boolean e=driver.findElement(By.id("continue")).isEnabled();
			 boolean s=driver.findElement(By.id("continue")).isSelected();
			 
			 String id=driver.findElement(By.id("ap_email")).getAttribute("id");
			 System.out.println("id is: "+id);
			 
			 Dimension id1 =driver.findElement(By.id("ap_email")).getSize();
			 System.out.println("id is: "+id1);
			
			 
			 String id2=driver.findElement(By.id("ap_email")).getCssValue("id");
			 System.out.println("id is: "+id2);
			
			 
			
			 String id5=driver.findElement(By.id("ap_email")).getTagName();
			 System.out.println("id is: "+id5);
			 
			
			 System.out.println("isDisplayed:"+d);
			 System.out.println("isEnabled:"+e);
			 System.out.println("isSelected:"+s);
			 
			 Thread.sleep(4000);
			  driver.close();
			
}
}
		 
		


