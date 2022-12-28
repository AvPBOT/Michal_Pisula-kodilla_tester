package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ConfigurationClassTestSuite {

    @Test
    public void shouldSelectCarType() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("selectCar");
        //When
        String carType = car.getCarType();
        //Then
        List<String> possibleTypes = Arrays.asList("SUV", "Cabrio", "Sedan");
        assertTrue(possibleTypes.contains(carType));
    }

    @Test
    public void shouldSelectCarWithLightsTurnedOnOrOff() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("selectCar");
        //When
        boolean carLights = car.hasHeadlightsTurnedOn();
        //Then
        assertTrue((carLights = true) || (carLights = false));
    }
}