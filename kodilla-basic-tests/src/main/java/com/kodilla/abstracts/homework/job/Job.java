package com.kodilla.abstracts.homework.job;

public abstract class Job {
    private double salary;
    private String reponsibilities;

    public Job(double salary, String reponsibilities) {
        this.salary = salary;
        this.reponsibilities = reponsibilities;
    }

    public String getResponsibilities() {
        return reponsibilities;
    }
    
    public abstract void showResponsibilities();
}
