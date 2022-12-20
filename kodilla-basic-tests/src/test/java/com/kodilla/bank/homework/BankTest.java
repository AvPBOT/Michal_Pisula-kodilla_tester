package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    private Bank testeeBank;
    private Bank testeeBankNoWithdrawals;
    private Bank testeeBankNoDeposits;

    CashMachine testeeCashMachine = new CashMachine(new int[]{400, 600, 0, -200, -300, -500, 0, 500, 100, -400, 900, 200, 0, -600, -700});
    CashMachine testeeCashMachineNoWithdrawals = new CashMachine(new int[]{400, 600, 0, 0, 500, 100, 900, 200, 0});
    CashMachine testeeCashMachineNoDeposits = new CashMachine(new int[]{0, -200, -300, -500, 0, -400, 0, -600, -700});

    @BeforeEach
    public void initBanks() {
        testeeBank = new Bank(new CashMachine[]{testeeCashMachine});
        testeeBankNoWithdrawals = new Bank(new CashMachine[]{testeeCashMachineNoWithdrawals});
        testeeBankNoDeposits = new Bank(new CashMachine[]{testeeCashMachineNoDeposits});
    }

    @Test
    public void shouldCalculateTotalBalance () {
        assertEquals(0, testeeBank.getTotalBalance());
    }

    @Test
    public void shouldCountTotalNumberOfWithdrawals () {
        assertEquals(6, testeeBank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCalculateAverageWithdrawal () {
        assertEquals(-450, testeeBank.getTotalAverageWithdrawal(), 0.01);
    }

    @Test
    public void shouldCalculateAverageWithdrawalButThereAreNoWithdrawals () {
        assertEquals(NaN, testeeBankNoWithdrawals.getTotalAverageWithdrawal());
    }

    @Test
    public void shouldCountTotalNumberOfDeposits () {
        assertEquals(6, testeeBank.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldCalculateAverageDeposit () {
        assertEquals(450, testeeBank.getTotalAverageDeposit(), 0.01);
    }

    @Test
    public void shouldCalculateAverageDepositButThereAreNoDeposits () {
        assertEquals(NaN, testeeBankNoDeposits.getTotalAverageDeposit());
    }
}