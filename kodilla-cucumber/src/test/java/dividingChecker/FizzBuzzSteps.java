package dividingChecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzSteps implements En {
    private int number;
    private String response;

    public FizzBuzzSteps() {
        Given("number is One", () -> {
            this.number = 1;
        });

        Given("number is Three", () -> {
            this.number = 3;
        });

        Given("number is Five", () -> {
            this.number = 5;
        });

        Given("number is Six", () -> {
            this.number = 6;
        });

        Given("number is Eight", () -> {
            this.number = 8;
        });

        Given("number is Nine", () -> {
            this.number = 9;
        });

        Given("number is Ten", () -> {
            this.number = 10;
        });

        Given("number is Twelve", () -> {
            this.number = 12;
        });

        Given("number is Fifteen", () -> {
            this.number = 15;
        });

        Given("number is Eighteen", () -> {
            this.number = 18;
        });

        Given("number is Twenty", () -> {
            this.number = 20;
        });

        Given("number is TwentyOne", () -> {
            this.number = 21;
        });

        Given("number is TwentyFour", () -> {
            this.number = 24;
        });

        Given("number is TwentyFive", () -> {
            this.number = 25;
        });

        Given("number is TwentySeven", () -> {
            this.number = 27;
        });

        Given("number is Thirty", () -> {
            this.number = 30;
        });

        Given("number is ThirtyTwo", () -> {
            this.number = 32;
        });

        Given("number is ThirtyThree", () -> {
            this.number = 33;
        });

        Given("number is ThirtyFive", () -> {
            this.number = 35;
        });

        Given("number is ThirtySix", () -> {
            this.number = 36;
        });

        When("I ask if the number divisible by three, by five, or by three and five", () -> {
            DividingChecker dividingChecker = new DividingChecker();
            this.response = dividingChecker.fizzBuzz(this.number);
        });

        Then("I should be given {string}", (String string) -> {
            Assert.assertEquals(string, this.response);
        });
    }
}
