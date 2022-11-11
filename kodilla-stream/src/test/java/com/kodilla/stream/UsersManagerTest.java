package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UsersManagerTest {

    @Test
    void testFilterChemistGroupUsernames() {
        // when
        UsersManager.filterChemistGroupUsernames();
        // then
        List<String> expectedUsernames = new ArrayList<>();
            expectedUsernames.add("Walter White");
            expectedUsernames.add("Gale Boetticher");
        assertEquals(expectedUsernames, UsersManager.filterChemistGroupUsernames());
    }

    @Test
    void testFilterOlderThanUsernames() {
        // when
        UsersManager.filterOlderThanUsernames(40);
        // then
        List<String> expectedUsernames = new ArrayList<>();
        expectedUsernames.add("Walter White");
        expectedUsernames.add("Gus Firing");
        expectedUsernames.add("Gale Boetticher");
        expectedUsernames.add("Mike Ehrmantraut");
        assertEquals(expectedUsernames, UsersManager.filterOlderThanUsernames(40));
    }

    @Test
    void testFilterChemistsWithNumberOfPostHigherThanUsernames() {
        // when
        UsersManager.filterChemistsWithNumberOfPostHigherThan(5);
        // then
        List<String> expectedUsernames = new ArrayList<>();
        expectedUsernames.add("Walter White");
        assertEquals(expectedUsernames, UsersManager.filterChemistsWithNumberOfPostHigherThan(5));
    }
}
