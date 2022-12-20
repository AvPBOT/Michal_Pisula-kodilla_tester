package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void testIfTimeInBeansDiffers() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);
        Clock clock3 = context.getBean(Clock.class);
        assertFalse(clock1.getTime().isBefore(clock2.getTime()) && clock2.getTime().isBefore(clock3.getTime()) && clock1.getTime().isBefore(clock3.getTime()));
    }
}