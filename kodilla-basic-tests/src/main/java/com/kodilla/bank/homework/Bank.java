package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public double getTotalBalance() {
        double balance = 0;
        for (CashMachine cashMachine : cashMachines) {
            balance += cashMachine.getBalance();
        }
        return balance;
    }

    public double getTotalNumberOfWithdrawals() {
        double numberOfWithdrawals = 0;
        for (CashMachine cashMachine : cashMachines) {
            numberOfWithdrawals += cashMachine.getNumberOfWithdrawals();
        }
        return numberOfWithdrawals;
    }

    public double getTotalNumberOfDeposits () {
        double numberOfDeposits = 0;
        for (CashMachine cashMachine : cashMachines) {
            numberOfDeposits += cashMachine.getNumberOfDeposits();
        }
        return numberOfDeposits;
    }

    public double getTotalAverageWithdrawal () {
        double averageWithdrawal = 0;
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            averageWithdrawal += cashMachine.getAverageWithdrawal();
            count++;
        }
        return averageWithdrawal / count;
    }

        public double getTotalAverageDeposit () {
        double averageDeposit = 0;
        int count = 0;
        for (CashMachine cashMachine : cashMachines) {
            averageDeposit += cashMachine.getAverageDeposit();
            count++;
        }
        return averageDeposit / count;
    }
}