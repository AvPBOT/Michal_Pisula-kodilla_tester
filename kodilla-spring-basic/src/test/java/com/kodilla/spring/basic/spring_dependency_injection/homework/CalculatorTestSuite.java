package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

    @Test
    public void testAdd() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(42,31);
        Assertions.assertEquals(73, result, 0.01);
    }

    @Test
    public void testSubtract() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(38,11);
        Assertions.assertEquals(27, result, 0.01);
    }

    @Test
    public void testMultiply() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(37,100);
        Assertions.assertEquals(3700, result, 0.01);
    }

    @Test
    public void testDivide() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(82,59);
        Assertions.assertEquals(1.38, result, 0.01);
    }

    @Test
    public void testDivideByZero() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(100,0);
        Assertions.assertEquals(Double.NaN, result);
    }
}