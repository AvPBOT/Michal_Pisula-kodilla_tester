package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.NaN;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {
    private ForumStats testeeUsersDepository;
    private ForumStats testeeEmptyList;
    private ForumStats testeeNoUsersAboveForty;
    private ForumStats testeeNoUsersBelowForty;

    @BeforeEach
    public void initUsersList() {
        testeeUsersDepository = new ForumStats(List.of(new User("Walter White", 50, 7, "Chemists"), new User("Jessie Pinkman", 25, 4648, "Sales"), new User("Tuco Salamanca", 34, 116, "Manager"), new User("Gus Firing", 49, 0, "Board"), new User("Gale Boetticher", 44, 2, "Chemists"), new User("Mike Ehrmantraut", 57, 0, "Security")));
        testeeNoUsersAboveForty = new ForumStats(List.of(new User("Walter White", 1, 0, "Chemists"), new User("Jessie Pinkman", 25, 0, "Sales"), new User("Tuco Salamanca", 34, 0, "Manager"), new User("Gus Firing", 2, 0, "Board"), new User("Gale Boetticher", 3, 0, "Chemists"), new User("Mike Ehrmantraut", 4, 0, "Security")));
        testeeNoUsersBelowForty = new ForumStats(List.of(new User("Walter White", 50, 7, "Chemists"), new User("Jessie Pinkman", 40, 4648, "Sales"), new User("Tuco Salamanca", 41, 116, "Manager"), new User("Gus Firing", 49, 0, "Board"), new User("Gale Boetticher", 44, 2, "Chemists"), new User("Mike Ehrmantraut", 57, 0, "Security")));
        testeeEmptyList  = new ForumStats(new ArrayList<>());
    }

    @Test
     void testAvgAboveFortyForUsersRepository() {
        assertEquals(2.25, testeeUsersDepository.avgAboveForty(), 0.01);
    }

    @Test
    void testAvgAboveFortyButNoUsersAboveForty() {
        assertEquals(NaN, testeeNoUsersAboveForty.avgAboveForty());
    }

    @Test
    void testAvgAboveFortyButEmptyList() {
        assertEquals(NaN, testeeEmptyList.avgAboveForty());
    }

    @Test
    void testAvgBelowFortyForUsersRepository() {
        assertEquals(2382.0, testeeUsersDepository.avgBelowForty(), 0.01);
    }

    @Test
    void testAvgBelowFortyButNoUsersBelowForty() {
        assertEquals(NaN, testeeNoUsersBelowForty.avgBelowForty());
    }

    @Test
    void testAvgBelowFortyButEmptyList() {
        assertEquals(NaN, testeeEmptyList.avgBelowForty());
    }
}