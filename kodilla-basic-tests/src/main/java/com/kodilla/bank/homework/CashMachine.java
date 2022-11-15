package com.kodilla.bank.homework;

public class CashMachine {
    private int[] completedTransactions;
    private int numberOfTransactions;

    public CashMachine() {
        this.numberOfTransactions = 0;
        this.completedTransactions = new int[0];
    }

    public void useCashMachine(int value) {
        this.numberOfTransactions++;
        int[] newTab = new int[this.numberOfTransactions];
        System.arraycopy(completedTransactions, 0, newTab, 0, completedTransactions.length);
        newTab[this.numberOfTransactions - 1] = value;
        this.completedTransactions = newTab;
    }

    public int[] getCompletedTransactions() {
        return completedTransactions;
    }
}