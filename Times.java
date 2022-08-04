package project_TheEconomicsTimes;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.SearchContext;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Times {
	
	WebDriver driver;
	//private WebElement WebElement;
	 @Given("^User should open Url in chrome browser$")
	 public void user_should_open_Url_in_chrome_browser() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\GuruSravaniLaxmiSree\\eclipse-workspace1\\FinalProject\\Chrome Driver\\chromedriver.exe");
        driver =new ChromeDriver();
         driver.manage().window().maximize();
		}
	 @When("^User Enter Economics of times Url in the Search box$")
	 public void user_Enter_Economics_of_times_Url_in_the_Search_box() throws Throwable {
		 driver.get("https://economictimes.indiatimes.com/");
	      Thread.sleep(3000);
	 }

		@When("^User should navigate to Home Page of Economics of times$")
		public void user_should_navigate_to_Home_Page_of_Economics_of_times() throws Throwable {
			  driver.get("https://economictimes.indiatimes.com/");
		       Thread.sleep(3000);
		   
		}
		//@Then("^Click on Signin PushButton and navigate to HomePage$")
		//public void click_on_Signin_PushButton_and_navigate_to_HomePage() throws Throwable {
			//driver.navigate().to("https://economictimes.indiatimes.com/login.cms");
		//}


		@Then("^User should click on Signin PushButton$")
		public void user_should_click_on_Signin_PushButton() throws Throwable {
			
		// driver.navigate().to("https://economictimes.indiatimes.com/login.cms");
		// driver.findElement(By.xpath("/html/body/main/header/div/div[2]/div[1]/a"));
		 driver.findElement(By.xpath("/html/body/main/header/div/div[2]/div[1]/a")).click(); 
		 Thread.sleep(1000);
		}
		@Then("^User should click on Signin with email or mobile$")
		public void user_should_click_on_Signin_with_email_or_mobile() throws Throwable {
			//driver.navigate().to("https://economictimes.indiatimes.com/login.cms");
			driver.findElement(By.xpath("//*[@id=\"lg_login_option\"]/form/div/div[5]/span")).click();
			Thread.sleep(1000);
		}
		@Then("^User should enter Emailid or phoneno in EditBox$")
		public void user_should_enter_Emailid_or_phoneno_in_EditBox() throws Throwable {
			 
                // driver.findElement(By.id("lg_input lg_email")).sendKeys("gsree9240@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"lg_login\"]/form/div[1]/input")).sendKeys("gsree9240@gmail.com");
                 Thread.sleep(1500);
                  
		}

		//@Then("^Click on Continue PushButton$")
		//public void click_on_Continue_PushButton(String type) throws Throwable {
			//driver.findElement(By.name("lg_login"));
			//driver.findElement(By.xpath("//*[@id="lg_login]/form/div[2]/input"));
	       // WebElement  = driver.findElement(By.id(type="submit"));
	       // JavascriptExecutor js = (JavascriptExecutor) driver;
	        //js.executeScript("arguments[0].click()",WebElement);
	       //Thread.sleep(2000);
	   // }
		@Then("^Click on Continue PushButton$")
		public void click_on_Continue_PushButton() throws Throwable {
			driver.findElement(By.xpath("//*[@id=\"lg_login\"]/form/div[2]/input")).click(); 
			Thread.sleep(1500);
		}

		//@Then("^User should enter Name in EditBox$")
		//public void user_should_enter_Name_in_EditBox() throws Throwable {
		    
		//driver.findElement(By.name("name")).sendKeys("sravani");
			//driver.findElement(By.xpath("//*[@id=\"lg_register\"]/form/div[1]/label")).sendKeys("sravani");
          // Thread.sleep(1500);
            
		//}

		@Then("^User should enter Password in EditBox$")
		public void user_should_enter_Password_in_EditBox() throws Throwable {
			//driver.findElement(data-check:"req,password")).sendKeys("sravani1@");
			// driver.findElement(By.id("req,password")).sendKeys("sravani1@");
			driver.findElement(By.name("password")).sendKeys("sravani1@");
           Thread.sleep(1500);
		}

		//private int check(String string) {
			// TODO Auto-generated method stub
			//return 0;
		//}

		@Then("^Click on Signin PushButton and navigate to HomePage$")
		public void click_on_Signin_PushButton_and_navigate_to_HomePage() throws Throwable {
			WebElement ee= driver.findElement(By.xpath("//*[@id=\"lg_password\"]/form/div[5]/input"));
			ee.click();
			 Thread.sleep(1500); 
			 
			 Thread.sleep(2000); 
			 driver.quit();
			 
	    }
		}


