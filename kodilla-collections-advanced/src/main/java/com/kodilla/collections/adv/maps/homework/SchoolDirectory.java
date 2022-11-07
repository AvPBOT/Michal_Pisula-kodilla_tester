package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal albus = new Principal("Albus", "Dumbledore", "Hogwarts School of Witchcraft and Wizardry");
        Principal olympe = new Principal("Olympe", "Maxime", "Beauxbatons Academy of Magic");
        Principal igor = new Principal("Igor", "Karkaroff", "Durmstrang Institute");
        Principal agilbert = new Principal("Agilbert", "Fontaine", "Ilvermorny School of Witchcraft and Wizardry");

        School hogwartsStudents = new School(Arrays.asList(65, 22, 41));
        School beauxbatonsStudents = new School(Arrays.asList(49, 53, 21));
        School durmstrangStudents = new School(Arrays.asList(53, 23, 61));
        School ilvermornyStudents = new School(Arrays.asList(29, 42, 44));

        school.put(albus, hogwartsStudents);
        school.put(olympe, beauxbatonsStudents);
        school.put(igor, durmstrangStudents);
        school.put(agilbert, ilvermornyStudents);

        for(Map.Entry<Principal, School> principalEntry : school.entrySet()) {
            System.out.println("Number of students in " + principalEntry.getKey().getForename() + " " + principalEntry.getKey().getSurname() + "'s " + principalEntry.getKey().getSchoolName() + ": " +  principalEntry.getValue().getSum());
        }

    }
}
