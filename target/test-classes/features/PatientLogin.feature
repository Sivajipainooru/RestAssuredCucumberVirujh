Feature: Test Patient Login Scenarios
Scenario Outline: TC001 Test the Patient login data

Given I get request from the body "<phone>","<password>"
When It triggers api to "/api/auth/patient/Login"
Then I verify the response
Examples:
          | phone       | password |
          | 9874563210  | Ss12345  |
Scenario Outline: TC002 Verify the otp in patient login page
Given I get request from the body "<phone>"  
When It triggers api to "/api/auth/patient/OTPVerification"
Then I verify the response
Examples:  
          | phone      |
          | 9874563210 |
          | 9618994958 |   
#Scenario Outline: TC003 Verify the patient login based on change password
#Given I get request from the body for changing password "<phone>","<password>"
#When I trigger api to "/api/auth/patientLogin"
#Then I verify the data and get the accessToken from response
#Examples:
#         | phone      | password   |
#         | 9092155672 | 123456 |
Scenario Outline: TC004 Verify the Change password for patient
Given I get data request from the body "<oldPassword>","<newPassword>","<confirmNewPassword>" 
When I trigger api to "/api/auth/patient/changePassword"  
Then I verify the updated password response
 Examples:  
         | oldPassword | newPassword | confirmNewPassword |
         | Sivaji578@      | 123456  | 123456         |
Scenario Outline: TC005 Verify the ResetPassword link
Given I get data request from the body "<phone>"
When I trigger api to "/api/auth/patient/resetPasswordLink"
Then I verify the reset password response
Examples:
            | phone     |
            | 9092155672|        