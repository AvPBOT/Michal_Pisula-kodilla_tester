package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransaction(int value) {
        if (value == 0) {
            return;
        }
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(transactions, 0, newTab, 0, transactions.length);
            newTab[this.size - 1] = value;
            this.transactions = newTab;
        }

    public int[] getTransactions() {
        return transactions;
    }

    public double getBalance() {
        double sum = 0;
        for (double value : transactions) {
            sum += value;
        }
        return sum;
    }

    public double getNumberOfWithdrawals() {
        int count = 0;
        for (double value : transactions) {
            if (value < 0) {
                count++;
            }
        }
        return count;
    }

    public double getNumberOfDeposits() {
        int count = 0;
        for (double value : transactions) {
            if (value > 0) {
                count++;
            }
        }
        return count;
    }

    public double getAverageWithdrawal() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        int count = 0;
        for (double value : transactions) {
            if (value < 0) {
                sum += value;
                count++;
            }
        }
        return sum/count;
    }

    public double getAverageDeposit() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        int count = 0;
        for (double value : transactions) {
            if (value > 0) {
                sum += value;
                count++;
            }
        }
        return sum/count;
    }
}