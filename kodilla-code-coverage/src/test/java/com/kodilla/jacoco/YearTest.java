package com.kodilla.jacoco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {
    private Year testeeYearDivisibleBy4ButNot100;
    private Year testeeYearDivisibleBy400;
    private Year testeeNotLeapYearCenturyYear;
    private Year testeeNotLeapYearNonCenturyYear;


    @BeforeEach
    void initYears() {
        testeeYearDivisibleBy4ButNot100 = new Year(2012);
        testeeYearDivisibleBy400 = new Year(2000);
        testeeNotLeapYearCenturyYear = new Year(1900);
        testeeNotLeapYearNonCenturyYear = new Year(2013);
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy400() {
        boolean isLeapYear = testeeYearDivisibleBy400.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy4ButNot100() {
        boolean isLeapYear = testeeYearDivisibleBy4ButNot100.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearCenturyYear() {
        boolean isLeapYear = testeeNotLeapYearCenturyYear.isLeap();
        assertFalse(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearNonCenturyYear() {
        boolean isLeapYear = testeeNotLeapYearNonCenturyYear.isLeap();
        assertFalse(isLeapYear);
    }
}