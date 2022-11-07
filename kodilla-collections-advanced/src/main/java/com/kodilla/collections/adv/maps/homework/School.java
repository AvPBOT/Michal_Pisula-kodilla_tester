package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> students = new ArrayList<>();

    public School(List<Integer> students) {
        this.students = students;
    }

    public double getSum() {
        int sum = 0;
        for (int student : students)
            sum += student;
        return sum;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
