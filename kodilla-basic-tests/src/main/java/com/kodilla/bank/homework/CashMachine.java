package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public double getAverage() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum/this.transactions.length;
    }
}