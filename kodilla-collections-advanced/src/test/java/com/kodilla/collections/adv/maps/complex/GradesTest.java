package com.kodilla.collections.adv.maps.complex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class GradesTest {
    private final Grades testeeMarcoGrades = new Grades(Arrays.asList(5.0, 4.0, 4.5, 3.0, 2.0));

    private final Grades testeeEmptyGradesList = new Grades(new ArrayList<>());

    @Test
    void testGetAverage() {
        //When
        double marcoAverageGrade = testeeMarcoGrades.getAverage();

        //Then
        Assertions.assertEquals(3.7, marcoAverageGrade);
    }

    @Test
    void testAverageOfEmptyGradesList() {
        //When
        double emptyGradesList = testeeEmptyGradesList.getAverage();

        //Then
        Assertions.assertEquals(Double.NaN, emptyGradesList);
    }
}