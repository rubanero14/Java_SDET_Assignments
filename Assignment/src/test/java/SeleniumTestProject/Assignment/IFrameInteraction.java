package SeleniumTestProject.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IFrameInteraction extends CommonFunctions {

	public static void main(String[] args) throws InterruptedException {
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = launchBrowser("chrome", cf.driver);

		Actions action = new Actions(driver);

		WebElement iFrame = driver.findElement(By.id("courses-iframe"));

		driver.switchTo().frame(iFrame);
		action.scrollByAmount(0, 1000).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("JOIN NOW")).click();
		System.out.println("Registration link inside iframe clicked.");
		Thread.sleep(1000);
		driver.switchTo().parentFrame();

		closeBrowser(driver, 3);
	}

}
