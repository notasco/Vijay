Feature: ForgotPassword Functionality
@IN-TC-11
Scenario: Verify user is able to reset forgot password using valid and registered Email id
When user Place a URl in Browser "https://frontendnewopt.vercel.app/login"
When User click on ForgotPassword button
And User Validate ForgotPassword Title should be "Forgot password ?"
And User enter valid Email id into the Email Textfiled "vijaybmvj.821@gmail.com"
And User click on Generate Otp button
And User Enter Otp in Otp TextField
And User Validate Setup Password title should be "Set up Password"
And User enter New Password "HINATAmvj1189@"
And User enter conform password "HINATAmvj1189@"
And User click on Setup password button 
And User validate Login Page Title Should be "Log in"
And User Enter Email into Email TextField "vijaybmvj.821@gmail.com"
And User Enter new Password into the password textfiled "HINATAmvj1189@"
And user validate homePage Title "INSTALANES"
And user click on Logout button
And user close on browser 

@IN-TC-12
Scenario: Verify user is able to reset forgot password using valid and registered Mobile number
When users Place a URl in Browser "https://frontendnewopt.vercel.app/login"
When Users click on ForgotPassword button
And Users Validate ForgotPassword Title should be "Forgot password ?"
And Users enter valid Mobile Number into the Mobile Textfiled "9988773344"
And Users Click on generate otp button
And Users Enters Otp in Otp TextField
And Users Validate Setup Password title should be "Set up Password"
And Users enter newPassword "HINATAmvj1189@"
And Users enter conformPassword "HINATAmvj1189@"
And Users click on SetupPassword button 
And Users validate LoginPage Title Should be "Log in"
And Users Enters Mobile Number into Mobile TextField "9988773344"
And Users Enters New Password into the password textfiled "HINATAmvj1189@"
And users validate homePage Title "INSTALANES"
And users click on Log out button
And users close Browser 

@IN-TC-16
Scenario: Verify user is able to navigate to different pages from forgot password page
When User is on LoginPage and click on forgorPassword Button
And User validate Forgotpassword Page Title should be "Forgot password ?"
And User Navigate To LoginPage 
And User Validate Login Title should be "Log in"
And User Navigate to SignupPage 
And User Validate SignupPage Title should be "New user?"
And User close Browser
 

















