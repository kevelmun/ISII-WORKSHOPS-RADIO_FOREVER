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

Feature: Calculate the insurance prime for a customer

  
  Scenario: The customer is a man 24 years old, married with valid driven license
    Given is a male
    And 24 years old
    And is married
    And with a valid driven license
    When Calculate the premium
    Then Show 500 
    
  Scenario Outline: The customer is
    Given is <sex>
    And is <age> years old 
    And is <status_marital>
    And <without> valid license
    When  Calculate the premium
    Then Show <answer>

    Examples: 
      | sex    | age | status_marital  | without | answer |
      | male   |  24 |        married  |    with |    500 |
      | female |  15 |    not married  |    with |     -1 |
      | female |  88 |        married  | without |     -1 |
