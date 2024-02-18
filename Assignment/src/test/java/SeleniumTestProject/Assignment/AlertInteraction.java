package SeleniumTestProject.Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertInteraction extends CommonFunctions {

	public static void main(String[] args) {
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = launchBrowser("chrome", cf.driver);

		// Alert Testing
		WebElement alertBtn = driver.findElement(By.id("alertbtn"));
		alertBtn.click();

		Alert alert = driver.switchTo().alert();

		try {
			Thread.sleep(1500);
			alert.accept();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Confimation Testing
		WebElement input = driver.findElement(By.name("enter-name"));
		input.sendKeys("Rajaruban");

		WebElement confirmBtn = driver.findElement(By.id("confirmbtn"));
		confirmBtn.click();

		Alert confirm = driver.switchTo().alert();

		try {
			Thread.sleep(1500);
			confirm.dismiss();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		closeBrowser(driver, 5);
	}
}
