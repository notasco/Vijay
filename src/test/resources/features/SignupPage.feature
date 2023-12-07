Feature: Signup Page Functionality
<<<<<<< HEAD

@IN-TC-3
  Scenario: Verify user is able to navigate to different pages from sign up page
   Given User is on the sign-up page
   Then  Validate user is landed on sign up page "New user?"
   When  User navigates to the Terms page
   Then  Validate user is landed on terms page "Instalanes"
   When  User navigates to the AlreadyRegistered Login page
   Then  Validate user landed on AlreadyRegistered Login page "Log in"
   When  User navigates to the Policy page
   Then  Validate user is landed on Policy page "Instalanes"


  @IN-TC-1
  Scenario: Verify user is able to register on Instalanes
    When User enters Firstname as "John"
    And User enters Lastname as "Berlins"
    And User click organisation role dropDown
    And User select organisation role option
    And User click  code dropDown
    And User select code option
    And User enters number as "9909090934"
    And User click Phone verfication and Enter otp into the textfields
    And User given Phone otp should verfied
    And User enters email as "john.berli@gmail.com"
    And User click Email verfication and Enter otp into the textfields
    And User given Email otp should verfied
    And User enter password as "Hello9290"
    And User click on sign-up button
    Then HomePage Title should be "INSTALANES"
    And User click LogOut and close Browser

  @IN-TC-42
  Scenario: Verify user self-profile details are displayed
    Given User opens URL "https://frontendnewopt.vercel.app/login"
    And Validate user landed on Login page "Log in"
    And User enters Email as "vijaybmvj.821@gmail.com"
    And User enters password as "HINATAmvj1189@#"
    And User click on Login button and HomePage should be Dispaly
    And Validate user landed on Homepage "Instalanes"
    When User navigates to the profile page
    And Validate user landed on profile page "Healthcart"
    Then Validate user username on profile page "vijaybmvj.821@gmail.com"
    And Validate user phone number on profile page "+91 9988773344"
    And validate user FirstName on profile page "Muthu"
    And Validate user LastName on profile page "Vijay"
    And User click on Logout button and close browser
=======
@smoketest1
  Scenario: User can sign up successfully
  
   When user enters Firstname as "John"
   And user enters Lastname as "Peter"
    And user click organisation role dropDown
    And user select organisation role option
    And user click  code dropDown 
    And user select code option
    And user enters number as "9909090889"
    And user enters email as "john.peter@gmail.com"
    And user enters password as "Hello9290"
    And user click on sign-up button
    Then HomePage Title should be "INSTALANES"
>>>>>>> d13b6159ecede8b4e0a128deff6de411ceb857bb
