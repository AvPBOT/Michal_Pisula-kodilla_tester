package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbers.csv", delimiterString = ";")
    public void testHowManyWins(String numbers) throws InvalidNumbersException {
        String[] stringNumbers = numbers.split(",");
        Set<String> numbersSet = new HashSet<>(Arrays.asList(stringNumbers));
        Set<Integer> myNumbers = numbersSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toSet());
        assertTrue(gamblingMachine.howManyWins(myNumbers) <= 6 && gamblingMachine.howManyWins(myNumbers) >= 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv", delimiterString = ";")
    public void testHowManyWins_withException(String numbers) {
        String[] stringNumbers = numbers.split(",");
        Set<String> numbersSet = new HashSet<>(Arrays.asList(stringNumbers));
        Set<Integer> myNumbers = numbersSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toSet());
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(myNumbers));
    }
}
