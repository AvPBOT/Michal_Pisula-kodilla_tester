package com.kodilla.collections.adv.immutable.homework;

public class ImmutableTask {
    public static void main(String[] args) {
        Task task = new Task("ImmutableTask", 10);
    //    TaskRecord taskRecord = new TaskRecord("ImmutableTest", 20, 2022);
    //    TaskHacked taskHacked = new TaskHacked("HackedTest", 100);

    //    taskHacked.modifyTitle("HAHAHAHAHA");

        System.out.println(task);
    //    System.out.println(taskRecord);
    //    System.out.println(taskHacked);
    }
}
