package dividingChecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzSteps {
    private int number;
    private String response;

    @Given("number is One")
    public void number_is_one() {
        this.number = 1;
    }

    @Given("number is Three")
    public void number_is_three() {
        this.number = 3;
    }

    @Given("number is Five")
    public void number_is_five() {
        this.number = 5;
    }

    @Given("number is Six")
    public void number_is_six() {
        this.number = 6;
    }

    @Given("number is Eight")
    public void number_is_eight() {
        this.number = 8;
    }

    @Given("number is Nine")
    public void number_is_nine() {
        this.number = 9;
    }

    @Given("number is Ten")
    public void number_is_ten() {
        this.number = 10;
    }

    @Given("number is Twelve")
    public void number_is_twelve() {
        this.number = 12;
    }

    @Given("number is Fifteen")
    public void number_is_fifteen() {
        this.number = 15;
    }

    @Given("number is Eighteen")
    public void number_is_eighteen() {
        this.number = 18;
    }

    @Given("number is Twenty")
    public void number_is_twenty() {
        this.number = 20;
    }

    @Given("number is TwentyOne")
    public void number_is_twentyOne() {
        this.number = 21;
    }

    @Given("number is TwentyFour")
    public void number_is_twentyFour() {
        this.number = 24;
    }

    @Given("number is TwentyFive")
    public void number_is_twentyFive() {
        this.number = 25;
    }

    @Given("number is TwentySeven")
    public void number_is_twentySeven() {
        this.number = 27;
    }

    @Given("number is Thirty")
    public void number_is_thirty() {
        this.number = 30;
    }

    @Given("number is ThirtyTwo")
    public void number_is_thirtyTwo() {
        this.number = 32;
    }

    @Given("number is ThirtyThree")
    public void number_is_thirtyThree() {
        this.number = 33;
    }

    @Given("number is ThirtyFive")
    public void number_is_thirtyFive() {
        this.number = 35;
    }

    @Given("number is ThirtySix")
    public void number_is_thirtySix() {
        this.number = 36;
    }

    @When("I ask if the number is divisible by three, by five, or by three and five")
    public void i_ask_if_the_number_is_divisible_by_three_by_five_or_by_three_and_five() {
        DividingChecker dividingChecker = new DividingChecker();
        this.response = dividingChecker.fizzBuzz(this.number);
    }

    @Then("I should be given {string}")
    public void i_should_be_given(String string) {
        assertEquals(string, this.response);
    }
}
