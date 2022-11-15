package com.kodilla.bank.homework;

public class Bank {
    private static CashMachine[] cashMachines;
    private static int numberOfMachines;
    private static int totalBalance;
    private double avgWithdrawal;
    private double avgDeposit;
    private int numberOfWithdrawals;
    private int numberOfDeposits;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.numberOfMachines = 0;
    }

    public void addMachine(CashMachine balance) {
        this.numberOfMachines++;
        CashMachine[] newTab = new CashMachine[this.numberOfMachines];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.numberOfMachines - 1] = balance;
        this.cashMachines = newTab;
    }

    public static int getNumberOfMachines() {
        return numberOfMachines;
    }
}