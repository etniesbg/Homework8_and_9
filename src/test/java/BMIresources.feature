Feature: BMI Calculator
  as a person, I want to
  calculate my BMI index,
  so I can see if I'm overweight,
  underweight or I have a normal body

  @BMICalculator @regression
    Scenario: Underweight
    Given the user in a BMI Calculator page
    When he enters "<weight>"
    And he enters "<height>"
    And he calculates
    Then Expected result must be "<BMI>" / "<BMI_category>"

      | weight | height | BMI  | BMI_category |
      | 170    | 50     | 17.3 | Underweight  |
      | 170    | 55     | 19   | Normal       |
      | 170    | 80     | 27.7 | Overweight   |
      | 170    | 100    | 34.6 | Obesity      |