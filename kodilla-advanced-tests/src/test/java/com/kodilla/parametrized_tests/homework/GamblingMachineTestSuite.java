package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    /*
    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbers.csv")
    public void testHowManyWins(String numbers) throws InvalidNumbersException {

        });
    }
     */

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv")
    public void testHowManyWins_withException(String numbers) {
        Set<Integer> numbersSet = parseInputNumbers(numbers);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbersSet));
    }
}
