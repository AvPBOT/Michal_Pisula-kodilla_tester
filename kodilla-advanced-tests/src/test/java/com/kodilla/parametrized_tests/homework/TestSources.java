package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class TestSources {
    static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.95, 56), "Very severely underweight"),
                Arguments.of(new Person(1.73, 45), "Severely underweight"),
                Arguments.of(new Person(1.85, 54), "Severely underweight"),
                Arguments.of(new Person(1.92, 59), "Underweight"),
                Arguments.of(new Person(1.50, 40), "Underweight"),
                Arguments.of(new Person(2.00, 74), "Normal (healthy weight)"),
                Arguments.of(new Person(1.80, 72), "Normal (healthy weight)"),
                Arguments.of(new Person(1.80, 81), "Overweight"),
                Arguments.of(new Person(1.60, 76), "Overweight"),
                Arguments.of(new Person(2.00, 120), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(1.55, 84), "Obese Class I (Moderately obese)"),
                Arguments.of(new Person(2.00, 140), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.35, 72), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(2.00, 160), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(1.35, 82), "Obese Class III (Very severely obese)"),
                Arguments.of(new Person(2.00, 180), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(1.45, 104), "Obese Class IV (Morbidly Obese)"),
                Arguments.of(new Person(2.00, 200), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(1.35, 108), "Obese Class V (Super Obese)"),
                Arguments.of(new Person(2.00, 240), "Obese Class VI (Hyper Obese)"),
                Arguments.of(new Person(1.45, 190), "Obese Class VI (Hyper Obese)")
        );
    }
}