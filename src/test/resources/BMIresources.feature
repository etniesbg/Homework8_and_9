Feature: BMI Calculator
  as a person, I want to
  calculate my BMI index,
  so I can see if I'm overweight,
  underweight or I have a normal body

   @regression
    Scenario Outline: data driven tests All available ways this can go
    Given the user in a BMI Calculator page
    When he enters heights "<heights1>"
    And he enters weights "<weights1>"
    And he calculates
    Then Expected BMI index must be "<bmiIndex>"
     Then Expected BMI Category must be "<bmiCategory>"
     Examples:
       | heights1 | weights1 | bmiIndex | bmiCategory |
       | 170      | 50       | 17.3     | Underweight |
       | 170      | 55       | 19       | Normal      |
       | 170      | 80       | 27.7     | Overweight  |
       | 170      | 100      | 34.6     | Obesity     |