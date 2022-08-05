package BankingSteps;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;


public class loginSteps {
	FirefoxDriver driver;

@Given("^user Should open any Browser$")
public void user_Should_open_any_Browser() throws Throwable {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\SatyaBhavaniGedela\\eclipse-workspace\\bankingSystem\\Firefox Driver"); 
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
    
}

@When("^user should enter banking Application url in the search Box$")
public void user_should_enter_banking_Application_url_in_the_search_Box() throws Throwable {
	driver.get("https://dribbble.com/");
    Thread.sleep(3000);
    
    
}

@When("^user should navigate to homepage to banking Application$")
public void user_should_navigate_to_homepage_to_banking_Application() throws Throwable {
   
}

@Then("^user should Enter Account Number in the EditBox$")
public void user_should_Enter_Account_Number_in_the_EditBox() throws Throwable {
	driver.findElement(By.id("Accountnumber")).sendKeys("1234567");
    Thread.sleep(1500);
   
}

@Then("^user should Enter Account type$")
public void user_should_Enter_Account_type() throws Throwable {
	driver.findElement(By.id("Account type")).sendKeys("Savings");
    Thread.sleep(1500);
    
}

@Then("^user should Enter Name$")
public void user_should_Enter_Name() throws Throwable {
	driver.findElement(By.id("name")).sendKeys("satya");
    Thread.sleep(1500);
   }

@Then("^user should Enter Balance$")
public void user_should_Enter_Balance() throws Throwable {
	
   }
}


