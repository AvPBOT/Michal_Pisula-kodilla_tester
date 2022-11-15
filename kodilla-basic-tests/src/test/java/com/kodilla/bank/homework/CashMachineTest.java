package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTest {

    @Test
    public void testZeroTransactions() {
        CashMachine transactions = new CashMachine(0);
        int[] values = transactions.getTransactions();
        assertEquals(0, CashMachine.getNumberOfTransactions());
    }

    @Test
    public void testAddTransactions() {
        CashMachine transactions = new CashMachine(0);
        transactions.addTransaction(400);
        transactions.addTransaction(-200);

        int[] values = transactions.getTransactions();
        assertEquals(2, CashMachine.getNumberOfTransactions());
        assertEquals(400, values[0]);
        assertEquals(-200, values[1]);
    }

    @Test
    public void testNotAddTransactionsWithValueZero() {
        CashMachine transactions = new CashMachine(0);
        transactions.addTransaction(0);
        transactions.addTransaction(0);
        transactions.addTransaction(400);
        transactions.addTransaction(-200);
        assertEquals(2, CashMachine.getNumberOfTransactions());
    }

    @Test
    public void testGetBalancePositive() {
        CashMachine transactions = new CashMachine(0);
        transactions.addTransaction(400);
        transactions.addTransaction(-200);
        transactions.addTransaction(-300);
        transactions.addTransaction(700);
         assertEquals(600, CashMachine.getBalance());
    }

    @Test
    public void testGetBalanceNegative() {
        CashMachine transactions = new CashMachine(0);
        transactions.addTransaction(400);
        transactions.addTransaction(-200);
        transactions.addTransaction(-300);
        transactions.addTransaction(700);
        transactions.addTransaction(-800);
        assertEquals(-200, CashMachine.getBalance());
    }

    @Test
    public void testGetBalanceZero() {
        CashMachine transactions = new CashMachine(0);
        transactions.addTransaction(400);
        transactions.addTransaction(-400);
        assertEquals(0, CashMachine.getBalance());
    }
}
