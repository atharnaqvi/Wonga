package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactInfoPOM {
	WebDriver driver;

	@FindBy(xpath = "//a[@class='manual']")
	WebElement manualAddress;

	@FindBy(id = "edit-flat")
	WebElement flatNumber;

	@FindBy(id = "edit-house-name")
	WebElement houseName;

	@FindBy(id = "edit-house-number")
	WebElement houseNumber;

	@FindBy(id = "edit-street")
	WebElement streetName;

	@FindBy(id = "edit-town")
	WebElement townName;

	@FindBy(id = "edit-postcode-uk")
	WebElement postCode;

	@FindBy(id = "edit-address-period")
	WebElement duration;

	@FindBy(id = "edit-submit")
	WebElement submitApplication;

	// ***********************************************************************

	public ContactInfoPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// ***********************************************************************
	public void selectManualAddress(int timout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(manualAddress));
			manualAddress.click();
		} catch (Exception e) {
			System.out.println("The element is not found");
		}
	}

	public void enterFlatNumber(String flatNo) {
		flatNumber.sendKeys(flatNo);
	}

	public void enterHouseName(String hName) {
		houseName.sendKeys(hName);
	}

	public void enterHouseNumber(String hNumber) {
		houseNumber.sendKeys(hNumber);
	}

	public void enterStreetName(String street) {
		streetName.sendKeys(street);
	}

	public void enterTownName(String town) {
		townName.sendKeys(town);
	}

	public void enterPostCode(String postcode) {
		postCode.sendKeys(postcode);
	}

	public void selectDuration(int indexPoint) {
		Select dropdown = new Select(duration);
		dropdown.selectByIndex(indexPoint);
	}

	public void clickSubmitAppliction() {
		submitApplication.click();
	}
}
