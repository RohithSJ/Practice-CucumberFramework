package StepDefinitions;

import static org.junit.Assert.assertFalse;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Hooks.hooks;
import PageObjects.Datepickerpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatepickerStep {


		 WebDriver driver = hooks.getDriver();
		
	    Datepickerpage datepickerpage;

	    @Given("user is on the webpage")
	    public void user_is_on_the_webpage() {
	    	
//	    	driver = new ChromeDriver();
	        driver.get("https://www.automationtesting.co.uk/datepicker.html");
	    	driver.manage().window().maximize();
	    	
	        datepickerpage = new Datepickerpage(driver);
	       
	    }

	    @When("user clicks on the datepicker field")
	    public void user_clicks_on_the_datepicker_field() {
	        datepickerpage.clickdateinput();
	    }

	    @When("selects the date")
	    public void selects_the_date() throws InterruptedException {
	    	
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.elementToBeClickable(datepickerpage.getDateToSelect())); 
            datepickerpage.selectdate(); 
            Thread.sleep(2000);
	        
	    }
	    
	    

	    @Then("Date entered to be displayed")
	    public void date_entered_to_be_displayed() {
	        String date = datepickerpage.getselecteddate();
	        System.out.println("Selected Date: " + date);
	        assertFalse("Date not selected", date.isEmpty());
	        driver.quit();
		
		
		
		
	}

}
