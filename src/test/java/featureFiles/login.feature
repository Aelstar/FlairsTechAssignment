Feature: Test Login for system    
Scenario: login by valid test users
     	 Given I want to Login by valid user
   		 When I open browser login by "Admin" and "admin123" valid credintials
 	 		 Then user login sucessfully
