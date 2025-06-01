package PageObjects;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Backgroundduplication {

     WebDriver driver;
     WebDriverWait wait;


     
	// ✅ Constructor to initialize the driver
	 	public  Backgroundduplication(WebDriver driver) {
	 		this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds

	 	}
	 	
		By text_username =  By.id("user-name");
		By text_password =  By.id("password")  ;
		By login = By.id("login-button") ;
	    By logo = By.xpath("//div[@class='app_logo']");
        By icon = By.xpath("//button[text()='Open Menu']");
        By addToCart = By.xpath("//button[text()='Add to cart']");
        By itemText = By.xpath("//div[text()='Sauce Labs Backpack']");
	 	
	 	
        public void enterusername(String username) {
    		driver.findElement(text_username).sendKeys(username);
    	}
    	
    	public void enterpassword(String password) {
    		driver.findElement(text_password).sendKeys(password);
    	}
    	
    	public void clickLoginButton() {
    		driver.findElement(login).click();
    	}
    	
    	
    	public void userlogin(String username, String password) {
    		
    		driver.findElement(text_username).sendKeys(username);
    		driver.findElement(text_password).sendKeys(password);
    		clickLoginButton();
    		


    	}
	 	
	 	
    	 public boolean logoImageIsDisplayed() throws TimeoutException {
    		 WebElement logoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(logo));
			return logoElement.isDisplayed();    	    
    		 }

    	    public void clickMenuIcon() {
    	        driver.findElement(icon).click();
    	    }

    	    public void addItemToCart() {
    	        driver.findElement(addToCart).click();
    	    }

    	    public String getItemText() {
    	        return driver.findElement(itemText).getText();
    	    }

		
	    

}
