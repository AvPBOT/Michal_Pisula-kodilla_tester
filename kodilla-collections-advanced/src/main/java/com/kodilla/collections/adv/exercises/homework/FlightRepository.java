package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    static List<Flight> flightsTable;

    public static List<Flight> getFlightsTable() {
        List<Flight> flightsTable = new ArrayList<>();
        flightsTable.add(new Flight("Warsaw", "London"));
        flightsTable.add(new Flight("Warsaw", "Madrid"));
        flightsTable.add(new Flight("Warsaw", "Budapest"));
        flightsTable.add(new Flight("Munich", "Warsaw"));
        flightsTable.add(new Flight("Rome", "Warsaw"));
        flightsTable.add(new Flight("Stockholm", "Warsaw"));
        return flightsTable;
    }
}

