@Calculator
Feature: Test calculator
  
  Scenario: Two numbers add
    Given Input the first num is 20
    And Input the second num is 40
    When Two numbers add
    Then The result should be 60