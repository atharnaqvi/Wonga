@tag
Feature: Testing 6 Month Felxi Loan option on Wonga.com
  Description: This feature is going to fill in the form

  @tag1
  Scenario: Select the 6 Month FlexiLoan option
    Given User is on the Wonga.com
    When User click on the Apply Button
    Then user is on sixMonthLoan Page

  @tag2
  Scenario: Set Loan Amount and repayment start date
    Given User is on the flexiloan-6 page
    When User set the Amount
    And set the start repayment date
    And Apply
    Then I should see before-you-apply page to sart the application

  @tag3
  Scenario: Start new application
    Given User is on the Your details page
    When User select the title
    And Fillin first name
    And Fillin Last Name
    And Select Day of Birth as 1
    And Select Month of Birth as 1
    And Select Year of Birth as 1980
    And Select Home Status as tenant
    And Select Number of Dependants
    And Select Employment status as Full time
    And Fillin monthly income
    And Fillin Employer name
    And Select Next Payday from Callendar
    And Selct Frequency of Income as Monthly
    And Select Mortgage rent as 651 700
    And Select Credit commitments 0 50
    And Select Utilties bills 301 350
    And Select Transport 51 100
    And Select Food 301 350
    And Select other Regular 0 50
    And Fillin Mobile Number as 07812345678
    And Fillin Email address as abcd@gmail.com
    And Fillin Confirm Email address as abcd@gmail.com
    And Select Contact type radio button of Email
    And Select confirm accurate information varification radio button
    And Select Privacy Policy radio button
    And Click Next Button
    Then System return Your Current Address page

  @tag4
  Scenario: Enter postal address
    Given user is on the "https://www.wonga.com/address" page
    When Click on the option "Enter your address manually
    And Fillin House name as Clpaham Place
    And Fillin House Number as 22
    And Fillin Street Name Bradwell Common
    And Fillin city as Milton Keynes
    And Fillin postcode as MK134ES
    And Select durration of living there as 3 to 4 years
    And Click Next
    Then I shall land on https://www.wonga.com/account page and test end here with success
