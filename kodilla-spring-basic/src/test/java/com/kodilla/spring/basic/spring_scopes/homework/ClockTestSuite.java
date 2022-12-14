package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void shouldShowADifferentTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clock1 = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);
        Clock clock3 = context.getBean(Clock.class);
        Assertions.assertNotEquals(clock1.getTime(), clock2.getTime());
        Assertions.assertEquals(clock2.getTime(), clock3.getTime()); // ????
        Assertions.assertNotEquals(clock1.getTime(), clock3.getTime());
    }
}