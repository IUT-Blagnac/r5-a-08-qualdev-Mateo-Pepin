Feature: An example

  Scenario: The example
    Given an example scenario
    When all step definitions are implemented
    Then the scenario passes

Feature: Is it friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't friday
    Given today is Sunday7
    When I ask whether it's Friday yet
    Then I should be told "Nope"