package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public static List<Flight> findFlightsFrom(String departure) {
        List <Flight> departureTable = new ArrayList<>();
        for(Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                departureTable.add(flight);
            }
        }
        return departureTable;
    }

    public static List<Flight> findFlightsTo(String arrival) {
        List<Flight> arrivalTable = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                arrivalTable.add(flight);
            }
        }
        return arrivalTable;
    }

    public static void main(String[] args) {
        List<Flight> flightsFromWarsaw = findFlightsFrom("Warsaw");
        List<Flight> flightsToWarsaw = findFlightsTo("Warsaw");
        List<Flight> flightsToWagadugu = findFlightsTo("Wagadugu");

        System.out.println("Departures from Warsaw: ");
        System.out.println(flightsFromWarsaw);

        System.out.println();
        System.out.println("Arrivals to Warsaw: ");
        System.out.println(flightsToWarsaw);

        System.out.println();
        System.out.println("Departures to Wagadugu: ");
        System.out.println(flightsToWagadugu);
    }
}