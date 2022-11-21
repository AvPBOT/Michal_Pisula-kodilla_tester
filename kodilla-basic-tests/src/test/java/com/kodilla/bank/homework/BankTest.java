package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void shouldCalculateBalanceOfEachCashMachine() {
        Bank bank = new Bank();
        bank.addAtm1Transaction(400);
        bank.addAtm1Transaction(600);
        bank.addAtm1Transaction(0);
        bank.addAtm1Transaction(-200);
        bank.addAtm1Transaction(-300);
        bank.addAtm2Transaction(-500);
        bank.addAtm2Transaction(0);
        bank.addAtm2Transaction(500);
        bank.addAtm2Transaction(100);
        bank.addAtm2Transaction(-400);
        bank.addAtm3Transaction(900);
        bank.addAtm3Transaction(200);
        bank.addAtm3Transaction(0);
        bank.addAtm3Transaction(-600);
        bank.addAtm3Transaction(-700);

        double atm1Balance = bank.getAtm1Balance();
        double atm2Balance = bank.getAtm2Balance();
        double atm3Balance = bank.getAtm3Balance();

        assertEquals(500, atm1Balance, 0.01);
        assertEquals(-300, atm2Balance, 0.01);
        assertEquals(-200, atm3Balance, 0.01);
    }

    @Test
    public void shouldCalculateTotalBalance() {
        Bank bank = new Bank();
        bank.addAtm1Transaction(400);
        bank.addAtm1Transaction(600);
        bank.addAtm1Transaction(0);
        bank.addAtm1Transaction(-200);
        bank.addAtm1Transaction(-300);
        bank.addAtm2Transaction(-500);
        bank.addAtm2Transaction(0);
        bank.addAtm2Transaction(500);
        bank.addAtm2Transaction(100);
        bank.addAtm2Transaction(-400);
        bank.addAtm3Transaction(900);
        bank.addAtm3Transaction(200);
        bank.addAtm3Transaction(0);
        bank.addAtm3Transaction(-600);
        bank.addAtm3Transaction(-700);
        assertEquals(0, bank.getTotalBalance());
    }

    @Test
    public void shouldCountNumberOfWithdrawalsForEachCashMachine() {
        Bank bank = new Bank();
        bank.addAtm1Transaction(400);
        bank.addAtm1Transaction(600);
        bank.addAtm1Transaction(0);
        bank.addAtm1Transaction(-200);
        bank.addAtm1Transaction(-300);
        bank.addAtm2Transaction(-500);
        bank.addAtm2Transaction(0);
        bank.addAtm2Transaction(500);
        bank.addAtm2Transaction(100);
        bank.addAtm2Transaction(-400);
        bank.addAtm3Transaction(900);
        bank.addAtm3Transaction(200);
        bank.addAtm3Transaction(0);
        bank.addAtm3Transaction(-600);
        bank.addAtm3Transaction(-700);

        double atm1NumberOfWithdrawals = bank.getAtm1NumberOfWithdrawals();
        double atm2NumberOfWithdrawals = bank.getAtm2NumberOfWithdrawals();
        double atm3NumberOfWithdrawals = bank.getAtm3NumberOfWithdrawals();

        assertEquals(2, atm1NumberOfWithdrawals);
        assertEquals(2, atm2NumberOfWithdrawals);
        assertEquals(2, atm3NumberOfWithdrawals);
    }

    @Test
    public void shouldCountTotalNumberOfWithdrawals(){
        Bank bank = new Bank();
        bank.addAtm1Transaction(400);
        bank.addAtm1Transaction(600);
        bank.addAtm1Transaction(0);
        bank.addAtm1Transaction(-200);
        bank.addAtm1Transaction(-300);
        bank.addAtm2Transaction(-500);
        bank.addAtm2Transaction(0);
        bank.addAtm2Transaction(500);
        bank.addAtm2Transaction(100);
        bank.addAtm2Transaction(-400);
        bank.addAtm3Transaction(900);
        bank.addAtm3Transaction(200);
        bank.addAtm3Transaction(0);
        bank.addAtm3Transaction(-600);
        bank.addAtm3Transaction(-700);
        assertEquals(6, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCalculateAverageWithdrawalForEachCashMachine() {
        Bank bank = new Bank();
        bank.addAtm1Transaction(400);
        bank.addAtm1Transaction(600);
        bank.addAtm1Transaction(0);
        bank.addAtm1Transaction(-200);
        bank.addAtm1Transaction(-300);
        bank.addAtm2Transaction(-500);
        bank.addAtm2Transaction(0);
        bank.addAtm2Transaction(500);
        bank.addAtm2Transaction(100);
        bank.addAtm2Transaction(-400);
        bank.addAtm3Transaction(900);
        bank.addAtm3Transaction(200);
        bank.addAtm3Transaction(0);
        bank.addAtm3Transaction(-600);
        bank.addAtm3Transaction(-700);

        double atm1AverageWithdrawal = bank.getAtm1AverageWithdrawal();
        double atm2AverageWithdrawal = bank.getAtm2AverageWithdrawal();
        double atm3AverageWithdrawal = bank.getAtm3AverageWithdrawal();

        assertEquals(-250, atm1AverageWithdrawal, 0.01);
        assertEquals(-450, atm2AverageWithdrawal, 0.01);
        assertEquals(-650, atm3AverageWithdrawal, 0.01);
    }

    @Test
    public void shouldCalculateAverageWithdrawalForAllCashMachines() {
        Bank bank = new Bank();
        bank.addAtm1Transaction(400);
        bank.addAtm1Transaction(600);
        bank.addAtm1Transaction(0);
        bank.addAtm1Transaction(-200);
        bank.addAtm1Transaction(-300);
        bank.addAtm2Transaction(-500);
        bank.addAtm2Transaction(0);
        bank.addAtm2Transaction(500);
        bank.addAtm2Transaction(100);
        bank.addAtm2Transaction(-400);
        bank.addAtm3Transaction(900);
        bank.addAtm3Transaction(200);
        bank.addAtm3Transaction(0);
        bank.addAtm3Transaction(-600);
        bank.addAtm3Transaction(-700);
        assertEquals(-450, bank.getTotalAverageWithdrawal(), 0.01);
    }

    @Test
    public void shouldCountNumberOfDepositsForEachCashMachine() {
        Bank bank = new Bank();
        bank.addAtm1Transaction(400);
        bank.addAtm1Transaction(600);
        bank.addAtm1Transaction(0);
        bank.addAtm1Transaction(-200);
        bank.addAtm1Transaction(-300);
        bank.addAtm2Transaction(-500);
        bank.addAtm2Transaction(0);
        bank.addAtm2Transaction(500);
        bank.addAtm2Transaction(100);
        bank.addAtm2Transaction(-400);
        bank.addAtm3Transaction(900);
        bank.addAtm3Transaction(200);
        bank.addAtm3Transaction(0);
        bank.addAtm3Transaction(-600);
        bank.addAtm3Transaction(-700);

        double atm1NumberOfDeposits = bank.getAtm1NumberOfDeposits();
        double atm2NumberOfDeposits = bank.getAtm2NumberOfDeposits();
        double atm3NumberOfDeposits = bank.getAtm3NumberOfDeposits();

        assertEquals(2, atm1NumberOfDeposits, 0.01);
        assertEquals(2, atm2NumberOfDeposits, 0.01);
        assertEquals(2, atm3NumberOfDeposits, 0.01);
    }

    @Test
    public void shouldCountTotalNumberOfDeposits(){
        Bank bank = new Bank();
        bank.addAtm1Transaction(400);
        bank.addAtm1Transaction(600);
        bank.addAtm1Transaction(0);
        bank.addAtm1Transaction(-200);
        bank.addAtm1Transaction(-300);
        bank.addAtm2Transaction(-500);
        bank.addAtm2Transaction(0);
        bank.addAtm2Transaction(500);
        bank.addAtm2Transaction(100);
        bank.addAtm2Transaction(-400);
        bank.addAtm3Transaction(900);
        bank.addAtm3Transaction(200);
        bank.addAtm3Transaction(0);
        bank.addAtm3Transaction(-600);
        bank.addAtm3Transaction(-700);
        assertEquals(6, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldCalculateAverageDepositForEachCashMachine() {
        Bank bank = new Bank();
        bank.addAtm1Transaction(400);
        bank.addAtm1Transaction(600);
        bank.addAtm1Transaction(0);
        bank.addAtm1Transaction(-200);
        bank.addAtm1Transaction(-300);
        bank.addAtm2Transaction(-500);
        bank.addAtm2Transaction(0);
        bank.addAtm2Transaction(500);
        bank.addAtm2Transaction(100);
        bank.addAtm2Transaction(-400);
        bank.addAtm3Transaction(900);
        bank.addAtm3Transaction(200);
        bank.addAtm3Transaction(0);
        bank.addAtm3Transaction(-600);
        bank.addAtm3Transaction(-700);

        double atm1AverageDeposit = bank.getAtm1AverageDeposit();
        double atm2AverageDeposit = bank.getAtm2AverageDeposit();
        double atm3AverageDeposit = bank.getAtm3AverageDeposit();

        assertEquals(500, atm1AverageDeposit, 0.01);
        assertEquals(300, atm2AverageDeposit, 0.01);
        assertEquals(550, atm3AverageDeposit, 0.01);
    }

    @Test
    public void shouldCalculateAverageDepositForAllCashMachines() {
        Bank bank = new Bank();
        bank.addAtm1Transaction(400);
        bank.addAtm1Transaction(600);
        bank.addAtm1Transaction(0);
        bank.addAtm1Transaction(-200);
        bank.addAtm1Transaction(-300);
        bank.addAtm2Transaction(-500);
        bank.addAtm2Transaction(0);
        bank.addAtm2Transaction(500);
        bank.addAtm2Transaction(100);
        bank.addAtm2Transaction(-400);
        bank.addAtm3Transaction(900);
        bank.addAtm3Transaction(200);
        bank.addAtm3Transaction(0);
        bank.addAtm3Transaction(-600);
        bank.addAtm3Transaction(-700);
        assertEquals(450, bank.getTotalAverageDeposit(), 0.01);
    }
}