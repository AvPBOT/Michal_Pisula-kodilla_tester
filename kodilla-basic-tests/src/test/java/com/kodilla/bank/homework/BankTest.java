package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    Bank bank = new Bank();
    CashMachine atm1 = new CashMachine();
    CashMachine atm2 = new CashMachine();
    CashMachine atm3 = new CashMachine();

    @BeforeEach
    public void initCashMachines() {
        bank.addCashMachine(atm1);
        bank.addCashMachine(atm2);
        bank.addCashMachine(atm3);
    }

    @Test
    public void shouldCalculateTotalBalance() {
        atm1.addTransaction(400);
        atm1.addTransaction(600);
        atm1.addTransaction(0);
        atm1.addTransaction(-200);
        atm1.addTransaction(-300);
        atm2.addTransaction(-500);
        atm2.addTransaction(0);
        atm2.addTransaction(500);
        atm2.addTransaction(100);
        atm2.addTransaction(-400);
        atm3.addTransaction(900);
        atm3.addTransaction(200);
        atm3.addTransaction(0);
        atm3.addTransaction(-600);
        atm3.addTransaction(-700);
        assertEquals(0, bank.getTotalBalance());
    }

    @Test
    public void shouldCalculateTotalBalanceButThereAreNoTransactions() {
        assertEquals(0, bank.getTotalBalance());
    }

    @Test
    public void shouldCountTotalNumberOfWithdrawals(){
        atm1.addTransaction(400);
        atm1.addTransaction(600);
        atm1.addTransaction(0);
        atm1.addTransaction(-200);
        atm1.addTransaction(-300);
        atm2.addTransaction(-500);
        atm2.addTransaction(0);
        atm2.addTransaction(500);
        atm2.addTransaction(100);
        atm2.addTransaction(-400);
        atm3.addTransaction(900);
        atm3.addTransaction(200);
        atm3.addTransaction(0);
        atm3.addTransaction(-600);
        atm3.addTransaction(-700);
        assertEquals(6, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCountTotalNumberOfWithdrawalsButThereAreNoWithdrawals(){
        assertEquals(0, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCalculateAverageWithdrawal() {
        atm1.addTransaction(400);
        atm1.addTransaction(600);
        atm1.addTransaction(0);
        atm1.addTransaction(-200);
        atm1.addTransaction(-300);
        atm2.addTransaction(-500);
        atm2.addTransaction(0);
        atm2.addTransaction(500);
        atm2.addTransaction(100);
        atm2.addTransaction(-400);
        atm3.addTransaction(900);
        atm3.addTransaction(200);
        atm3.addTransaction(0);
        atm3.addTransaction(-600);
        atm3.addTransaction(-700);
        assertEquals(-450, bank.getTotalAverageWithdrawal(), 0.01);
    }

    @Test
    public void shouldCalculateAverageWithdrawalButThereAreNoWithdrawals() {
        atm1.addTransaction(400);
        atm1.addTransaction(600);
        atm1.addTransaction(0);
        atm2.addTransaction(0);
        atm2.addTransaction(500);
        atm2.addTransaction(100);
        atm3.addTransaction(900);
        atm3.addTransaction(200);
        atm3.addTransaction(0);
        assertEquals(NaN, bank.getTotalAverageWithdrawal());
    }

    @Test
    public void shouldCountTotalNumberOfDeposits(){
        atm1.addTransaction(400);
        atm1.addTransaction(600);
        atm1.addTransaction(0);
        atm1.addTransaction(-200);
        atm1.addTransaction(-300);
        atm2.addTransaction(-500);
        atm2.addTransaction(0);
        atm2.addTransaction(500);
        atm2.addTransaction(100);
        atm2.addTransaction(-400);
        atm3.addTransaction(900);
        atm3.addTransaction(200);
        atm3.addTransaction(0);
        atm3.addTransaction(-600);
        atm3.addTransaction(-700);
        assertEquals(6, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldCountTotalNumberOfDepositsButThereAreNoDeposits(){
        atm1.addTransaction(0);
        atm1.addTransaction(-200);
        atm1.addTransaction(-300);
        atm2.addTransaction(-500);
        atm2.addTransaction(0);
        atm2.addTransaction(-400);
        atm3.addTransaction(0);
        atm3.addTransaction(-600);
        atm3.addTransaction(-700);
        assertEquals(0, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldCalculateAverageDeposit() {
        atm1.addTransaction(400);
        atm1.addTransaction(600);
        atm1.addTransaction(0);
        atm1.addTransaction(-200);
        atm1.addTransaction(-300);
        atm2.addTransaction(-500);
        atm2.addTransaction(0);
        atm2.addTransaction(500);
        atm2.addTransaction(100);
        atm2.addTransaction(-400);
        atm3.addTransaction(900);
        atm3.addTransaction(200);
        atm3.addTransaction(0);
        atm3.addTransaction(-600);
        atm3.addTransaction(-700);
        assertEquals(450, bank.getTotalAverageDeposit(), 0.01);
    }

    @Test
    public void shouldCalculateAverageDepositButThereAreNoDeposits() {
        atm1.addTransaction(0);
        atm1.addTransaction(-200);
        atm1.addTransaction(-300);
        atm2.addTransaction(-500);
        atm2.addTransaction(0);
        atm2.addTransaction(-400);
        atm3.addTransaction(0);
        atm3.addTransaction(-600);
        atm3.addTransaction(-700);
        assertEquals(NaN, bank.getTotalAverageDeposit());
    }
}