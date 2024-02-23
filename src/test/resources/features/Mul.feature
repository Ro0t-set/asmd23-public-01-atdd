Feature: Mul numbers with a Calculator
  Background: Start with a Calculator
    Given I have a Calculator

  Scenario: Multiply two numbers
    When I multiply 3 by 5
    Then the result should be 15

  Scenario: Multiply two other numbers
    When I multiply 4 by 8
    Then the result should be 32

  Scenario: Multiply a negative number
    When I multiply -3 by 5
    Then the result should be -15