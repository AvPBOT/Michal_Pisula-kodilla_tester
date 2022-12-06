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
    public void shouldReturnCorrectMessage() {
            Display bean = context.getBean(Display.class);
            String result = bean.display(10.0);
            Assertions.assertEquals("Result: 10.0", result);
        }

    @Test
    public void testAdd() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.add(42,31);
        Display beanDisplay = context.getBean(Display.class);
        String message = beanDisplay.display(result);
        Assertions.assertEquals(73, result, 0.01);
        Assertions.assertEquals("Result: 73.0", message);
    }

    @Test
    public void testSubtract() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.subtract(38,11);
        Display beanDisplay = context.getBean(Display.class);
        String message = beanDisplay.display(result);
        Assertions.assertEquals(27, result, 0.01);
        Assertions.assertEquals("Result: 27.0", message);
    }

    @Test
    public void testMultiply() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.multiply(37,100);
        Display beanDisplay = context.getBean(Display.class);
        String message = beanDisplay.display(result);
        Assertions.assertEquals(3700, result, 0.01);
        Assertions.assertEquals("Result: 3700.0", message);
    }

    @Test
    public void testDivide() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(82,59);
        Display beanDisplay = context.getBean(Display.class);
        String message = beanDisplay.display(result);
        Assertions.assertEquals(1.38, result, 0.01);
        Assertions.assertEquals("Result: 1.3898305084745763", message);
    }

    @Test
    public void testDivideByZero() {
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(100,0);
        Display beanDisplay = context.getBean(Display.class);
        String message = beanDisplay.display(result);
        Assertions.assertEquals(Double.NaN, result);
        Assertions.assertEquals("Result: NaN", message);
    }
}