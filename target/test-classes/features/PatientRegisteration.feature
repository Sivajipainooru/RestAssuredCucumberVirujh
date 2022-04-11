Feature: This feature checking the registeration process


#Scenario Outline: TC002 Verify the registeration process 
#Given I get request from the body "<phone>","<email>","<password>","<firstName>","<lastName>","<dateOfBirth>","<country>","<address>","<state>","<pincode>","<gender>"
#When It triggers the api to "/api/auth/patientRegistration"
#Then I verify the responsedata
#Examples:
#           | phone    | email      | password | firstName | lastName | dateOfBirth | country | address | state      | pincode | gender |
#           |9769998654|adsvhgff@gmail.com|Sivaji578@|Sivaji     |P         |02-09-1999   |India    |Nellore  |Andrapradesh|524474   |Male    |
##@testMe
Scenario Outline: TC003 Verify the patient login based on change password
Given I get request from the body for changing password "<phone>","<password>"
When I trigger api to "/api/auth/patientLogin"
Then I verify the data and get the accessToken from response
Examples:
         | phone      | password   |
         | 9092155672 | 123456 |    
Scenario Outline: TC006 Verify the PatientPastAppointment list
Given I get request from the query params "<KEY>","<VALUE>","<KEY1>","<VALUE1>"
When I get triggers the api to "/api/calendar/patient/pastAppointmentsList"
Then I verify the PastAppointment data
Examples:   
           | KEY              | VALUE      | KEY1             | VALUE1  |
           | limit            | 8          | paginationNumber | 0       |
@TestMe           
Scenario Outline: TC007 Verify the UpcomingAppointmentList
Given I get request from the query params "<KEY>","<VALUE>","<KEY1>","<VALUE1>" 
When I get triggers the api to "/api/calendar/patient/upcomingAppointmentsList"  
Then I verify the upcomingappointment list
Examples:
         | KEY       | VALUE | KEY1             | VALUE1    | 
         |limit      |  7      | paginationNumber | 0         |
            
Scenario Outline: TC008 Verify the UpcomingAppointment list
Given I get request from the query params to upcoming appointment list "<Key>","<Value>","<Key1>"
When I get url from the api to "/api/calendar/patient/appointmentDoctorDetails"
Then I verify the response of the appointment list    
Examples: 
         | Key       | Value  | Key1          |
         | doctorKey | Doc_211| appointmentId |
Scenario Outline: TC012 Verify the Patient edite details page data
Given I get request from the body for edite patient details "<PatientId>","<phone>","<email>","<password>","<firstName>","<lastName>","<dateOfBirth>","<country>","<address>","<state>","<pincode>","<gender>"  
When I triggers api to "/api/calendar/patient/detailsEdit"  
Then I verify the response of the body
Examples:
            | phone    | email      | password | firstName | lastName | dateOfBirth | country | address | state      | pincode | gender |
           |9769998654|adsvhgff@gmail.com|Sivaji578@|Sivaji     |P         |02-09-1999   |India    |Nellore  |Andrapradesh|524474   |Male    | 
                
           
          