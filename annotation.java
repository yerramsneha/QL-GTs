package cucumberTest;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;

public class annotation {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");  
    WebDriver driver1 = new ChromeDriver(); 
    
	WebDriver driver = null;
	@Given("^I am on Facebook login page$")
	public void goToFacebook() { 
	      driver1 = new ChromeDriver(); 
	      driver1.navigate().to("https://www.facebook.com/");
	}
	@When("^I enter username as \"(.*)\"$")
	public void enterUsername(String arg1) {   
	      driver1.findElement(By.id("email")).sendKeys(arg1);
	}
	@When ("^I enter password as \"(.*)\"$")
	public void enterPassword(String arg1) {
	      driver1.findElement(By.id("pass")).sendKeys(arg1);
	      driver1.findElement(By.id("u_0_v")).click();
	}
	@Then("^Login should fail$")
	public void checkFail() {
		if(driver1.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
			System.out.println("Test1 Pass");
		} 
		else {
			System.out.println("Test1 Failed");
		} 
	      driver1.close();
	}
	@Then("^Relogin option should be available$")
	public void checkRelogin() {
		if(driver1.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
			System.out.println("Test2 Pass");
		} 
		else {
			System.out.println("Test2 Failed");
		} 
	      driver1.close();
	}
}
