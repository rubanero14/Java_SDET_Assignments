package SeleniumTestProject.Assignment;

import org.openqa.selenium.WebDriver;

public class AlertInteraction extends CommonFunctions {
	
	public static void main(String[] args) throws InterruptedException {
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = cf.driver;
		launchBrowser("https://rahulshettyacademy.com/AutomationPractice/", "chrome", driver);
		
//		try {
//			
//			Thread.sleep(3000);
//			driver.quit();
//		} catch(Exception e) {
//			throw e;
//		}
	}
}
