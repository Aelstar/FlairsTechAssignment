       
 Feature: Test Admin
 Scenario: Add Data for New User
    Given i login to system and navigated to Admin page
    When I Added Data For New Users "<EmployeeName>" and "<UserName>"  and "<Password>"  and "<ConfirmPassword>"
  
    Then user Added sucessfully
    
      Examples: 
      |EmployeeName|UserName|Password|ConfirmPassword|
  	  |A|ahmed abdelstar|P@ssw0rd123|P@ssw0rd123|

  	  
  	   Scenario: Search about Added New User
    Given i login to system and navigated to Admin page and click on Search
    When I Added Data For search about New Users "<UserName>"
  
    Then user found on System
    
      Examples: 
      |UserName|
  	  |ahmed abdelstar|
  	  
  	   
  	   Scenario: Delete New Added  User
    Given i login to system and navigated to Admin page and click on Search
    When I Want To Delete New Added Users "<UserName>"
  
    Then user delted from System
    
      Examples: 
      |UserName|
  	  |ahmed abdelstar| 
  	  