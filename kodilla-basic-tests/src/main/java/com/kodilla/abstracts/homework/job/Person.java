package com.kodilla.abstracts.homework.job;

public class Person {
    private String firstName;
    private int age;
    private String job;
    public Person(String firstName, int age, String job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getJob() {
        return this.job;
    }
    public String getResponsibilities() {
        return this.responsibilities;
    }
    public void printResponsibilities() {
        System.out.println(this.getFirstName() + "'s responsibilities as the " + this.getJob() + " are: " + this.getResponsibilities());
    }
}