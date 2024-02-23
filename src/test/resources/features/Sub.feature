Feature: Sub numbers with a Calculator

  Background: Start with a Calculator
    Given I have a Calculator

  Scenario: Sub two numbers
    Given I have entered 50 into the calculator
    And I have entered 70 into the calculator
    When I press subtract
    Then the result should be -20 on the screen


  Scenario: Sub two numbers
    Given I have entered 50 into the calculator
    And I have entered 70 into the calculator
    When I press subtract
    Then the result should be -20 on the screen