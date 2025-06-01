package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {
	
	WebDriver driver;
	
	// ✅ Constructor to initialize the driver
	 	public loginPageFactory(WebDriver driver) {
	 		this.driver = driver;
	 		PageFactory.initElements(driver, this);
	 	}
	    
	
	
	@FindBy(id="user-name")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_passsword;
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
	
	
	public void enterusername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		txt_username.sendKeys(password);
	}
	
	
	public void loginbutton(String button) {
	      loginbutton.click();
	}
	
	
	
	

}
