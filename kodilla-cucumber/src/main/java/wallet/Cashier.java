package wallet;

public class Cashier {
    private CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public String withdraw(Wallet wallet, int amount) {
        if(amount >= 0 && amount <= wallet.getBalance()) {
            wallet.debit(amount);
            cashSlot.dispense(amount);
        }
        return "I don't have enough money in my wallet";
    }
}