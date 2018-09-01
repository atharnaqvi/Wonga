package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageFactory.HomePagePOM;
import PageFactory.RequireAmountPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sixMonthLoanSteps {
	 WebDriver driver; 
	 String baseURL;
	 HomePagePOM sixMonthLoan;
	 RequireAmountPOM setAmount;

	
	@Given("^User is on the Wonga\\.com$")
	public void user_is_on_the_Wonga_com()  {
		driver = new FirefoxDriver();
		baseURL = "https://www.wonga.com";
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseURL);
	    sixMonthLoan = new HomePagePOM(driver);
	    setAmount = new RequireAmountPOM(driver);
	}

	@When("^User click on the Apply Button$")
	public void user_click_on_the_Apply_Button()  {
		sixMonthLoan.SelectSixMonthLoanOption();
	}

	@Then("^user is on sixMonthLoan Page$")
	public void it_open_the_flexiloan_page_where_I_can_set_the_amount_required(int arg1)  {
		String title = sixMonthLoan.validateHomePageTitle();
		Assert.assertEquals("Wonga 6 month Flexi Loan | Repay over 6 months | Wonga", title);
	}

	@Given("^User is on the flexiloan-(\\d+) page$")
	public void user_is_on_the_flexiloan_page(int arg1)  {
		
		 
	}

	@When("^User set the Amount$")
	public void user_set_the_Amount()  {
	  setAmount.enterSetAmount("400");
	}

	@When("^set the start repayment date$")
	public void set_the_start_repayment_date()  {
	 
	}

	@When("^Apply$")
	public void apply()  {
	    
	}

	@Then("^I should see before-you-apply page to sart the application$")
	public void i_should_see_before_you_apply_page_to_sart_the_application()  {
	    
	}

	@Given("^User is on the Your details page$")
	public void user_is_on_the_Your_details_page() {
	   
	}

	@When("^User select the title$")
	public void user_select_the_title()  {
	   
	}

	@When("^Fillin first name$")
	public void fillin_first_name() {
	    
	}

	@When("^Fillin Last Name$")
	public void fillin_Last_Name()  {
	   
	}

	@When("^Select Day of Birth as (\\d+)$")
	public void select_Day_of_Birth_as(int arg1)  {
	    
	}

	@When("^Select Month of Birth as (\\d+)$")
	public void select_Month_of_Birth_as(int arg1)  {
	 
	}

	@When("^Select Year of Birth as (\\d+)$")
	public void select_Year_of_Birth_as(int arg1) {
	    
	}

	@When("^Select Home Status as tenant$")
	public void select_Home_Status_as_tenant() {
	    
	}

	@When("^Select Number of Dependants$")
	public void select_Number_of_Dependants()  {
	   
	}

	@When("^Select Employment status as Full time$")
	public void select_Employment_status_as_Full_time() {
	   
	}

	@When("^Fillin monthly income$")
	public void fillin_monthly_income(){
	    
	}

	@When("^Fillin Employer name$")
	public void fillin_Employer_name()  {
	    
	}

	@When("^Select Next Payday from Callendar$")
	public void select_Next_Payday_from_Callendar() {
	    
	}

	@When("^Selct Frequency of Income as Monthly$")
	public void selct_Frequency_of_Income_as_Monthly()  {
	   
	}

	@When("^Select Mortgage rent as (\\d+) (\\d+)$")
	public void select_Mortgage_rent_as(int arg1, int arg2) {
	    
	}

	@When("^Select Credit commitments (\\d+) (\\d+)$")
	public void select_Credit_commitments(int arg1, int arg2)  {
	    
	}

	@When("^Select Utilties bills (\\d+) (\\d+)$")
	public void select_Utilties_bills(int arg1, int arg2) {
	  
	}

	@When("^Select Transport (\\d+) (\\d+)$")
	public void select_Transport(int arg1, int arg2)  {
	    
	}

	@When("^Select Food (\\d+) (\\d+)$")
	public void select_Food(int arg1, int arg2)  {
	  
	}

	@When("^Select other Regular (\\d+) (\\d+)$")
	public void select_other_Regular(int arg1, int arg2) {
	    
	}

	@When("^Fillin Mobile Number as (\\d+)$")
	public void fillin_Mobile_Number_as(int arg1)  {
	   
	}

	@When("^Fillin Email address as abcd@gmail\\.com$")
	public void fillin_Email_address_as_abcd_gmail_com()  {
	 
	}

	@When("^Fillin Confirm Email address as abcd@gmail\\.com$")
	public void fillin_Confirm_Email_address_as_abcd_gmail_com() {
	    
	}

	@When("^Select Contact type radio button of Email$")
	public void select_Contact_type_radio_button_of_Email()  {
	   
	}

	@When("^Select confirm accurate information varification radio button$")
	public void select_confirm_accurate_information_varification_radio_button() {
	   
	}

	@When("^Select Privacy Policy radio button$")
	public void select_Privacy_Policy_radio_button(){
	    
	}

	@When("^Click Next Button$")
	public void click_Next_Button()  {
	   
	}

	@Then("^System return Your Current Address page$")
	public void system_return_Your_Current_Address_page()  {
	    
	}

	@Given("^user is on the \"([^\"]*)\" page$")
	public void user_is_on_the_page(String arg1)  {
	    
	}

	@When("^Click on the option \"Enter your address manually$")
	public void click_on_the_option_Enter_your_address_manually()  {
	   
	}

	@When("^Fillin House name as Clpaham Place$")
	public void fillin_House_name_as_Clpaham_Place() {
	    
	}

	@When("^Fillin House Number as (\\d+)$")
	public void fillin_House_Number_as(int arg1)  {
	   
	}

	@When("^Fillin Street Name Bradwell Common$")
	public void fillin_Street_Name_Bradwell_Common()  {
	   
	}

	@When("^Fillin city as Milton Keynes$")
	public void fillin_city_as_Milton_Keynes()  {
	
	}

	@When("^Fillin postcode as MK(\\d+)ES$")
	public void fillin_postcode_as_MK_ES(int arg1) {
	    
	}

	@When("^Select durration of living there as (\\d+) to (\\d+) years$")
	public void select_durration_of_living_there_as_to_years(int arg1, int arg2) {
	   
	}

	@When("^Click Next$")
	public void click_Next()  {
	    
	}

	@Then("^I shall land on https://www\\.wonga\\.com/account page and test end here with success$")
	public void i_shall_land_on_https_www_wonga_com_account_page_and_test_end_here_with_success()  {
	    
	}

	

}
