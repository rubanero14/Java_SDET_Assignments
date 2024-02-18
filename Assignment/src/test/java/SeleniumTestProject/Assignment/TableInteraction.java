package SeleniumTestProject.Assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TableInteraction extends CommonFunctions {

	public static void main(String[] args) {
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = launchBrowser("chrome", cf.driver);

		List<WebElement> tableOne = driver.findElements(By.name("courses"));
		for (WebElement tableOneItem : tableOne) {
			System.out.println(tableOneItem.getText());
		}

		System.out.println();
		System.out.println("=============================");
		System.out.println();

		Actions action = new Actions(driver);
		List<WebElement> tableTwo = driver.findElements(By.cssSelector(".tableFixHead #product"));
		WebElement tableTwoWrapper = driver.findElement(By.cssSelector(".tableFixHead"));
		action.scrollByAmount(0, 500).scrollToElement(tableTwoWrapper).perform();

		for (WebElement tableTwoItem : tableTwo) {
			System.out.println(tableTwoItem.getText());
		}

		closeBrowser(driver, 5);
	}

}
