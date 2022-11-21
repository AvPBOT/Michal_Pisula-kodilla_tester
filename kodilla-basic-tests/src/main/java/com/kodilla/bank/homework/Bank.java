package com.kodilla.bank.homework;

public class Bank {
    private CashMachine atm1;
    private CashMachine atm2;
    private CashMachine atm3;

    public Bank() {
        this.atm1 = new CashMachine();
        this.atm2 = new CashMachine();
        this.atm3 = new CashMachine();
    }

    public void addAtm1Transaction(int value) {
        if (value != 0) {
            this.atm1.addTransaction(value);
        }
    }

    public void addAtm2Transaction(int value) {
        if (value != 0) {
            this.atm2.addTransaction(value);
        }
    }

    public void addAtm3Transaction(int value) {
        if (value != 0) {
            this.atm3.addTransaction(value);
        }
    }

    public double getAtm1Balance() { return this.atm1.getBalance(); }

    public double getAtm2Balance() { return this.atm2.getBalance(); }

    public double getAtm3Balance() { return this.atm3.getBalance(); }

    public double getTotalBalance() {
        double sum = this.atm1.getBalance() + this.atm2.getBalance() + this.atm3.getBalance();
        return sum/3;
    }

    public double getAtm1NumberOfWithdrawals() {
        return this.atm1.getNumberOfWithdrawals();
    }

    public double getAtm2NumberOfWithdrawals() {
        return this.atm2.getNumberOfWithdrawals();
    }

    public double getAtm3NumberOfWithdrawals() {
        return this.atm3.getNumberOfWithdrawals();
    }

    public double getTotalNumberOfWithdrawals() {
        double sum = this.atm1.getNumberOfWithdrawals() + this.atm2.getNumberOfWithdrawals() + this.atm3.getNumberOfWithdrawals();
        return sum;
    }

    public double getAtm1NumberOfDeposits() {
        return this.atm1.getNumberOfDeposits();
    }

    public double getAtm2NumberOfDeposits() {
        return this.atm2.getNumberOfDeposits();
    }

    public double getAtm3NumberOfDeposits() {
        return this.atm3.getNumberOfDeposits();
    }

    public double getTotalNumberOfDeposits() {
        double sum = this.atm1.getNumberOfDeposits() + this.atm2.getNumberOfDeposits() + this.atm3.getNumberOfDeposits();
        return sum;
    }

    public double getAtm1AverageWithdrawal() {
        return this.atm1.getAverageWithdrawal();
    }

    public double getAtm2AverageWithdrawal() {
        return this.atm2.getAverageWithdrawal();
    }

    public double getAtm3AverageWithdrawal() {
        return this.atm3.getAverageWithdrawal();
    }

    public double getTotalAverageWithdrawal() {
        double sum = this.atm1.getAverageWithdrawal() + this.atm2.getAverageWithdrawal() + this.atm3.getAverageWithdrawal();
        return sum/3;
    }

    public double getAtm1AverageDeposit() {
        return this.atm1.getAverageDeposit();
    }

    public double getAtm2AverageDeposit() {
        return this.atm2.getAverageDeposit();
    }

    public double getAtm3AverageDeposit() {
        return this.atm3.getAverageDeposit();
    }

    public double getTotalAverageDeposit() {
        double sum = this.atm1.getAverageDeposit() + this.atm2.getAverageDeposit() + this.atm3.getAverageDeposit();
        return sum/3;
    }
}