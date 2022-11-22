package com.kodilla.abstracts.homework.job;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    public void showResponsibilities() {
        System.out.println(this.getFirstName() + "'s responsibilities at work are: " + job.getResponsibilities() + ".");
    }
}