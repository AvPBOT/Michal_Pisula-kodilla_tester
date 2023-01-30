Feature: FizzBuzz
  Scenario Outline: Is the number divisible by 3, by 5, or by 3 and 5?
    Given number is <number>
    When I ask if the number is divisible by three, by five, or by three and five
    Then I should be given <response>
    Examples:
      | number | response |
      | One | "None" |
      | Three | "Fizz" |
      | Five | "Buzz" |
      | Six | "Fizz" |
      | Eight | "None" |
      | Nine | "Fizz" |
      | Ten | "Buzz" |
      | Twelve | "Fizz" |
      | Fifteen | "Fizz Buzz" |
      | Eighteen | "Fizz" |
      | Twenty | "Buzz" |
      | TwentyOne | "Fizz" |
      | TwentyFour | "Fizz" |
      | TwentyFive | "Buzz" |
      | TwentySeven | "Fizz" |
      | Thirty | "Fizz Buzz" |
      | ThirtyTwo | "None" |
      | ThirtyThree | "Fizz" |
      | ThirtyFive | "Buzz" |
      | ThirtySix | "Fizz" |
