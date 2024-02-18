package SeleniumTestProject.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputWithAutoSuggestionsInteraction extends CommonFunctions {

	public static void main(String[] args) throws InterruptedException {
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = launchBrowser("chrome", cf.driver);

		WebElement input = driver.findElement(By.id("autocomplete"));
		input.sendKeys("India");
		Thread.sleep(500);
		input.sendKeys(Keys.DOWN);
		Thread.sleep(500);
		input.sendKeys(Keys.DOWN);
		Thread.sleep(500);
		input.sendKeys(Keys.ENTER);

		closeBrowser(driver, 3);
	}

}
