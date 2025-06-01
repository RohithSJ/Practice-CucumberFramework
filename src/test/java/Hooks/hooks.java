package Hooks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	public static WebDriver driver;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();

        // 🔒 Disable password manager, save prompts, and safe browsing
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        prefs.put("safebrowsing.enabled", true);
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-infobars");
        

        // Optional: run without existing user profile
        options.addArguments("--incognito");
        options.addArguments("--no-first-run");

        

        
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    
    
    

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;

        }
    }
    
    
    
    
//    @After
//    public void tearDown() {
//        try {
//            // Wait for 3 seconds before closing
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        if (driver != null) {
//            driver.quit();
//        }
//    }
    

    public static WebDriver getDriver() {
        return driver;
    }
	
    
	public static void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	

	
	
	

}
