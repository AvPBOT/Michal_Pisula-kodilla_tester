package com.kodilla.stream.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForumStatsTest {

    @Test
     void testAvgAboveForty() {
        // when
        ForumStats.avgAboveForty();
        // then
        assertEquals(2.25, ForumStats.avgAboveForty());
    }

    @Test
    void testAvgBelowForty() {
        // when
        ForumStats.avgBelowForty();
        // then
        assertEquals(2382.0, ForumStats.avgBelowForty());
    }
}