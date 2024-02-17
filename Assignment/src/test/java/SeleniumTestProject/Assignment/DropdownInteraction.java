package SeleniumTestProject.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownInteraction extends CommonFunctions {

	public static void main(String[] args) {
		CommonFunctions cf = new CommonFunctions();
		WebDriver driver = launchBrowser("chrome", cf.driver);
		
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropdown.selectByVisibleText("Option2");;
		
		closeBrowser(driver, 3);
	}

}
