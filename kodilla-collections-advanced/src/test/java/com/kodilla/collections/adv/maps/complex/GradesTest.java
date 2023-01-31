package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class GradesTest {
    private final Grades marcoGrades = new Grades(Arrays.asList(5.0, 4.0, 4.5, 3.0, 2.0));

    @Test
    void testGetAverage() {
        //When
        double marcoAverageGrade = marcoGrades.getAverage();

        //Then
        Assertions.assertEquals(3.7, marcoAverageGrade);
    }
}