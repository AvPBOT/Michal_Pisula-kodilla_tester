package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] allCashMachines;
    private int size;

    public Bank() {
        this.allCashMachines = new CashMachine[0];
        this.size = allCashMachines.length;
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(allCashMachines, 0, newTab, 0, allCashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.allCashMachines = newTab;
    }

    public double getTotalBalance() {
        double sum = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getBalance();
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

    public double getTotalAverageWithdrawal() {
        double sum = 0;
        int count = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getAverageWithdrawal();
            count++;
        }
        return sum/count;
    }

    public double getTotalAverageDeposit() {
        double sum = 0;
        int count = 0;
        for (int i=0; i < size; i++) {
            sum += allCashMachines[i].getAverageDeposit();
            count++;
        }
        return sum/count;
    }
}