@calculatorTable
Feature: Adding two numbers
Background:
Given I have two numbers

Scenario Outline: Add two numbers
When I have two numbers <number1> <number2>
Then I receive <result>

Examples:
|number1|number2|result|
|1      |1      |2     |
|50     |50     |100   |
