package com.kodilla.abstracts.homework.job;

public class Person extends Job{
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        super(0, job.getResponsibilities());
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public void showResponsibilities() {
        System.out.println(this.getFirstName() + "'s responsibilities at work are: " + job.getResponsibilities() + ".");
    }
}