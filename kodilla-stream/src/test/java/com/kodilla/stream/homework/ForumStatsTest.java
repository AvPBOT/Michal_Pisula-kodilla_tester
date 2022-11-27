package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {
    private ForumStats testee;

    @Test
     void testAvgAboveFortyForUsersRepository() {
        // given
        testee = new ForumStats(List.of(new User("Walter White", 50, 7, "Chemists"), new User("Jessie Pinkman", 25, 4648, "Sales"), new User("Tuco Salamanca", 34, 116, "Manager"), new User("Gus Firing", 49, 0, "Board"), new User("Gale Boetticher", 44, 2, "Chemists"), new User("Mike Ehrmantraut", 57, 0, "Security")));
        // then
        assertEquals(2.25, testee.getAvgAboveForty(), 0.01);
    }

    @Test
    void testAvgAboveFortyButNoUsersAboveForty() {
        // given
        testee = new ForumStats(List.of(new User("Walter White", 1, 0, "Chemists"), new User("Jessie Pinkman", 25, 0, "Sales"), new User("Tuco Salamanca", 34, 0, "Manager"), new User("Gus Firing", 2, 0, "Board"), new User("Gale Boetticher", 3, 0, "Chemists"), new User("Mike Ehrmantraut", 4, 0, "Security")));
        // then
        assertEquals(Double.NaN, testee.getAvgAboveForty());
    }

    @Test
    void testAvgBelowFortyForUsersRepository() {
        // given
        testee = new ForumStats(List.of(new User("Walter White", 50, 7, "Chemists"), new User("Jessie Pinkman", 25, 4648, "Sales"), new User("Tuco Salamanca", 34, 116, "Manager"), new User("Gus Firing", 49, 0, "Board"), new User("Gale Boetticher", 44, 2, "Chemists"), new User("Mike Ehrmantraut", 57, 0, "Security")));
        // then
        assertEquals(2382.0, testee.getAvgBelowForty(), 0.01);
    }

    @Test
    void testAvgBelowFortyButNoUsersBelowForty() {
        // given
        testee = new ForumStats(List.of(new User("Walter White", 50, 7, "Chemists"), new User("Jessie Pinkman", 40, 4648, "Sales"), new User("Tuco Salamanca", 41, 116, "Manager"), new User("Gus Firing", 49, 0, "Board"), new User("Gale Boetticher", 44, 2, "Chemists"), new User("Mike Ehrmantraut", 57, 0, "Security")));
        // then
        assertEquals(Double.NaN, testee.getAvgBelowForty());
    }
}