Feature: I want to create calculator

  @Addition @Numeric
  Scenario: Vefiy Add functionality with positive numbers
    Given two numbers 1 and 2 are given
    And and both are "positive"
    When I perfom "add" operation
    Then I will get "postive" response
    
    
 @Addition @Numeric
  Scenario: Vefiy Add functionality with negative numbers
    Given two numbers 0 and -2 are given
    And and both are "negative"
    When I perfom "add" operation
    Then I will get "negative" response