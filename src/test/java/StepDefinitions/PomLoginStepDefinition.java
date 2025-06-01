//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import PageObjects.LoginPage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class PomLoginStepDefinition {
//
//	static WebDriver driver;
//	LoginPage login;
//
//	@Given("user is on the login page")
//	public void user_is_on_the_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//		
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		login = new LoginPage(driver); // ✅ Initialize page with driver
//
//
//    
//	}
//
////	@When("the user enters valid username and password")
////	public void the_user_enters_valid_username_and_password() {
////	    // Write code here that turns the phrase above into concrete actions
//		
////		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
////		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
////		 
//
////		login.enterusername("standard_user");
////		login.enterpassword("secret_sauce");
////		
////	}
//	
//	
//	
//	
//	
//	
//	@When("the user enters valid {string} and {string}")
//	public void the_user_enters_valid_and(String username, String password) {
//	    
//		 driver.findElement(By.id("user-name")).sendKeys(username);
//		 driver.findElement(By.id("password")).sendKeys(password);
//
////		login.enterusername(username);
////		login.enterpassword(password);
//		 
//		 
//}
//	
//	
//	
//	
//
//	@When("clicks on the login button")
//	public void clicks_on_the_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	   
////		driver.findElement(By.id("login-button")).click();
//		
//		login.loginbutton();
//		
////		
////		try {
////			Thread.sleep(2000);
////		}
////		catch (InterruptedException e){
////			e.printStackTrace();
////		}
//	}
//	
//	
//	
//	
//
//	@Then("the user is navigate page")
//	public void the_user_is_navigate_page() {
//	    // Write code here that turns the phrase above into concrete actions
//
//		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0, "the user is navigate page");
//	
//		login.logoimageisdisplayed();
//		System.out.println(driver.getTitle());
//		
//		
//		
////		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='app_logo']")));
////
////		    Assert.assertFalse(login.logoimageisdisplayed(), "Logo is not displayed - login might have failed.");
////		    System.out.println(driver.getTitle());
//
//		
//		
//		    
//		    
//	}
//	
//	
//	
//	
//	
//	
//
//	@And("close the browser")
//	public void close_the_browser() {
//	    // Write code here that turns the phrase above into concrete actions
////		driver.close();
//		driver.quit();
//		
//	}
//	
//	
//}
