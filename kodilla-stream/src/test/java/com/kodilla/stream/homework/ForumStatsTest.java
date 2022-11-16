package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {

    @Test
    void testAddUsers() {
        // when
        UsersRepository.getUsersList();
        // then
        List<User> expectedUsers = new ArrayList<>();
        expectedUsers.add(new User("Walter White", 50, 7, "Chemists"));
        expectedUsers.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        expectedUsers.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        expectedUsers.add(new User("Gus Firing", 49, 0, "Board"));
        expectedUsers.add(new User("Gale Boetticher", 44, 2, "Chemists"));
        expectedUsers.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(expectedUsers, UsersRepository.getUsersList());
    }

    @Test
     void testAvgAboveForty() {
        // when
        ForumStats.getAvgAboveForty();
        // then
        assertEquals(2.25, ForumStats.getAvgAboveForty(), 0.01);
    }

    @Test
    void testAvgBelowForty() {
        // when
        ForumStats.getAvgBelowForty();
        // then
        assertEquals(2382.0, ForumStats.getAvgBelowForty(), 0.01);
    }

    @Test
    void testAvgAboveFiftyFive() {
        // when
        ForumStats.getAvgAboveFiftyFive();
        // then
        assertEquals(0.0, ForumStats.getAvgAboveFiftyFive(), 0.01);
    }
}