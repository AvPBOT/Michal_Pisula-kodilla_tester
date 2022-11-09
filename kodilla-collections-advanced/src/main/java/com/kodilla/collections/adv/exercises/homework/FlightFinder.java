package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public static List<Flight> findFlightsFrom(String departure) {
        List <Flight> departureTable = new ArrayList<>();

        for(Flight flight : FlightRepository.getFlightsTable()) {
            if(flight.getDeparture().equals(departure)) {
                departureTable.add(flight);
            }
        }
        if(departureTable.size() == 0) {
            System.out.println("There are no flights from that destination.");
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
        if (arrivalTable.size() == 0) {
            System.out.println("There are no flights to that destination.");
        }
        return arrivalTable;
    }

    public static void main(String[] args) {
        System.out.println("Departures from Warsaw: ");
        System.out.println(findFlightsFrom("Warsaw"));

        System.out.println();
        System.out.println("Arrivals to Warsaw: ");
        System.out.println(findFlightsTo("Warsaw"));

        System.out.println();
        System.out.println("Departures to Wagadugu: ");
        System.out.println(findFlightsTo("Wagadugu"));
    }
}