package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {

    static double avgAboveForty = UsersRepository.getUsersList()
            .stream()
            .filter(u -> u.getAge() >= 40)
            .map(User::getNumberOfPost)
            .mapToInt(n -> n)
            .average()
            .getAsDouble();

    static double avgBelowForty = UsersRepository.getUsersList()
            .stream()
            .filter(u -> u.getAge() < 40)
            .map(User::getNumberOfPost)
            .mapToInt(n -> n)
            .average()
            .getAsDouble();

    public static double avgAboveForty() {
        return avgAboveForty;
    }

    public static double avgBelowForty() {
        return avgBelowForty;
    }

    public static void main(String[] args) {
        System.out.println("Average number of posts by users whose age is >= 40: " + avgAboveForty);
        System.out.println("Average number of posts for users whose age is < 40: " + avgBelowForty);
    }
}
