package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GamblingMachineTestSuite {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbers.csv")
    public void testHowManyWins(String numbers) throws InvalidNumbersException {
        String[] stringNumbers = numbers.split(",");
        Set<String> numbersSet = new HashSet<>(Arrays.asList(stringNumbers));
        List<Integer> myNumbers = numbersSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> testNumbers = new HashSet<>(myNumbers);
        assertTrue(gamblingMachine.howManyWins(testNumbers) <= 7 && gamblingMachine.howManyWins(testNumbers) >= 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv")
    public void testHowManyWins_withException(String numbers) {
        String[] stringNumbers = numbers.split(",");
        Set<String> numbersSet = new HashSet<>(Arrays.asList(stringNumbers));
        List<Integer> myNumbers = numbersSet
                .stream()
                .map(u -> Integer.parseInt(u))
                .collect(Collectors.toList());
        Set<Integer> testNumbers = new HashSet<>(myNumbers);
        Assertions.assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(testNumbers));
    }
}
