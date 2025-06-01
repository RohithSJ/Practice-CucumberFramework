package StepDefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Hooks.hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	static WebDriver driver=hooks.getDriver();;

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
//		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

	@When("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
	}
	



//	@When("the user enters valid {string} and {string}")
//	public void the_user_enters_valid_and(String string, String string2) {
//	    
//		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		
//		
//	}
	
	
	
	

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   
		driver.findElement(By.id("login-button")).click();
	}
	
	
	
	

	@Then("the user is navigate page")
	public void the_user_is_navigate_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	  
//		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_log']")).size()>0, "the user is navigate page");
		
		
//		if(driver.getTitle().equals("Swag Labs")) {
//			Assert.assertTrue(true);
//		}
//		else
//		{
//		        hooks.captureScreen(driver,"LoginStepDefinitions");
//		        Assert.assertTrue(false);
//			
//			}


		
		
		// Validate logo is displayed
	    boolean logoPresent = driver.findElements(By.xpath("//div[@class='app_log']")).size() > 0;

	    // Validate page title
	    boolean correctTitle = driver.getTitle().equals("Swag Labs");

	    if (logoPresent && correctTitle) {
	        Assert.assertTrue(true, "User successfully navigated to home page");
	    } else {
	        // Take screenshot on failure
	    	
	        try {
	            hooks.captureScreen(driver, "LoginStepDefinition");
	        } catch (IOException e) {
	            System.out.println("Screenshot capture failed: " + e.getMessage());
	        
	    	}

	        // Throw assertion with reason
	        Assert.fail("Navigation failed - logo or title mismatch");
		
		}
		
		
		
		

		
		
		
	}

	
	
	@And("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}
	
	
	
}
