package SeleniumTestProject.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementVisibiltyInteraction extends CommonFunctions {

	public static void main(String[] args) throws InterruptedException {
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = launchBrowser("chrome", cf.driver);

		WebElement showBtn = driver.findElement(By.id("show-textbox"));
		WebElement hideBtn = driver.findElement(By.id("hide-textbox"));
		WebElement input = driver.findElement(By.id("displayed-text"));

		Thread.sleep(1000);
		hideBtn.click();
		Thread.sleep(1000);
		showBtn.click();
		Thread.sleep(1000);
		input.sendKeys("Input visible");
		Thread.sleep(1000);
		input.clear();
		input.sendKeys("Hidden in 1 sec.");
		Thread.sleep(1000);
		hideBtn.click();

		closeBrowser(driver, 3);
	}

}
