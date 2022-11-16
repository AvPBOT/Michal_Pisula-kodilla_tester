package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {

    static double avgAboveForty = UsersRepository.getUsersList()
            .stream()
            .filter(u -> u.getAge() >= 40)
            .map(User::getNumberOfPost)
            .mapToDouble(n -> n)
            .average()
            .orElse(Double.NaN);

    static double avgBelowForty = UsersRepository.getUsersList()
            .stream()
            .filter(u -> u.getAge() < 40)
            .map(User::getNumberOfPost)
            .mapToDouble(n -> n)
            .average()
            .orElse(Double.NaN);

    static double avgAboveFiftyFive = UsersRepository.getUsersList()
            .stream()
            .filter(u -> u.getAge() > 55)
            .map(User::getNumberOfPost)
            .mapToDouble(n -> n)
            .average()
            .orElse(Double.NaN);

    public static double getAvgAboveForty() {
        return avgAboveForty;
    }

    public static double getAvgBelowForty() {
        return avgBelowForty;
    }

    public static double getAvgAboveFiftyFive() {
        return avgAboveFiftyFive;
    }

    public static void main(String[] args) {
        System.out.println("Average number of posts by users whose age is >= 40: " + getAvgAboveForty());
        System.out.println("Average number of posts for users whose age is < 40: " + getAvgBelowForty());
        System.out.println("Average number of posts for users whose age is >55: " + getAvgAboveFiftyFive());
    }
}
