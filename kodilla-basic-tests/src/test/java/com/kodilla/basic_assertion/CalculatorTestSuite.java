package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.sub(a,b);
        assertEquals(-3, subResult);
    }

    @Test
    public void testSqNeg() {
        Calculator calculator = new Calculator();
        int a = -5;
        int sqResultNeg = calculator.sq(a);
        assertEquals(25, sqResultNeg);
    }

    @Test
    public void testSqZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int sqResultZ = calculator.sq(a);
        assertEquals(0, sqResultZ);
    }

    @Test
    public void testSquarePos() {
        Calculator calculator = new Calculator();
        int a = 5;
        int sqResultPos = calculator.sq(a);
        assertEquals(25, sqResultPos);
    }
}