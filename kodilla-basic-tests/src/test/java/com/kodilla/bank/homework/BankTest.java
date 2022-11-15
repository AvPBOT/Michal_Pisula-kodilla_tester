package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static com.kodilla.bank.homework.Bank.getNumberOfMachines;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTest {

    @Test
    public void testAddCashMachines() {
        Bank bank = new Bank();
        bank.addMachine(new CashMachine(0));;
        bank.addMachine(new CashMachine(0));;
        bank.addMachine(new CashMachine(0));;
        assertEquals(3, getNumberOfMachines());
    }
}