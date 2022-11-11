package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("Warsaw", "Madrid"));
        flights.add(new Flight("Warsaw", "Budapest"));
        flights.add(new Flight("Munich", "Warsaw"));
        flights.add(new Flight("Rome", "Warsaw"));
        flights.add(new Flight("Stockholm", "Warsaw"));
        return flights;
    }
}