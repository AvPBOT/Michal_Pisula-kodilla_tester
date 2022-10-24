package com.kodilla.abstracts.homework.job;

public abstract class Job {
    public double salary;
    public String responsibilities;
    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }
}