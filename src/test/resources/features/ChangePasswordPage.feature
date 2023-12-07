Feature: feature to test ChangePassword functionality
@IN-TC-18
  Scenario: Verify user is able to change password via Change Password sub menu in Profile
  
  When Users opens URL "https://frontendnewopt.vercel.app/login"
  And  User Enters Email as "vijaybmvj.821@gmail.com" 
  And  User Enters password as "HINATAmvj1189@"
  And  User click on Login 
  Then HomePage Title Should Be "INSTALANES"
  Then User click on SubMenu in profile 
  And  User click on ChangePassword 
  And Validate ChangePassword Title should be "Change password"
  And User Enter Current password "HINATAmvj1189"
  And User Enter New Password "HINATAmvj1189@"
  And  User Enter Conform PassWord "HINATAmvj1189@##"
  And  User click on ChangePassword Link
  When User Only Click on Log out link 
  And  User Enters Email as "vijaybmvj.821@gmail.com"
  And Validate Changed password in Login Password TextField "HINATAmvj1189@##"
   And User click on Login Link
  When User Only Click on LogOut link 
  Then User Close Browser
   

@IN-TC-19
   Scenario: Verify user is able to change password via Settings page 
  Given User opens URL in browser "https://frontendnewopt.vercel.app/login"
  When  Users Only Enters Email as "vijaybmvj.821@gmail.com" 
  And  Users Only Enters Password as "HINATAmvj1189"
  And  Users click on Login button
  Then Validate homepage Title should be "INSTALANES"
  Then Users click on subMenu In profile 
  And  Users click on Setting link
  And Validate Settings Title should be "Settings"
  And User Validate changePassword Title Should be "Change password"
  And Users Enter currentpassword as "HINATAmvj1189"
  And Users Enter newPassword as "HINATAmvj1189@"
  And  Users Enter conformPassWord as "HINATAmvj1189@"
  And  Users click on ChangePassword button
  When Users Click on Logout button
  And  Users Enters Email  "vijaybmvj.821@gmail.com"
  And User Enter Changedpassword In Password as "HINATAmvj1189@"
  And User click on Login Button
  Then User Validate homepage Title should be "INSTALANES"
  When Users Click on LogOut button
  Then Users Close Browser
   
   
   
   
   
   
   
   