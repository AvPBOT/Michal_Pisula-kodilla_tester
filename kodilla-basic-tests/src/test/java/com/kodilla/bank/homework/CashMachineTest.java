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
        cashMachine.add(400);
        cashMachine.add(200);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(400, transactions[0]);
        assertEquals(200, transactions[1]);
    }

    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getAverage(), 0.0001);
    }

    @Test
    public void shouldCalculateAverage() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(400);
        cashMachine.add(200);
        cashMachine.add(500);

        assertEquals(366.66, cashMachine.getAverage(), 0.01);
    }
}