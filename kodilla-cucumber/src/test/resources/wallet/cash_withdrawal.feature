Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Withdrawal from the wallet exactly as much as was paid into it
    Given I have deposited $100 in my wallet
    When I request $100
    Then $100 should be dispensed
    And the balance of my wallet should be $0