Feature: FizzBuzz
  Scenario Outline: Is the number divisible by 3, by 5, or by 3 and 5?
    Given number is <number>
    When I ask if the number divisible by three, by five, or by three and five
    Then I should be given <response>
    Examples:
      | number | response |
      | 1 | "None" |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 6 | "Fizz" |
      | 8 | "None" |
      | 9 | "Fizz" |
      | 10 | "Buzz" |
      | 12 | "Fizz" |
      | 15 | "Fizz Buzz" |
      | 18 | "Fizz" |
      | 20 | "Buzz" |
      | 21 | "Fizz" |
      | 24 | "Fizz" |
      | 25 | "Buzz" |
      | 27 | "Fizz" |
      | 30 | "Fizz Buzz" |
      | 32 | "None" |
      | 33 | "Fizz" |
      | 35 | "Buzz" |
      | 36 | "Fizz" |