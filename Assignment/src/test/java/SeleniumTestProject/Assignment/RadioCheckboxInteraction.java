package SeleniumTestProject.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioCheckboxInteraction extends CommonFunctions {

	public static void main(String[] args) {
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = launchBrowser("chrome", cf.driver);
		List<WebElement> radioButtons = driver.findElements(By.className("radioButton"));
		WebElement checkBox = driver.findElement(By.id("checkBoxOption2"));
		
		for(WebElement radioButton : radioButtons) {
			radioButton.click();
		}
		
		checkBox.click();
		
		closeBrowser(driver, 5);
	}

}
