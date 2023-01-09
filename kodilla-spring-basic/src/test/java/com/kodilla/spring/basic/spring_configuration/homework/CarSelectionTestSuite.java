package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static com.kodilla.spring.basic.spring_configuration.homework.Season.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class CarSelectionTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
    ClockSeason mockClockSeason = Mockito.mock(ClockSeason.class);

    @Test
    public void shouldSelectCabrioWithLightsOff6AM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(SUMMER);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(6, 0));
        Car car = (Car) context.getBean("selectCar");

        //Then
        assertTrue(car instanceof Cabrio);
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnCabrioWithLightsOn8PM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(SUMMER);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(20, 0));
        Car car = (Car) context.getBean("selectCar");

        //Then
        assertTrue(car instanceof Cabrio);
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSUVWithLightsOff6AM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(WINTER);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(6, 0));
        Car car = (Car) context.getBean("selectCar");

        //Then
        assertTrue(car instanceof SUV);
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSUVWithLightsOn8PM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(WINTER);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(20, 0));
        Car car = (Car) context.getBean("selectCar");

        //Then
        assertTrue(car instanceof SUV);
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanSpringWithLightsOff6AM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(SPRING);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(6, 0));
        Car car = (Car) context.getBean("selectCar");

        //Then
        assertTrue(car instanceof Sedan);
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanSpringWithLightsOn8PM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(SPRING);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(20, 0));
        Car car = (Car) context.getBean("selectCar");

        //Then
        assertTrue(car instanceof Sedan);
        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanAutumnWithLightsOff6AM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(AUTUMN);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(6, 0));
        Car car = (Car) context.getBean("selectCar");

        //Then
        assertTrue(car instanceof Sedan);
        assertFalse(car.hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanAutumnWithLightsOn8PM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(AUTUMN);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(6, 0));
        Car car = (Car) context.getBean("selectCar");

        //Then
        assertTrue(car instanceof Sedan);
        assertTrue(car.hasHeadlightsTurnedOn());
    }
}