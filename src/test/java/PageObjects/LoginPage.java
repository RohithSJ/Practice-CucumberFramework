package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By text_username =  By.id("user-name");
	By text_password =  By.id("password")  ;
	By login = By.id("login-button") ;
    By logo = By.xpath("//div[@class='app_logo']");
    


			
 // ✅ Constructor to initialize the driver
 	public LoginPage(WebDriver driver) {
 		this.driver = driver;
 	}
    
 



	public void enterusername(String username) {
		driver.findElement(text_username).sendKeys(username);
	}
	
	public void enterpassword(String password) {
		driver.findElement(text_password).sendKeys(password);
	}
	
	public void loginbutton() {
		driver.findElement(login).click();
	}
	
	
	public void userlogin(String username, String password) {
		
		driver.findElement(text_username).sendKeys(username);
		driver.findElement(text_password).sendKeys(password);


	}
	
	public boolean logoimageisdisplayed() {
		return driver.findElement(logo).isDisplayed();

	}
	
	

}
