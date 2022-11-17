package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static List<Student> initStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Lukasiewicz", new Teacher("Kazimierz Twardowski")));
        students.add(new Student("Arystoteles", new Teacher("Platon")));
        students.add(new Student("Merlin", null));
        students.add(new Student("Darth Traya", null));
        return students;
    }

    private static void printStudents(List<Student> students) {
        for(Student student : students) {
            System.out.println("Student: " + student.getName() + ", Teacher: " + student.getTeacher().orElse("<undefined>"));
        }
    }

    public static void main(String[] args) {
        List students = initStudents();
        printStudents(students);
    }
}