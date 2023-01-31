package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void debit(int money) {
        this.balance -= money;
    }

    public String showBalance() {
        return "The balance is: " + this.balance;
    }
}