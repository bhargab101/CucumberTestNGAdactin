

Feature: Adactin login functionality
 

  @TS1
  Scenario: Login with invalid credentials
    Given Navigate to http://adactinhotelapp.com/index.php
   
    When Entered invalid username and password
  
    Then returns error message saying Invalid Login details or Your Password might have expired. Click here to reset your password
    

  @TS2
  Scenario: Login with valid credentials
    Given Navigate to http://adactinhotelapp.com/index.php
    When Entered valid username and password
    Then Navigate to search hotel page

   