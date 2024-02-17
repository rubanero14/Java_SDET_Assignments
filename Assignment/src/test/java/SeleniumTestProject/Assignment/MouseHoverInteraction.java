package SeleniumTestProject.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverInteraction extends CommonFunctions {

	public static void main(String[] args) throws InterruptedException {
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = launchBrowser("chrome", cf.driver);
		
		WebElement button = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 500).moveToElement(button).perform();
		
		WebElement link = driver.findElement(By.linkText("Top"));
		Thread.sleep(1500);
		link.click();
		
		closeBrowser(driver, 3);
	}

}
