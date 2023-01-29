Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Withdrawal from the wallet exactly as much as was paid into it
    Given I have deposited $100 in my wallet
    When I request $100
    Then $100 should be dispensed

  Scenario: Withdrawal of more money from the wallet than was deposited into it
    Given I have deposited $300 in my wallet
    When I request $400
    Then $400 should be dispensed