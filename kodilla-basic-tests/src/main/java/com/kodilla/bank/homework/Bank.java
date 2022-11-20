package com.kodilla.bank.homework;

public class Bank {
    private final CashMachine atm1;
    private final CashMachine atm2;
    private final CashMachine atm3;
    private final CashMachine[] allCashMachines;
    private final int size;

    public Bank() {
        this.atm1 = new CashMachine();
        this.atm2 = new CashMachine();
        this.atm3 = new CashMachine();
        this.allCashMachines = new CashMachine[3];
        this.allCashMachines[0] = atm1;
        this.allCashMachines[1] = atm2;
        this.allCashMachines[2] = atm3;
        this.size = allCashMachines.length;
    }

    public CashMachine getAtm1() {
        return this.atm1;
    }

    public CashMachine getAtm2() {
        return this.atm2;
    }

    public CashMachine getAtm3() {
        return this.atm3;
    }

    public double getTotalBalance() {
        double sum = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getBalance();
        }
        return sum;
    }

    public double getTotalNumberOfTransactions() {
        double sum = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getNumberOfTransactions();
        }
        return sum;
    }

    public double getTotalNumberOfWithdrawals() {
        double sum = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getNumberOfWithdrawals();
        }
        return sum;
    }

    public double getTotalNumberOfDeposits() {
        double sum = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getNumberOfDeposits();
        }
        return sum;
    }

    public double getAverageWithdrawalValue() {
        double sum = 0;
        int count = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getAverageWithdrawal();
            count++;
        }
        return sum/count;
    }

    public double getAverageDepositValue() {
        double sum = 0;
        int count = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getAverageDeposit();
            count++;
        }
        return sum/count;
    }
}