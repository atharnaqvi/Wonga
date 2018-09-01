package testCase;

/*import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;*/
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Page Object Model import
import PageFactory.HomePagePOM;
import PageFactory.RequireAmountPOM;
import PageFactory.NewApplicationPOM;
import PageFactory.PersonalDetailPOM;
import PageFactory.ContactInfoPOM;

public class SixMonthFlexiLoan {
	WebDriver driver;
	String baseURL;
	HomePagePOM sixMonthLoan;
	RequireAmountPOM setAmount;
	NewApplicationPOM startApp;
	PersonalDetailPOM yourDetails;
	ContactInfoPOM contactInfo;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://www.wonga.com";

		sixMonthLoan = new HomePagePOM(driver);
		setAmount = new RequireAmountPOM(driver);
		startApp = new NewApplicationPOM(driver);
		yourDetails = new PersonalDetailPOM(driver);
		contactInfo = new ContactInfoPOM(driver);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseURL);
		
	}

	@Test
	public void test() {
		sixMonthLoan.SelectSixMonthLoanOption();

		setAmount.enterSetAmount("400");
		setAmount.clickSelectCalendar();
		setAmount.clickSetDate();
		setAmount.clickApplyNow(1);
		
		startApp.startNewApplication();

		// Your name
		yourDetails.clickYourTitle("Mrs", 1); // Explicit wait 1 second
		yourDetails.enterFirstName("Tim");
		yourDetails.enterLastName("Tom");

		// Personal details
		yourDetails.clickDayDOB("24");
		yourDetails.clickMonthDOB("9");
		yourDetails.clickYearDOB("1980");

		yourDetails.selectHomeStatus(2); // index int value
		yourDetails.selectNoOfDependents("4");

		// Employment details
		yourDetails.selectEmploymentStatus(2); // index int value
		yourDetails.enterMonthlyIncome("2000");
		yourDetails.enterEmployerName("Wonga.com");
		yourDetails.clickSelectNextPayDay(); 
		yourDetails.enterNextPayDay(); 
		yourDetails.selectFreqOfIncome(1);

		// Monthly expenses
		// select multiples of 50 as a maximum value
		yourDetails.selectMortgageRent("150");
		yourDetails.selectCreditCommitments("200");
		yourDetails.selectUtilitiesBills("100");
		yourDetails.selectTransportBills("50");
		yourDetails.selectFoodBills("300");
		yourDetails.selectOtherRegularOutgoings("100");

		// Contacting you:
		yourDetails.enterMobileNumber("07812345678");
		yourDetails.enterEmailAddress("abcdef@gmail.com");
		yourDetails.enterConfirmEmailAddrress("abcdef@gmail.com");
		yourDetails.selectContactPreference();
		yourDetails.selectConfirmAccuracy();
		yourDetails.selectPrivacyPolicy();
		yourDetails.selectBtnNext();

		// Your current Address
		// Enter manually
		contactInfo.selectManualAddress(1);
		contactInfo.enterFlatNumber("14");
		contactInfo.enterHouseName("Cavendish House");
		contactInfo.enterHouseNumber("14");
		contactInfo.enterStreetName("Cavendish Place");
		contactInfo.enterTownName("London");
		contactInfo.enterPostCode("W1G 9DJ");
		contactInfo.selectDuration(4);
		contactInfo.clickSubmitAppliction();
	}

	@After
	public void tearDown() throws Exception {
	}
}