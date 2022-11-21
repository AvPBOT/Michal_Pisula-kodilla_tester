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

    public double getAtm1Average() {
        return this.atm1.getAverage();
    }

    public double getAtm2Average() {
        return this.atm2.getAverage();
    }

    public double getAtm3Average() {
        return this.atm3.getAverage();
    }

    public double getAverage() {
        double sum = this.atm1.getAverage() + this.atm2.getAverage() + this.atm3.getAverage();
        return sum/3;
    }
}