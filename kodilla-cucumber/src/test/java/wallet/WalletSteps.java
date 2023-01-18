package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
    }

    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        Assert.assertEquals(30, cashSlot.getContents());
    }

    @Given("I have deposited $100 in my wallet")
    public void i_have_deposited_$100_in_my_wallet() {
        wallet.deposit(100);
        Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
    }

    @When("I request $100")
    public void i_request_$100() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 100);
    }

    @Then("$100 should be dispensed")
    public void $100_should_be_dispensed() {
        Assert.assertEquals(100, cashSlot.getContents());
    }

    @Given("I have deposited $300 in my wallet")
    public void i_have_deposited_$300_in_my_wallet() {
        wallet.deposit(300);
        Assert.assertEquals("Incorrect wallet balance", 300, wallet.getBalance());
    }

    @When("I request $400")
    public void i_request_$400() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 400);
    }

    @Then("$400 should be dispensed")
    public void $400_should_be_dispensed() {
        Assert.assertEquals(400, cashSlot.getContents());
    }
}