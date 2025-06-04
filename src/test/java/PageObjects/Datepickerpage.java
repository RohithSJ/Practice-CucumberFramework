package PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepickerpage {


		WebDriver driver;


	    // Locators
	    By dateInput = By.id("basicDate");
	    By dateToSelect = By.xpath("//span[text()='7']");
	    
	    

	    public Datepickerpage(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    

	  
	    public void clickdateinput() {
	        driver.findElement(dateInput).click();
	    }

	    public void selectdate() {
	    
	        driver.findElement(dateToSelect).click();;
	    }
	    
	    
	    public WebElement getDateToSelect() {
	        return driver.findElement(dateToSelect); // ✅ getter used for wait
	    }
	    
	    

	    public String getselecteddate() {
	        return driver.findElement(dateInput).getAttribute("value");
	    }




	
	

}
