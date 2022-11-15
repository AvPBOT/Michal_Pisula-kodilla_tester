package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTest {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine transactions = new CashMachine();
        int[] values = transactions.getCompletedTransactions();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine transactions = new CashMachine();
        transactions.useCashMachine(400);
        transactions.useCashMachine(200);

        int[] values = transactions.getCompletedTransactions();
        assertEquals(2, values.length);
        assertEquals(400, values[0]);
        assertEquals(200, values[1]);
    }
}