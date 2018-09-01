package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonalDetailPOM {
	WebDriver driver;

	@FindBy(id = "edit-title")
	WebElement yourTitle;

	@FindBy(id = "edit-first-name")
	WebElement firstName;

	@FindBy(id = "edit-last-name")
	WebElement lastName;

	@FindBy(id = "edit-date-of-birth-day")
	WebElement dayDOB;

	@FindBy(id = "edit-date-of-birth-month")
	WebElement monthDOB;

	@FindBy(id = "edit-date-of-birth-year")
	WebElement yearDOB;

	@FindBy(id = "edit-home-status")
	WebElement homeStatus;

	@FindBy(id = "edit-dependants")
	WebElement noOfDependents;

	@FindBy(id = "edit-employment-status")
	WebElement employmentStatus;

	@FindBy(id = "edit-monthly-income")
	WebElement monthlyIncome;

	@FindBy(id = "edit-employer-name")
	WebElement employerName;

	@FindBy(id = "edit-next-payday-view")
	WebElement selectNextPayDay;

	@FindBy(xpath = "//div[@id='wonga-conditionally-hidden-next-payday']//multimonth[contains(@class,'mo-multimonths ng-isolate-scope')]//div[1]//div[7]//span[3]")
	WebElement nextPayDay;

	@FindBy(id = "edit-income-frequency")
	WebElement freqOfIncome;

	@FindBy(id = "edit-expenditure-mortgage-rent")
	WebElement mortgageRent;

	@FindBy(id = "edit-expenditure-credit-commitments")
	WebElement creditCommitments;

	@FindBy(id = "edit-expenditure-utilities-bills")
	WebElement utilitiesBills;

	@FindBy(id = "edit-expenditure-travel")
	WebElement transportBills;

	@FindBy(id = "edit-expenditure-food")
	WebElement foodBills;

	@FindBy(id = "edit-expenditure-other")
	WebElement otherRegularOutgoings;

	@FindBy(id = "edit-mobile-phone")
	WebElement mobileNumber;

	@FindBy(id = "edit-email")
	WebElement emailAddress;

	@FindBy(id = "edit-email-confirm")
	WebElement confirmEmailAddrress;

	@FindBy(xpath = "//div[@id='edit-update-option-email-wrapper']//label[contains(@class,'option')]")
	WebElement contactPreference;

	@FindBy(xpath = "//div[@id='edit-repay-reminder-wrapper']//label[contains(@class,'option')]")
	WebElement confirmAccuracy;

	@FindBy(xpath = "//div[@id='edit-privacy-wrapper']//label[contains(@class,'option')]")
	WebElement privacyPolicy;

	@FindBy(id = "edit-submit")
	WebElement btnNext;

	// **********************************************
	public PersonalDetailPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// **********************************************

	public void clickYourTitle(String title, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.elementToBeClickable(yourTitle));
			Select dropdown = new Select(yourTitle);
			dropdown.selectByValue(title);
			System.out.println("Eelement clicked on the web page");

		} catch (Exception e) {
			System.out.println("Eelement not appeard on the web page");

		}

	}

	public void enterFirstName(String fname) {
		firstName.sendKeys(fname);
	}

	public void enterLastName(String lname) {
		lastName.sendKeys(lname);
	}

	public void clickDayDOB(String day) {
		Select dropdown = new Select(dayDOB);
		dropdown.selectByValue(day);
	}

	public void clickMonthDOB(String month) {
		Select dropdown = new Select(monthDOB);
		dropdown.selectByValue(month);

	}

	public void clickYearDOB(String year) {
		Select dropdown = new Select(yearDOB);
		dropdown.selectByValue(year);
	}

	public void selectHomeStatus(int indexPoint) {
		Select dropdown = new Select(homeStatus);
		dropdown.selectByIndex(indexPoint);
	}

	public void selectNoOfDependents(String dependents) {
		Select dropdown = new Select(noOfDependents);
		dropdown.selectByValue(dependents);
	}

	public void selectEmploymentStatus(int indexPoint) {
		Select dropdown = new Select(employmentStatus);
		dropdown.selectByIndex(indexPoint);

	}

	public void enterMonthlyIncome(String income) {
		monthlyIncome.sendKeys(income);
	}

	public void enterEmployerName(String employer) {
		employerName.sendKeys(employer);
	}

	public void clickSelectNextPayDay() {
		selectNextPayDay.click();
	}

	public void enterNextPayDay() {
		nextPayDay.click();
	}

	public void selectFreqOfIncome(int indexPoint) {
		Select dropdown = new Select(freqOfIncome);
		dropdown.selectByIndex(indexPoint);
	}

	public void selectMortgageRent(String maxValue) {
		Select dropdown = new Select(mortgageRent);
		dropdown.selectByValue(maxValue);
	}

	public void selectCreditCommitments(String maxValue) {
		Select dropdown = new Select(creditCommitments);
		dropdown.selectByValue(maxValue);
	}

	public void selectUtilitiesBills(String maxValue) {
		Select dropdown = new Select(utilitiesBills);
		dropdown.selectByValue(maxValue);

	}

	public void selectTransportBills(String maxValue) {
		Select dropdown = new Select(transportBills);
		dropdown.selectByValue(maxValue);
	}

	public void selectFoodBills(String maxValue) {
		Select dropdown = new Select(foodBills);
		dropdown.selectByValue(maxValue);
	}

	public void selectOtherRegularOutgoings(String maxValue) {
		Select dropdown = new Select(otherRegularOutgoings);
		dropdown.selectByValue(maxValue);
	}

	public void enterMobileNumber(String mNumber) {
		mobileNumber.sendKeys(mNumber);
	}

	public void enterEmailAddress(String emailAdd) {
		emailAddress.sendKeys(emailAdd);
	}

	public void enterConfirmEmailAddrress(String confirmEmail) {
		confirmEmailAddrress.sendKeys(confirmEmail);
	}

	public void selectContactPreference() {
		contactPreference.click();
	}

	public void selectConfirmAccuracy() {
		confirmAccuracy.click();
	}

	public void selectPrivacyPolicy() {
		privacyPolicy.click();
	}

	public void selectBtnNext() {
		btnNext.click();
	}
}