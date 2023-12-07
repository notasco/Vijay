@IN-TC-6
Feature: feature to test login functionality

  Scenario: Verify user is able to login using valid and registered Email id and password
  
  Given User opens browser and enter URL "https://frontendnewopt.vercel.app/login"
  And User enters Email "vijaybmvj.821@gmail.com" 
  And User enters password "HINATAmvj1189@#"
  And Click on Login 
  Then Page Title should be "INSTALANES"
  When User click on Log out link 
  Then close browser
  
  
  @IN-TC-8
  Scenario: Verify user is able to login using valid and registered Mobile number and password
  
  Given User open URL "https://frontendnewopt.vercel.app/login"
  And  User enters Mobile as "9988773344" 
  And Users enters Password "HINATAmvj1189@#"
  And User Click on Login 
  Then Validate HomePage Title should be "INSTALANES"
  When User click on Log out 
  Then User close browser
  
  
 @IN-TC-9
  Scenario: Verify user is able to navigate to different pages from Login page
  
  Given User only opens URL "https://frontendnewopt.vercel.app/login"
  And User only enters Email as "vijaybmvj.821@gmail.com" 
  And User only enter password as "HINATAmvj1189@#"
  And User Only click on Login 
  Then User homePage Title should be "INSTALANES"
  Then User click on Vechicle Module 
  And  User VehiclePage Title Should be "Vehicles(10)"
  Then User click on Driver Module
  And  User DriverPage Title Should be "Drivers(10)"
  Then User click on document Module 
  And  User DocumentPage Titl should be "Document(2)"
  When User Only click on Log out link 
  Then User only close browser
  
  