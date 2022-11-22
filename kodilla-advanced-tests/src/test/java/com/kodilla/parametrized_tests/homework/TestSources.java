package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class TestSources {
    static Stream<Arguments> provideDataForTestingBMI() {
        return Stream.of(
                Arguments.of(new Person(1.95, 56)),
                Arguments.of(new Person(1.85, 54)),
                Arguments.of(new Person(1.50, 40)),
                Arguments.of(new Person(1.80, 72)),
                Arguments.of(new Person(1.60, 76)),
                Arguments.of(new Person(1.55, 84)),
                Arguments.of(new Person(1.35, 72)),
                Arguments.of(new Person(1.35, 82)),
                Arguments.of(new Person(1.45, 104)),
                Arguments.of(new Person(1.35, 108)),
                Arguments.of(new Person(1.45, 190))
        );
    }
}