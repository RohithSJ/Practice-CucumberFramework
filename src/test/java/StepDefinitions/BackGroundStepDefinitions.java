//package StepDefinitions;
//
//import java.time.Duration;
//import java.util.concurrent.TimeoutException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//import Hooks.hooks;
//import PageObjects.Backgroundduplication;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class BackGroundStepDefinitions {
//	
//	 WebDriver driver = hooks.getDriver();
//	Backgroundduplication bgduplication;
//	
//	@Given("user is accessing sauce demo login page")
//	public void user_is_accessing_sauce_demo_login_page() {
////	    driver = new ChromeDriver(); // or your driver setup
////	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		
//		
//	    driver.get("https://www.saucedemo.com/");
//	    bgduplication = new Backgroundduplication(driver); // page object init
//	}
//
//	@When("user enters valid name and password")
//	public void user_enters_valid_name_and_password() {
//	    bgduplication.enterusername("standard_user");
//	    bgduplication.enterpassword("secret_sauce");
//	    bgduplication.clickLoginButton(); // ✅ Important to call this
//	}
//
//	@Then("user should be able to navigate to homepage")
//	public void user_should_be_able_to_navigate_to_homepage() throws TimeoutException {
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	    
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='app_logo']")));
//	    boolean isdisplayed = bgduplication.logoImageIsDisplayed();
//	    System.out.println("Is homepage logo displayed? " + isdisplayed); // <-- This prints the result
//	    Assert.assertTrue(isdisplayed, "Homepage logo is not displayed. Login might have failed.");
//	        	    
//	    
//	    delayFiveSeconds();
//
//	    
////	    boolean logoVisible = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("app_logo"))).isDisplayed();
////	    Assert.assertTrue(logoVisible, "Login failed: Homepage logo not found.");
////	    
//	}
//
//	@Then("click on the breadcrumb icon")
//	public void click_on_the_breadcrumb_icon() {
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Open Menu']")));
//	    bgduplication.clickMenuIcon();
//	    delayFiveSeconds();
//
//	}
//
//	@Then("the user should be able to see the menu items")
//	public void the_user_should_be_able_to_see_the_menu_items(){
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	    WebElement menuList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='app_logo']")));
//	    Assert.assertTrue(menuList.isDisplayed());
//	    delayFiveSeconds();
////	    driver.quit();
//	    }
//	
//	
//	
//	
//	
//
//	@Then("clicks on add to button")
//	public void clicks_on_add_to_button() {
//	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add to cart']")));
//	    bgduplication.addItemToCart();
//	    delayFiveSeconds();
//	}
//
//	@Then("item should be added to the cart")
//	public void item_should_be_added_to_the_cart() throws InterruptedException {
//	    String item = bgduplication.getItemText();
//	    Assert.assertEquals(item, "Sauce Labs Backpack","Item added to cart is not as expected.");
//	    delayFiveSeconds();
//
//	}
//
//	
//	
//	private void delayFiveSeconds() {
//	    try {
//	        Thread.sleep(2000);
//	    } catch (InterruptedException e) {
//	        e.printStackTrace();
//	    }
//	}
//}
//	    
