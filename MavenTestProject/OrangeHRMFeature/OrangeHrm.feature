#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: OrangeHRM Test


  Scenario: Test Login
    Given Browser is open
    And login page is visited
    When I enter the credentials
    Then user should be successfully logged in
    
#continue when scenario 1 has completed the execution
#requires user to be logged in
#User is logged in but in scenario 1 not in scenario 2

   Scenario: Test Admin
     When I click on Admin
     Then optios under should be displayed    

