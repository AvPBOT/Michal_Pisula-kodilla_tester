package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void shouldCalculateTotalBalance() {
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(400);
        bank.getAtm1().addTransaction(600);
        bank.getAtm1().addTransaction(0);
        bank.getAtm1().addTransaction(-200);
        bank.getAtm1().addTransaction(-300);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(500);
        bank.getAtm2().addTransaction(100);
        bank.getAtm2().addTransaction(-400);
        bank.getAtm3().addTransaction(900);
        bank.getAtm3().addTransaction(200);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(-600);
        bank.getAtm3().addTransaction(-700);
        assertEquals(0, bank.getTotalBalance());
    }

    @Test
    public void shouldCalculateTotalBalanceButThereAreNoTransactions() {
        Bank bank = new Bank();
        assertEquals(0, bank.getTotalBalance());
    }

    @Test
    public void shouldCountTotalNumberOfWithdrawals(){
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(400);
        bank.getAtm1().addTransaction(600);
        bank.getAtm1().addTransaction(0);
        bank.getAtm1().addTransaction(-200);
        bank.getAtm1().addTransaction(-300);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(500);
        bank.getAtm2().addTransaction(100);
        bank.getAtm2().addTransaction(-400);
        bank.getAtm3().addTransaction(900);
        bank.getAtm3().addTransaction(200);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(-600);
        bank.getAtm3().addTransaction(-700);
        assertEquals(6, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCountTotalNumberOfWithdrawalsButThereAreNoWithdrawals(){
        Bank bank = new Bank();
        assertEquals(0, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCalculateAverageWithdrawal() {
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(400);
        bank.getAtm1().addTransaction(600);
        bank.getAtm1().addTransaction(0);
        bank.getAtm1().addTransaction(-200);
        bank.getAtm1().addTransaction(-300);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(500);
        bank.getAtm2().addTransaction(100);
        bank.getAtm2().addTransaction(-400);
        bank.getAtm3().addTransaction(900);
        bank.getAtm3().addTransaction(200);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(-600);
        bank.getAtm3().addTransaction(-700);
        assertEquals(-450, bank.getTotalAverageWithdrawal(), 0.01);
    }

    @Test
    public void shouldCalculateAverageWithdrawalButThereAreNoWithdrawals() {
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(400);
        bank.getAtm1().addTransaction(600);
        bank.getAtm1().addTransaction(0);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(500);
        bank.getAtm2().addTransaction(100);
        bank.getAtm3().addTransaction(900);
        bank.getAtm3().addTransaction(200);
        bank.getAtm3().addTransaction(0);
        assertEquals(NaN, bank.getTotalAverageWithdrawal());
    }

    @Test
    public void shouldCountTotalNumberOfDeposits(){
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(400);
        bank.getAtm1().addTransaction(600);
        bank.getAtm1().addTransaction(0);
        bank.getAtm1().addTransaction(-200);
        bank.getAtm1().addTransaction(-300);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(500);
        bank.getAtm2().addTransaction(100);
        bank.getAtm2().addTransaction(-400);
        bank.getAtm3().addTransaction(900);
        bank.getAtm3().addTransaction(200);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(-600);
        bank.getAtm3().addTransaction(-700);
        assertEquals(6, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldCountTotalNumberOfDepositsButThereAreNoDeposits(){
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(0);
        bank.getAtm1().addTransaction(-200);
        bank.getAtm1().addTransaction(-300);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(-400);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(-600);
        bank.getAtm3().addTransaction(-700);
        assertEquals(0, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldCalculateAverageDeposit() {
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(400);
        bank.getAtm1().addTransaction(600);
        bank.getAtm1().addTransaction(0);
        bank.getAtm1().addTransaction(-200);
        bank.getAtm1().addTransaction(-300);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(500);
        bank.getAtm2().addTransaction(100);
        bank.getAtm2().addTransaction(-400);
        bank.getAtm3().addTransaction(900);
        bank.getAtm3().addTransaction(200);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(-600);
        bank.getAtm3().addTransaction(-700);
        assertEquals(450, bank.getTotalAverageDeposit(), 0.01);
    }

    @Test
    public void shouldCalculateAverageDepositButThereAreNoDeposits() {
        Bank bank = new Bank();
        bank.getAtm1().addTransaction(0);
        bank.getAtm1().addTransaction(-200);
        bank.getAtm1().addTransaction(-300);
        bank.getAtm2().addTransaction(-500);
        bank.getAtm2().addTransaction(0);
        bank.getAtm2().addTransaction(-400);
        bank.getAtm3().addTransaction(0);
        bank.getAtm3().addTransaction(-600);
        bank.getAtm3().addTransaction(-700);
        assertEquals(NaN, bank.getTotalAverageDeposit());
    }
}