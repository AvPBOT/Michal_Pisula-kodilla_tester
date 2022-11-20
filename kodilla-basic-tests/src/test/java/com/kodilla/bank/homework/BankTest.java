package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void shouldCountTotalNumberOfTransactionsWithNonZeroAmount() {
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(400);
        bank.getAtm1().addTransaction(500);
        bank.getAtm1().addTransaction(-100);
        bank.getAtm2().addTransaction(300);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm3().addTransaction(-900);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(700);
        assertEquals(7, bank.getTotalNumberOfTransactions());
    }
    @Test
    public void shouldCountTotalBalance() {
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(400);
        bank.getAtm1().addTransaction(500);
        bank.getAtm1().addTransaction(-100);
        bank.getAtm2().addTransaction(300);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm3().addTransaction(-900);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(700);
        assertEquals(400, bank.getTotalBalance(),0.01);
    }

    @Test
    public void shouldCountTotalNumberOfWithdrawals() {
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(400);
        bank.getAtm1().addTransaction(500);
        bank.getAtm1().addTransaction(-100);
        bank.getAtm2().addTransaction(300);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm3().addTransaction(-900);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(700);
        assertEquals(3, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCountTotalNumberOfDeposits() {
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(400);
        bank.getAtm1().addTransaction(500);
        bank.getAtm1().addTransaction(-100);
        bank.getAtm2().addTransaction(300);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm3().addTransaction(-900);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(700);
        assertEquals(4, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldCountAverageDepositValue() {
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(400);
        bank.getAtm1().addTransaction(500);
        bank.getAtm1().addTransaction(-100);
        bank.getAtm2().addTransaction(300);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm3().addTransaction(-900);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(700);
        assertEquals(475, bank.getAverageDepositValue(),0.01);
    }

    @Test
    public void shouldCountAverageWithdrawalValue() {
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(400);
        bank.getAtm1().addTransaction(500);
        bank.getAtm1().addTransaction(-100);
        bank.getAtm2().addTransaction(300);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm3().addTransaction(-900);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(700);
        assertEquals(-500, bank.getAverageWithdrawalValue(),0.01);
    }
}