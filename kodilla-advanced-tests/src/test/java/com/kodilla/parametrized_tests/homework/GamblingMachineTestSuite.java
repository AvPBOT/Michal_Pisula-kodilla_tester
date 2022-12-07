package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
        String[] myStringNumbers = numbers.split(",");
        Set<Integer> expectedSet = new HashSet<>();
        for (int i = 0; i < myStringNumbers.length; i++) {
            Integer a = Integer.parseInt(myStringNumbers[i]);
            expectedSet.add(a);
        }
        Exception exception = assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(expectedSet);
        }
        );
        assertEquals("Wrong numbers provided", exception.getMessage());
    }
}