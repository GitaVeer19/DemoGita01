Feature: Portal Application Login

Background:
Given Validate the browser
When Browser is triggered
Then check if browser is started

@PortalTest 
  Scenario: Home Page Default Login
    Given User is on banking landing page
    When User logs into application with "jin" and password "1234"
    Then Home page is populated
    And Cards displayed are "true"

@PortalTest
  Scenario: Home Page Default Login
  Given User is on banking landing page
    When User logs into application with "john" and password "4321"
    Then Home page is populated
    And Cards displayed are "false"
    
@PortalTest      
  Scenario: Home Page Default Login
  Given User is on banking landing page
    When User sign in into application with following details
    |jenny|abcd|john@abcd.com|Australia|244555|
    Then Home page is populated
    And Cards displayed are "false"
    #DataTable
    
@PortalTest  
 Scenario Outline: Home Page Default Login
  Given User is on banking landing page
    When User logs into application with <Username> and password <Password>
    Then Home page is populated
    And Cards displayed are "false"
  
    Examples:
    
   |Username|Password|
   |User1|Pass1|
   |User2|Pass2|
   |User3|Pass3|
   |User4|Pass4|
    
          #Parameterization   
    
    
    
    