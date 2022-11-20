package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTest {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine atm = new CashMachine();
        assertEquals(0, atm.getNumberOfTransactions());
    }

    @Test
    public void shouldAddTransactions() {
        CashMachine atm = new CashMachine();
        atm.addTransaction(400);
        atm.addTransaction(-200);
        atm.addTransaction(500);
        atm.addTransaction(700);
        atm.addTransaction(-800);
        assertEquals(5, atm.getNumberOfTransactions());
    }

    @Test
    public void shouldNotAddTransactionsWithAmountZero() {
        CashMachine atm = new CashMachine();
        atm.addTransaction(0);
        atm.addTransaction(0);
        atm.addTransaction(0);
        assertEquals(0, atm.getNumberOfTransactions());
    }

    @Test
    public void shouldCountTheBalance() {
        CashMachine atm = new CashMachine();
        atm.addTransaction(400);
        atm.addTransaction(-200);
        atm.addTransaction(500);
        atm.addTransaction(700);
        atm.addTransaction(-800);
        assertEquals(600, atm.getBalance());
    }

    @Test
    public void shouldCountTheNumberOfDeposits() {
        CashMachine atm = new CashMachine();
        atm.addTransaction(400);
        atm.addTransaction(-200);
        atm.addTransaction(500);
        atm.addTransaction(700);
        atm.addTransaction(-800);
        assertEquals(3, atm.getNumberOfDeposits());
    }

    @Test
    public void shouldCountTheNumberOfWithdrawals() {
        CashMachine atm = new CashMachine();
        atm.addTransaction(400);
        atm.addTransaction(-200);
        atm.addTransaction(500);
        atm.addTransaction(700);
        atm.addTransaction(-800);
        assertEquals(2, atm.getNumberOfWithdrawals());
    }

    @Test
    public void shouldCountTheAverageDeposit() {
        CashMachine atm = new CashMachine();
        atm.addTransaction(400);
        atm.addTransaction(-200);
        atm.addTransaction(500);
        atm.addTransaction(700);
        atm.addTransaction(-800);
        assertEquals(533.33, atm.getAverageDeposit(), 0.01);
    }

    @Test
    public void shouldCountTheAverageWithdrawal() {
        CashMachine atm = new CashMachine();
        atm.addTransaction(400);
        atm.addTransaction(-200);
        atm.addTransaction(500);
        atm.addTransaction(700);
        atm.addTransaction(-800);
        assertEquals(-500, atm.getAverageWithdrawal(), 0.01);
    }
}