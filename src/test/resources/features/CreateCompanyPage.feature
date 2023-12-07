Feature: CreateCompanyPage Functionality and  DataFlows
@IN-TC-23
Scenario: Verify user is able to create a company with valid company information
When User Login With Email Id "john.berli@gmail.com"
And User Login With password "Hello9290"
And User Click on Login button 
And User Validate HomePage Title as "Instalanes"
And User click on Sub-menu Button 
And User Click on Create Company Button in Sub-menu
And User validate Create Company Page Title should be "WELCOME TO INSTALANES, JOHN BERLINS"
And User click on Create new  company button   
And User Validate Create Company Title Should be "Create company"
And User click on Create company country DropDown
And User Select Pan option in Tax Ref DropDown
And User Enter Pan Valid Number in Tax ref textfield "GJDPM9871H"
And User enter Company Name in Company Name textfield "BmvjLogistics"
And User Select company type in Company Type Dropdwon 
And User Enter Company Identification Number "BMVJ56789"
And User Click on Review button 
And user Click on Review details check box 
And User Click on Create Company button 
And User Click on logout button in Sub-Menu
And User Close the Browser

@IN-TC-25
Scenario: Verify user is able to send Joining request to company from Company's public page
When User Login With Valid Email "john.berli@gmail.com"
And User Login With Valid password "Hello9290"
And Users click on login button 
And Users Validate HomePage Title as "Instalanes"
And User Click on Company button in Company's Public page
And user Validate Company page Title Should be "COMPANY LIST (121)"
And User Click on LoadMore Button 
And User Click on HealthCart In Company List Page
And User Click on Join Request For HealthCart Company
And User Validate Join page Title "Join Company"
And user click on join Button
And User Click on logout link
And users close the browser

@IN-TC-26
Scenario: Verify user is able to withdraw Joining request from Company's public page

When Users Login With Valid Email "john.berli@gmail.com"
And Users Login With Valid password "Hello9290"
And Users Click on Login Button 
And Users Validate HomePage Title is "Instalanes"
And Users Click on Company button in Company's Public page
And users Validate Company page Title Should be "COMPANY LIST (121)"
And Users Click on LoadMore Button 
And Users Click on HealthCart In Company List Page
And Users Click on WithDraw Request For HealthCart Company
And Users Validate WithDraw page Title "WITHDRAW REQUEST"
And Users click on WithDraw Button
And Users Click on LogOut
And Users Close The Browser








