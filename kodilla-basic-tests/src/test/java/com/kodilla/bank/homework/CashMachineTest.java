package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashMachineTest {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(200);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(400, transactions[0]);
        assertEquals(200, transactions[1]);
    }

    @Test
    public void shouldNotAddTransactionsWithAmountZero() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(0);
        cashMachine.addTransaction(0);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getAverage(), 0.0001);
    }

    @Test
    public void shouldCalculateAverage() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(500);
        assertEquals(366.66, cashMachine.getAverage(), 0.01);
    }

    @Test
    public void shouldCountTheNumberOfDeposits() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(700);
        cashMachine.addTransaction(-800);
        assertEquals(3, cashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldCountTheNumberOfWithdrawals() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(700);
        cashMachine.addTransaction(-800);
        assertEquals(2, cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldCountTheAverageDeposit() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(700);
        cashMachine.addTransaction(-800);
        assertEquals(533.33, cashMachine.getAverageDeposit(), 0.01);
    }

    @Test
    public void shouldCountTheAverageWithdrawal() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(700);
        cashMachine.addTransaction(-800);
        assertEquals(-500, cashMachine.getAverageWithdrawal(), 0.01);
    }
}