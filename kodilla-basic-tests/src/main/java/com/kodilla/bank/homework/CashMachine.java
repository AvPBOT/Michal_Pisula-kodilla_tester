package com.kodilla.bank.homework;

public class CashMachine {
    public static int[] transactions;
    public static int balance;
    public static int numberOfTransactions;


    public CashMachine(int balance) {
        this.transactions = new int[0];
        this.numberOfTransactions = 0;
        this.balance = balance;
    }

    public void addTransaction(int value) {
        if (value == 0) {
            return;
        } else {
            this.numberOfTransactions++;
            int[] newTransactions = new int[this.numberOfTransactions];
            System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
            newTransactions[this.numberOfTransactions - 1] = value;
            this.transactions = newTransactions;
        }
    }

    public int[] getTransactions() {
        return transactions;
    }

    public static int getBalance() {
        balance = 0;
        for (int i = 0; i < transactions.length; i++) {
                balance += transactions[i];
            }
            return balance;
    }

    public static int getNumberOfTransactions() {
        return numberOfTransactions;
    }
}