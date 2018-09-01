package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RequireAmountPOM {
	WebDriver driver;

	@FindBy(id = "instalment-loan-amount")
	WebElement setAmount;

	@FindBy(xpath = "//span[@ng-hide='selectedFirstPaymentDate']")
	WebElement selectCalendar;

	@FindBy(xpath = "//span[@class='day ng-binding ng-scope'][starts-with(text(),'26')]")
	WebElement setDate;

	@FindBy(id = "wn-btn-apply")
	WebElement applyNow;

	// *****************************************************
	public RequireAmountPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// *****************************************************

	public void enterSetAmount(String amount) {
		setAmount.clear();
		setAmount.sendKeys(amount);
	}

	public void clickSelectCalendar() {
		selectCalendar.click();
	}

	public void clickSetDate() {
		setDate.click();
	}

	public void clickApplyNow(int timeout) {
		try {
			WebElement element;
			WebDriverWait wait = new WebDriverWait(driver, 20);
			element = wait.until(ExpectedConditions.elementToBeClickable(applyNow));
			element.click();

		} catch (Exception e) {
			System.out.println("Elememnt doesn't exist");
		}
	}
}
