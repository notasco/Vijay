@smoketest
Feature: feature to test login functionality

  Scenario: Check login is successful with valid credentials
  
  Given User opens URL "https://frontendnewopt.vercel.app/login"
  And User enters Email as "vijaybmvj.821@gmail.com" 
  And User enters password as "HINATAmvj1189"
  And Click on Login 
  Then Page Title should be "INSTALANES"
  When User click on Log out link 
  Then close browser