//package StepDefinitions;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import PageFactory.homePageFactory;
//import PageFactory.loginPageFactory;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class PageFactoryLoginStepDefinition {
//	
//	static WebDriver driver;
//	loginPageFactory login;
//	homePageFactory home;
//
//	@Given("user is on the login page")
//	public void user_is_on_the_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//		
//		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//	}
//
////	@When("the user enters valid username and password")
////	public void the_user_enters_valid_username_and_password() {
////	    // Write code here that turns the phrase above into concrete actions
////		
////		 driver.findElement(By.id("user-name")).sendKeys("standard_user");;
////		 driver.findElement(By.id("password")).sendKeys("secret_sauce");;
////		
////	}
//	
//	
//	@When("the user enters valid {string} and {string}")
//	public void the_user_enters_valid_and(String string, String string2) {
//	    
//		 driver.findElement(By.id("user-name")).sendKeys("standard_user");;
//		 driver.findElement(By.id("password")).sendKeys("secret_sauce");;
//		
//		
//	}
//	
//	
//	
//	
//
//	@When("clicks on the login button")
//	public void clicks_on_the_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//		driver.findElement(By.id("login-button")).click();
//	}
//
//	@Then("the user is navigate page")
//	public void the_user_is_navigate_page() {
//	    // Write code here that turns the phrase above into concrete actions
//
////		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0, "the user is navigate page");
////		System.out.println(driver.getTitle());
//		
//		
//		home = new homePageFactory(driver);
//		
//		
//		System.out.println(home.iscartdisplayed());
//		
//	}
//
//	@And("close the browser")
//	public void close_the_browser() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.close();
//	}
//	
//	
//	
//}
