package SeleniumTestProject.Assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchBetweenWindowsInteraction extends CommonFunctions {

	public static void main(String[] args) throws InterruptedException {
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = launchBrowser("chrome", cf.driver);

		WebElement openWindowBtn = driver.findElement(By.id("openwindow"));
		openWindowBtn.click();

		String MainWindow = driver.getWindowHandle();

		// To handle all new opened window.
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();

		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();

			if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

				// Switching to Child window
				driver.switchTo().window(ChildWindow);

				Thread.sleep(3000);
				WebElement link = driver.findElement(By.linkText("Access all our Courses"));
				link.click();
				System.out.println("Courses link clicked.");
				Thread.sleep(2000);

				// Closing the Child Window.
				driver.close();
			}
		}

		// Switching to Parent window i.e Main Window.
		driver.switchTo().window(MainWindow);

		closeBrowser(driver, 3);
	}

}
