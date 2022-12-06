package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");

    @Test
    public void shouldReturnSuccessfulDeliveryMessage() {
        ShippingCenter beanShippingCenter = context.getBean(ShippingCenter.class);
        String result = beanShippingCenter.sendPackage("ul. Nowogrodzka 44, Warszawa",9);
        Assertions.assertEquals("Package delivered to: ul. Nowogrodzka 44, Warszawa", result);
    }

    @Test
    public void shouldReturnFailedDeliveryMessage() {
        ShippingCenter beanShippingCenter = context.getBean(ShippingCenter.class);
        String result = beanShippingCenter.sendPackage("Warszawa, ul. Koszykowa 86", 40);
        Assertions.assertEquals("Package not delivered to: Warszawa, ul. Koszykowa 86", result);
    }
}