Feature: I want to create calculator

  @Addition @Numeric
  Scenario: Vefiy Sustract functionality with positive numbers
    Given two numbers 5 and 6 are given
    And and both are "positive"
    When I perfom "substract" operation
    Then I will get "postive" response
    
    
 @Addition @Numeric
  Scenario: Vefiy substract functionality with negative numbers
    Given two numbers 1 and -2 are given
    And and both are "nagative"
    When I perfom "substract" operation
    Then I will get "negative" response