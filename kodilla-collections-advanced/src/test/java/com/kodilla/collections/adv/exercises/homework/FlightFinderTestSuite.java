package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlightFinderTestSuite {

    @Test
    public void testAddFlights() {
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
    void testFindFlightsFromWarsaw() {
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
    void testFindFlightsFromMunich() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Munich");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Munich", "Warsaw"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsFrom("Munich"));
    }

    @Test
    void testFindFlightsFromRome() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Rome");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Rome", "Warsaw"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsFrom("Rome"));
    }

    @Test
    void testFindFlightsFromStockholm() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Stockholm");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Stockholm", "Warsaw"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsFrom("Stockholm"));
    }

    @Test
    void testFindFlightsToWarsaw() {
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
    void testFindFlightsToLondon() {
        //when
        List<Flight> result = FlightFinder.findFlightsTo("London");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Warsaw", "London"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsTo("London"));
    }

    @Test
    void testFindFlightsToMadrid() {
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Madrid");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Warsaw", "Madrid"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsTo("Madrid"));
    }

    @Test
    void testFindFlightsToBudapest() {
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Budapest");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        expectedFlightsTable.add(new Flight("Warsaw", "Budapest"));
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsTo("Budapest"));
    }

    @Test
    void testFindNonExistingArrival() {
        //when
        List<Flight> result = FlightFinder.findFlightsTo("???");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsTo("???"));
    }

    @Test
    void testFindNonExistingDeparture() {
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("???");
        //then
        List<Flight> expectedFlightsTable = new ArrayList<>();
        assertEquals(expectedFlightsTable, FlightFinder.findFlightsTo("???"));
    }
}

