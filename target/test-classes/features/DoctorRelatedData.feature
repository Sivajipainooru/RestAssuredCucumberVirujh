Feature: Here we are checking the doctor details 
@TestMe
Scenario Outline:TC012 Verify the wheather selenium code working or not here
Given I get data from the user "<EmailID>","<Password>"
When I entered all text fields data here
Then Verify the output wheather we are getting the token or not
Examples:   
        | EmailID          | Password    |
        | mango@gmail.com | Mango@1990 |
            
@TestMe
Scenario Outline: TC003 Verify the patient login based on change password
Given I get request from the body for changing password "<phone>","<password>"
When I trigger api to "/api/auth/patientLogin"
Then I verify the data and get the accessToken from response
Examples:
         | phone      | password   |
         | 9092155672 | 123456 |
Scenario: TC009 Verify the doctor list data
Given I get request from the accesstokes data
When  I get triggers the api to "/api/calendar/patient/doctorList"
Then I verify the doctor response
@TestMe
Scenario Outline: TC010 Verify the DoctorlistByhospitalId
Given I get request the data from  body "<key>","<key1>"
When I get triggers the api to "/api/calendar/patient/doctorListByHospitalId"
Then I verify the response of DoctorlistByHospitalId
Examples:
          | key       | key1            |
          | patientId | hospitalPofileId| 
@TestMe
Scenario Outline:TC011 Verify the findDoctorByCodeOrName ticket
Given I gets data from the body "<codeOrName>"
When I trigger api to "/api/calendar/patient/findDoctorByCodeOrName"
Then I verify the response of findDoctorByCodeOrName 
Examples:  
            | codeOrName |
            | K          |

            
            