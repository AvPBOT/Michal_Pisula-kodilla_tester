package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {
    private ForumStats testee;

    @BeforeEach
    public void initUsersList() {
        testee = new ForumStats(List.of(new User("Walter White", 50, 7, "Chemists"), new User("Jessie Pinkman", 25, 4648, "Sales"), new User("Tuco Salamanca", 34, 116, "Manager"), new User("Gus Firing", 49, 0, "Board"), new User("Gale Boetticher", 44, 2, "Chemists"), new User("Mike Ehrmantraut", 57, 0, "Security")));
    }

    @Test
     void testAvgAboveFortyForUsersRepository() {
        assertEquals(2.25, testee.avgAboveForty(), 0.01);
    }

    @Test
    void testAvgAboveFortyButNoUsersAboveForty() {
        // given
        testee = new ForumStats(List.of(new User("Walter White", 1, 0, "Chemists"), new User("Jessie Pinkman", 25, 0, "Sales"), new User("Tuco Salamanca", 34, 0, "Manager"), new User("Gus Firing", 2, 0, "Board"), new User("Gale Boetticher", 3, 0, "Chemists"), new User("Mike Ehrmantraut", 4, 0, "Security")));
        // then
        assertEquals(NaN, testee.avgAboveForty());
    }

    @Test
    void testAvgAboveFortyButEmptyList() {
        // given
        testee = new ForumStats(new ArrayList<>());
        // then
        assertEquals(NaN, testee.avgAboveForty());
    }

    @Test
    void testAvgBelowFortyForUsersRepository() {
        assertEquals(2382.0, testee.avgBelowForty(), 0.01);
    }

    @Test
    void testAvgBelowFortyButNoUsersBelowForty() {
        // given
        testee = new ForumStats(List.of(new User("Walter White", 50, 7, "Chemists"), new User("Jessie Pinkman", 40, 4648, "Sales"), new User("Tuco Salamanca", 41, 116, "Manager"), new User("Gus Firing", 49, 0, "Board"), new User("Gale Boetticher", 44, 2, "Chemists"), new User("Mike Ehrmantraut", 57, 0, "Security")));
        // then
        assertEquals(NaN, testee.avgBelowForty());
    }

    @Test
    void testAvgBelowFortyButEmptyList() {
        // given
        testee = new ForumStats(new ArrayList<>());
        // then
        assertEquals(NaN, testee.avgBelowForty());
    }
}