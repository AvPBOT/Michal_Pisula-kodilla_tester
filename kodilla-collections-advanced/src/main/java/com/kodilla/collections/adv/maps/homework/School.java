package com.kodilla.collections.adv.maps.homework;

import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> students;

    public School(String schoolName, List<Integer> students) {
        this.schoolName = schoolName;
        this.students = students;
    }

    public int studentsCount() {
        int sum = 0;
        for (int count : students) {
            sum += count;
        }
        return sum;
    }

    public String getSchoolName() {
        return schoolName;
    }
}