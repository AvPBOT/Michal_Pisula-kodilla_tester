package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Float.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {

    @Test
     void testAvgAboveFortyPositiveAvg() {
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Walter White", 50, 7, "Chemists"));
        testUsers.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        testUsers.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        testUsers.add(new User("Gus Firing", 49, 0, "Board"));
        testUsers.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        testUsers.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        double avgAboveForty = testUsers
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);
        assertEquals(2.25, avgAboveForty, 0.01);
    }

    @Test
    void testAvgAboveFortyZeroAvg() {
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Walter White", 50, 0, "Chemists"));
        testUsers.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        testUsers.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        testUsers.add(new User("Gus Firing", 49, 0, "Board"));
        testUsers.add(new User("Gale Boetticher", 44, 0, "Chemists"));
        testUsers.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        double avgAboveForty = testUsers
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);
        assertEquals(0, avgAboveForty, 0.01);
    }

    @Test
    void testAvgAboveFortyNegativeAvg() {
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Walter White", 50, -50, "Chemists"));
        testUsers.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        testUsers.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        testUsers.add(new User("Gus Firing", 49, 30, "Board"));
        testUsers.add(new User("Gale Boetticher", 44, 0, "Chemists"));
        testUsers.add(new User("Mike Ehrmantraut", 57, -30, "Security"));

        double avgAboveForty = testUsers
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);
        assertEquals(-12.5, avgAboveForty, 0.01);
    }

    @Test
    void testAvgAboveFortyNoUsers() {
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Walter White", 38, 7, "Chemists"));
        testUsers.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        testUsers.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        testUsers.add(new User("Gus Firing", 31, 0, "Board"));
        testUsers.add(new User("Gale Boetticher", 32, 2, "Chemists"));
        testUsers.add(new User("Mike Ehrmantraut", 21, 0, "Security"));

        double avgAboveForty = testUsers
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);
        assertEquals(NaN, avgAboveForty);
    }

    @Test
    void testAvgBelowFortyPositiveAvg() {
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Walter White", 50, -50, "Chemists"));
        testUsers.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        testUsers.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        testUsers.add(new User("Gus Firing", 49, 30, "Board"));
        testUsers.add(new User("Gale Boetticher", 44, 0, "Chemists"));
        testUsers.add(new User("Mike Ehrmantraut", 57, -30, "Security"));

        double avgBelowForty = testUsers
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);
        assertEquals(2382.0, avgBelowForty, 0.01);
    }

    @Test
    void testAvgBelowFortyZeroAvg() {
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Walter White", 50, -50, "Chemists"));
        testUsers.add(new User("Jessie Pinkman", 25, 0, "Sales"));
        testUsers.add(new User("Tuco Salamanca", 34, 0, "Manager"));
        testUsers.add(new User("Gus Firing", 49, 30, "Board"));
        testUsers.add(new User("Gale Boetticher", 44, 0, "Chemists"));
        testUsers.add(new User("Mike Ehrmantraut", 57, -30, "Security"));

        double avgBelowForty = testUsers
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);
        assertEquals(0.0, avgBelowForty, 0.01);
    }

    @Test
    void testAvgBelowFortyNegativeAvg() {
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Walter White", 50, 7, "Chemists"));
        testUsers.add(new User("Jessie Pinkman", 25, -300, "Sales"));
        testUsers.add(new User("Tuco Salamanca", 34, 150, "Manager"));
        testUsers.add(new User("Gus Firing", 49, 0, "Board"));
        testUsers.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        testUsers.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        double avgBelowForty = testUsers
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);
        assertEquals(-75.0, avgBelowForty, 0.01);
    }

    @Test
    void testAvgBelowFortyNoUsers() {
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User("Walter White", 50, -50, "Chemists"));
        testUsers.add(new User("Jessie Pinkman", 41, 4648, "Sales"));
        testUsers.add(new User("Tuco Salamanca", 51, 116, "Manager"));
        testUsers.add(new User("Gus Firing", 49, 30, "Board"));
        testUsers.add(new User("Gale Boetticher", 44, 0, "Chemists"));
        testUsers.add(new User("Mike Ehrmantraut", 57, -30, "Security"));

        double avgBelowForty = testUsers
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);
        assertEquals(NaN, avgBelowForty);
    }
}