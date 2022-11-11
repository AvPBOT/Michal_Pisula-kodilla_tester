package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> wizardingSchools = new HashMap<>();

        Principal albus = new Principal("Albus", "Dumbledore");
        Principal olympe = new Principal("Olympe", "Maxime");
        Principal igor = new Principal("Igor", "Karkaroff");
        Principal agilbert = new Principal("Agilbert", "Fontaine");

        School hogwarts = new School("Hogwarts School of Witchcraft and Wizardry", Arrays.asList(80, 93, 48, 14, 22, 93, 59));
        School beauxbatons = new School("Beauxbatons Academy of Magic", Arrays.asList(69, 82, 47, 75, 96, 14, 86));
        School durmstrang = new School("Durmstrang Institute", Arrays.asList(81, 56, 58, 26, 39, 63, 30));
        School ilvermorny = new School("Ilvermorny School of Witchcraft and Wizardry", Arrays.asList(49, 30, 73, 62, 13, 73, 37));

        wizardingSchools.put(albus, hogwarts);
        wizardingSchools.put(olympe, beauxbatons);
        wizardingSchools.put(igor, durmstrang);
        wizardingSchools.put(agilbert, ilvermorny);

        for(Map.Entry<Principal, School> schoolEntry : wizardingSchools.entrySet()) {
            System.out.println("Total number of students at " + schoolEntry.getKey().getName() + " " + schoolEntry.getKey().getSurname() + "'s " + schoolEntry.getValue().getSchoolName() + ": " +  schoolEntry.getValue().studentsCount() + ".");
        }
    }
}
