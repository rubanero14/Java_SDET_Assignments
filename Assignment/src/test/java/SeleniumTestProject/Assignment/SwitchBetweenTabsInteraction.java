package SeleniumTestProject.Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SwitchBetweenTabsInteraction extends CommonFunctions {

	public static void main(String[] args) throws InterruptedException {
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = launchBrowser("firefox", cf.driver);
		
		WebElement openTabBtn = driver.findElement(By.id("opentab"));
		openTabBtn.click();
		
		String MainWindow = driver.getWindowHandle();
		
		// To handle all new opened window.				
        Set<String> windows = driver.getWindowHandles();		
        Iterator<String> iterator = windows.iterator();
        
        while(iterator.hasNext()) {
        	String ChildWindow = iterator.next();
        	
        	if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
           
                Actions action = new Actions(driver);
                Thread.sleep(3000);
                
                
                WebElement nextBtn = driver.findElement(By.className("fa-angle-right"));
                action.scrollByAmount(0, 400).moveToElement(nextBtn).build().perform();
                nextBtn.click();
                Thread.sleep(1000);
                nextBtn.click();
                Thread.sleep(1000);
                System.out.println("Jumbotron carousel next button clicked twice.");
                Thread.sleep(500);
                
				// Closing the Child Window.
                driver.close();		
            }		
        }
        
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
		
		closeBrowser(driver, 3);
	}

}
