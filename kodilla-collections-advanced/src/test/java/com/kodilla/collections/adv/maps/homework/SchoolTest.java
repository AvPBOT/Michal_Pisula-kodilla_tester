package com.kodilla.collections.adv.maps.homework;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    private School testeeSchool = new School("Testee School", Arrays.asList(15, 25, 35, 11, 23, 21, 31));

    @Test
    public void shouldGetStudentsCount() {
        //When
        int studentsCount = testeeSchool.getStudentsCount();

        //Then
        assertEquals(161, studentsCount);
    }

    @Test
    public void shouldGetSchoolName() {
        //When
        String schoolName = testeeSchool.getSchoolName();

        //Then
        assertEquals("Testee School", schoolName);
    }
}