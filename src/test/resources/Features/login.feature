Feature: Login page Automation of saucedemo app


Scenario: Check login is Successful with valid credentials
    Given user is on the login page
    When the user enters valid username and password
    And clicks on the login button
    Then the user is navigate page
    And close the browser
    
    
    
    

  #Scenario Outline: Check login is Successful with valid credentials
    #Given user is on the login page
    #When the user enters valid "<username>" and "<password>"
    #And clicks on the login button
    #Then the user is navigate page
    #And close the browser
#
    #
 #Examples:
 #
 #|username|password|
 
 
#|standard_user| secret_sauce|
#|locked_out_user|secret_sauce|
#|problem_user|secret_sauce|
#|performance_glitch_user|secret_sauce|