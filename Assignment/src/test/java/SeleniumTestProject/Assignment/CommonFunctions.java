package SeleniumTestProject.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonFunctions {
	WebDriver driver;
	
	protected static WebDriver launchBrowser(String browserType, WebDriver driver) {
		switch(browserType.toLowerCase()) {
			case "edge":
				 // Instantiate a EdgeDriver class.
				driver = new EdgeDriver();
		        break;
			case "firefox":
				 // Instantiate a ChromeDriver class.
		        driver = new FirefoxDriver();
		        break;
			case "internet explorer":
				 // Instantiate a InternetExplorerDriver class.
		        driver = new InternetExplorerDriver();
		        break;
			case "chrome":
				  default:				 
				// Instantiate a ChromeDriver class.
		        driver = new ChromeDriver();
		        break;
		}
		
        // Maximize the browser
        driver.manage().window().maximize();
	 
        // Launch Website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        return driver;
	}
	
	protected static void closeBrowser(WebDriver driver, int timeInSeconds) {
		int miliSec = timeInSeconds * 1000;
		try {
			Thread.sleep(miliSec);
			driver.quit();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
