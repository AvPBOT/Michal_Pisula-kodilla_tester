package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {

    @Test
    public void testGetStudentTeacherList() {
        List<Student> expectedstudentTeacherList = new ArrayList<>();
        expectedstudentTeacherList.add(new Student("Jan Lukasiewicz", new Teacher("Kazimierz Twardowski")));
        expectedstudentTeacherList.add(new Student("Arystoteles", new Teacher("Platon")));
        expectedstudentTeacherList.add(new Student("Merlin", null));
        expectedstudentTeacherList.add(new Student("Darth Traya", null));
        assertEquals(expectedstudentTeacherList, Application.getStudentTeacherList());
    }
}