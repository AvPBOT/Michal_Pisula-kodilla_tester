package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    public void addFlights() {
        //when
        FlightRepository.getFlightsTable();
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Warsaw", "London"));
        expectedFlightsTable.add(new Flight("Warsaw", "Madrid"));
        expectedFlightsTable.add(new Flight("Warsaw", "Budapest"));
        expectedFlightsTable.add(new Flight("Munich", "Warsaw"));
        expectedFlightsTable.add(new Flight("Rome", "Warsaw"));
        expectedFlightsTable.add(new Flight("Stockholm", "Warsaw"));
        assertEquals(expectedFlightsTable, FlightRepository.getFlightsTable());
    }

    @Test
    void findFlightsFromWarsaw() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Warsaw");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Warsaw", "London"));
        expectedFlightsTable.add(new Flight("Warsaw", "Madrid"));
        expectedFlightsTable.add(new Flight("Warsaw", "Budapest"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsFrom("Warsaw"));
    }

    @Test
    void findFlightsFromMunich() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Munich");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Munich", "Warsaw"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsFrom("Munich"));
    }

    @Test
    void findFlightsFromRome() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Rome");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Rome", "Warsaw"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsFrom("Rome"));
    }

    @Test
    void findFlightsFromStockholm() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Stockholm");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Stockholm", "Warsaw"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsFrom("Stockholm"));
    }

    @Test
    void findFlightsToWarsaw() {
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Warsaw");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Munich", "Warsaw"));
        expectedFlightsTable.add(new Flight("Rome", "Warsaw"));
        expectedFlightsTable.add(new Flight("Stockholm", "Warsaw"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsTo("Warsaw"));
    }

    @Test
    void findFlightsToLondon() {
        //when
        List<Flight> result = FlightFinder.findFlightsTo("London");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Warsaw", "London"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsTo("London"));
    }

    @Test
    void findFlightsToMadrid() {
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Madrid");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Warsaw", "Madrid"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsTo("Madrid"));
    }

    @Test
    void findFlightsToBudapest() {
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Budapest");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Warsaw", "Budapest"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsTo("Budapest"));
    }
/*
    @Test
    void findNonExistingArrival() {
        //when
        List<Flight> result = FlightFinder.findFlightsTo("???");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("???", "???"));
        assertEquals(, );
    }

    @Test
    void findNonExistingDeparture() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("???");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("???", "???"));
        assertEquals(, );
    }
 */
}

