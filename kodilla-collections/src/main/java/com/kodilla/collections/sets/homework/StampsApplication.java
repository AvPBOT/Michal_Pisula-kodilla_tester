package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("British Guiana 1c Magenta",0.29,0.26,false));
        stamps.add(new Stamp("Czerwony Mauritius",0.19,0.22,true));
        stamps.add(new Stamp("Czerwony Mauritius",0.19,0.22,true));
        stamps.add(new Stamp("Czerwony Mauritius",0.19,0.22,true));
        stamps.add(new Stamp("Inverted Jenny",2.22,2.54,true));
        stamps.add(new Stamp("Odwrotka bokserów",2,1,false));
        stamps.add(new Stamp("Polska nr 1",3,2,false));

        System.out.println("Rozmiar kolekcji: " + stamps.size());
        for(Stamp stamp: stamps) {
            System.out.println("Dodano do kolekcji: " +stamp);
        }
    }
}