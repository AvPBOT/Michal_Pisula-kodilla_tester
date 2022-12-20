package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CashMachineTest {

    private CashMachine testeeCashMachine;
    private CashMachine testeeCashMachineNoWithdrawals;
    private CashMachine testeeCashMachineNoDeposits;

    @BeforeEach
    public void initCashMachines() {
        testeeCashMachine = new CashMachine(new int[]{400, -200, 0, 500, 700, -800});
        testeeCashMachineNoWithdrawals = new CashMachine(new int[]{400, 0, 500, 700});
        testeeCashMachineNoDeposits = new CashMachine(new int[]{0, -200, -800});
    }

    @Test
    public void shouldCalculateBalance() {
        assertEquals(600, testeeCashMachine.getBalance());
    }

    @Test
    public void shouldCountTheNumberOfDeposits() {
        assertEquals(3, testeeCashMachine.getNumberOfDeposits());
    }

    @Test
    public void shouldCountTheNumberOfWithdrawals() {
        assertEquals(2, testeeCashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldCalculateTheAverageDeposit() {
        assertEquals(533.33, testeeCashMachine.getAverageDeposit(), 0.01);
    }

    @Test
    public void shouldCalculateTheAverageDepositButThereAreNoDeposits() {
        assertEquals(NaN, testeeCashMachineNoDeposits.getAverageDeposit());
    }

    @Test
    public void shouldCalculateTheAverageWithdrawal() {
        assertEquals(-500, testeeCashMachine.getAverageWithdrawal(), 0.01);
    }

    @Test
    public void shouldCalculateTheAverageWithdrawalButThereAreNoWithdrawals() {
        assertEquals(NaN, testeeCashMachineNoWithdrawals.getAverageWithdrawal());
    }
}