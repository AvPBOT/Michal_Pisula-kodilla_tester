package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    private static List<Student> studentTeacherList = new ArrayList<>();

    public static List<Student> getStudentTeacherList() {
        studentTeacherList.add(new Student("Jan Lukasiewicz", new Teacher("Kazimierz Twardowski")));
        studentTeacherList.add(new Student("Arystoteles", new Teacher("Platon")));
        studentTeacherList.add(new Student("Merlin", null));
        studentTeacherList.add(new Student("Darth Traya", null));
        return studentTeacherList;
    }

    public static void printStudentTeacherPairs() {
        for(Student student : studentTeacherList) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("Student: " + student.getName() + ", Teacher: " + teacherName);
        }
    }

    public static void main(String[] args) {
        getStudentTeacherList();
        printStudentTeacherPairs();
    }
}