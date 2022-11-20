package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreInRange() {
        Bank bank = new Bank();
        bank.addAtm1Transaction(400);
        bank.addAtm1Transaction(200);
        bank.addAtm1Transaction(300);
        bank.addAtm2Transaction(500);
        bank.addAtm2Transaction(100);
        bank.addAtm2Transaction(400);
        bank.addAtm3Transaction(900);
        bank.addAtm3Transaction(600);
        bank.addAtm3Transaction(700);

        double atm1Average = bank.getAtm1Average();
        double atm2Average = bank.getAtm2Average();
        double atm3Average = bank.getAtm3Average();

        assertEquals(300, atm1Average, 0.01);
        assertEquals(333.33, atm2Average, 0.01);
        assertEquals(733.33, atm3Average, 0.01);
    }

    @Test
    public void averageShouldBeZeroCashMachinesDontHaveTransactions() {
        Bank bank = new Bank();
        assertEquals(0, bank.getAverage(), 0.0001);
    }

    @Test
    public void shouldCalculateAllCashMachinesAverage() {
        Bank bank = new Bank();
        bank.addAtm1Transaction(400);
        bank.addAtm1Transaction(200);
        bank.addAtm1Transaction(300);
        bank.addAtm2Transaction(500);
        bank.addAtm2Transaction(100);
        bank.addAtm2Transaction(400);
        bank.addAtm3Transaction(900);
        bank.addAtm3Transaction(600);
        bank.addAtm3Transaction(700);
        assertEquals(455.55, bank.getAverage(), 0.01);
    }
}