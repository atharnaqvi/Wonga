package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewApplicationPOM {
	WebDriver driver;

	@FindBy(id = "edit-submit")
	WebElement newApplication;

	// *****************************************************
	public NewApplicationPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// *****************************************************

	public void startNewApplication() {
		try {
			WebElement element;
			WebDriverWait wait = new WebDriverWait(driver, 20);
			element = wait.until(ExpectedConditions.elementToBeClickable(newApplication));
			element.click();
		} catch (Exception e) {
			System.out.println("Element doesn't exist!!!");
		}

		newApplication.click();
	}

}
