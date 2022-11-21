package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.TestSources#provideDataForTestingVerySeverelyUnderweight")
    public void returnVerySeverelyUnderweight(double heightInMeters, double weightInKilogram) {
        assertEquals("Very severely underweight", new Person(heightInMeters, weightInKilogram).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.TestSources#provideDataForTestingSeverelyUnderweight")
    public void returnSeverelyUnderweight(double heightInMeters, double weightInKilogram) {
        assertEquals("Severely underweight", new Person(heightInMeters, weightInKilogram).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.TestSources#provideDataForTestingUnderweight")
    public void returnUnderweight(double heightInMeters, double weightInKilogram) {
        assertEquals("Underweight", new Person(heightInMeters, weightInKilogram).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.TestSources#provideDataForTestingNormalWeight")
    public void returnNormalWeight(double heightInMeters, double weightInKilogram) {
        assertEquals("Normal (healthy weight)", new Person(heightInMeters, weightInKilogram).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.TestSources#provideDataForTestingOverweight")
    public void returnNormalOverweight(double heightInMeters, double weightInKilogram) {
        assertEquals("Overweight", new Person(heightInMeters, weightInKilogram).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.TestSources#provideDataForTestingObeseClassI")
    public void returnObeseClassI(double heightInMeters, double weightInKilogram) {
        assertEquals("Obese Class I (Moderately obese)", new Person(heightInMeters, weightInKilogram).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.TestSources#provideDataForTestingObeseClassII")
    public void returnObeseClassII(double heightInMeters, double weightInKilogram) {
        assertEquals("Obese Class II (Severely obese)", new Person(heightInMeters, weightInKilogram).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.TestSources#provideDataForTestingObeseClassIII")
    public void returnObeseClassIII(double heightInMeters, double weightInKilogram) {
        assertEquals("Obese Class III (Very severely obese)", new Person(heightInMeters, weightInKilogram).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.TestSources#provideDataForTestingObeseClassIV")
    public void returnObeseClassIV(double heightInMeters, double weightInKilogram) {
        assertEquals("Obese Class IV (Morbidly Obese)", new Person(heightInMeters, weightInKilogram).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.TestSources#provideDataForTestingObeseClassV")
    public void returnObeseClassV(double heightInMeters, double weightInKilogram) {
        assertEquals("Obese Class V (Super Obese)", new Person(heightInMeters, weightInKilogram).getBMI());
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.TestSources#provideDataForTestingObeseClassVI")
    public void returnObeseClassVI(double heightInMeters, double weightInKilogram) {
        assertEquals("Obese Class VI (Hyper Obese)", new Person(heightInMeters, weightInKilogram).getBMI());
    }
}