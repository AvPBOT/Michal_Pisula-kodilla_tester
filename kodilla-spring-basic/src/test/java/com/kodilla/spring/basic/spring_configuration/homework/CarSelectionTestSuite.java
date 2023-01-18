package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalTime;

import static com.kodilla.spring.basic.spring_configuration.homework.Season.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CarSelectionTestSuite {

    CarSelection carSelection = new CarSelection();
    ClockSeason mockClockSeason = Mockito.mock(ClockSeason.class);

    @Test
    public void shouldSelectCabrioWithLightsOff6AM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(SUMMER);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(6, 0));
        carSelection.selectCar(mockClockSeason);

        //Then
        assertTrue(carSelection.selectCar(mockClockSeason) instanceof Cabrio);
        assertFalse(carSelection.selectCar(mockClockSeason).hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnCabrioWithLightsOn8PM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(SUMMER);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(20, 0));
        carSelection.selectCar(mockClockSeason);

        //Then
        assertTrue(carSelection.selectCar(mockClockSeason) instanceof Cabrio);
        assertTrue(carSelection.selectCar(mockClockSeason).hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSUVWithLightsOff6AM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(WINTER);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(6, 0));
        carSelection.selectCar(mockClockSeason);

        //Then
        assertTrue(carSelection.selectCar(mockClockSeason) instanceof SUV);
        assertFalse(carSelection.selectCar(mockClockSeason).hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSUVWithLightsOn8PM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(WINTER);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(20, 0));
        carSelection.selectCar(mockClockSeason);

        //Then
        assertTrue(carSelection.selectCar(mockClockSeason) instanceof SUV);
        assertTrue(carSelection.selectCar(mockClockSeason).hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanSpringWithLightsOff6AM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(SPRING);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(6, 0));
        carSelection.selectCar(mockClockSeason);

        //Then
        assertTrue(carSelection.selectCar(mockClockSeason) instanceof Sedan);
        assertFalse(carSelection.selectCar(mockClockSeason).hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanSpringWithLightsOn8PM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(SPRING);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(20, 0));
        carSelection.selectCar(mockClockSeason);

        //Then
        assertTrue(carSelection.selectCar(mockClockSeason) instanceof Sedan);
        assertTrue(carSelection.selectCar(mockClockSeason).hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanAutumnWithLightsOff6AM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(AUTUMN);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(6, 0));
        carSelection.selectCar(mockClockSeason);

        //Then
        assertTrue(carSelection.selectCar(mockClockSeason) instanceof Sedan);
        assertFalse(carSelection.selectCar(mockClockSeason).hasHeadlightsTurnedOn());
    }

    @Test
    public void shouldReturnSedanAutumnWithLightsOn8PM() {
        //Given
        Mockito.when(mockClockSeason.getSeason()).thenReturn(AUTUMN);
        Mockito.when(mockClockSeason.getTime()).thenReturn(LocalTime.of(20, 0));
        carSelection.selectCar(mockClockSeason);

        //Then
        assertTrue(carSelection.selectCar(mockClockSeason) instanceof Sedan);
        assertTrue(carSelection.selectCar(mockClockSeason).hasHeadlightsTurnedOn());
    }
}