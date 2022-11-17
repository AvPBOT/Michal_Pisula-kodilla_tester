package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        double avgAboveForty = users
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);
        System.out.println("Average number of posts by users whose age is >= 40: " + avgAboveForty);

        double avgBelowForty = users
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);
        System.out.println("Average number of posts by users whose age is < 40: " + avgBelowForty);
    }
}
