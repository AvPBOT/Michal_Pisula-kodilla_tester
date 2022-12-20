package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;

    public CashMachine(int[] transactions) {
        this.transactions = transactions;
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