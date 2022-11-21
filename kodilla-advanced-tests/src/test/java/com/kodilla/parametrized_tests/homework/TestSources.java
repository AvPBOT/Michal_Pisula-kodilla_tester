package com.kodilla.parametrized_tests.homework;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

public class TestSources {
    static Stream<Arguments> provideDataForTestingVerySeverelyUnderweight() {
        return Stream.of(
                Arguments.of(1.95, 56),
                Arguments.of(1.90, 40),
                Arguments.of(1.70,42),
                Arguments.of(1.85, 50)
        );
    }

    static Stream<Arguments> provideDataForTestingSeverelyUnderweight() {
        return Stream.of(
                Arguments.of(1.95, 60),
                Arguments.of(1.80, 50),
                Arguments.of(1.70,46),
                Arguments.of(1.85, 54)
        );
    }

    static Stream<Arguments> provideDataForTestingUnderweight() {
        return Stream.of(
                Arguments.of(1.95, 68),
                Arguments.of(1.65, 48),
                Arguments.of(1.75, 54),
                Arguments.of(1.50, 40)
        );
    }

    static Stream<Arguments> provideDataForTestingNormalWeight() {
        return Stream.of(
                Arguments.of(1.95, 78),
                Arguments.of(1.50, 52),
                Arguments.of(1.65, 60),
                Arguments.of(1.80, 72)
        );
    }

    static Stream<Arguments> provideDataForTestingOverweight() {
        return Stream.of(
                Arguments.of(1.95, 112),
                Arguments.of(1.75, 90),
                Arguments.of(1.40, 58),
                Arguments.of(1.60, 76)
        );
    }

    static Stream<Arguments> provideDataForTestingObeseClassI() {
        return Stream.of(
                Arguments.of(1.95, 130),
                Arguments.of(1.65, 94),
                Arguments.of(1.75, 106),
                Arguments.of(1.55, 84)
        );
    }

    static Stream<Arguments> provideDataForTestingObeseClassII() {
        return Stream.of(
                Arguments.of(1.85, 136),
                Arguments.of(1.65, 108),
                Arguments.of(1.50, 88),
                Arguments.of(1.35, 72)
        );
    }

    static Stream<Arguments> provideDataForTestingObeseClassIII() {
        return Stream.of(
                Arguments.of(1.75, 136),
                Arguments.of(1.55, 106),
                Arguments.of(1.45, 94),
                Arguments.of(1.35, 82)
        );
    }

    static Stream<Arguments> provideDataForTestingObeseClassIV() {
        return Stream.of(
                Arguments.of(1.65, 134),
                Arguments.of(1.55, 118),
                Arguments.of(1.35, 90),
                Arguments.of(1.45, 104)
        );
    }

    static Stream<Arguments> provideDataForTestingObeseClassV() {
        return Stream.of(
                Arguments.of(1.50, 134),
                Arguments.of(1.45, 126),
                Arguments.of(1.4, 116),
                Arguments.of(1.35, 108)
        );
    }

    static Stream<Arguments> provideDataForTestingObeseClassVI() {
        return Stream.of(
                Arguments.of(1.95, 300),
                Arguments.of(1.80, 210),
                Arguments.of(1.55, 220),
                Arguments.of(1.45, 190)
        );
    }
}