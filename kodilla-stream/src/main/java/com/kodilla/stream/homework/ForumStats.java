
package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    private List<User> users;

    public ForumStats(List<User> usersList) {
        this.users = usersList;
    }

    public double avgAboveForty() {
        return this.users.stream()
                .filter(u -> u.getAge() >= 40)
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);
    }


    public double avgBelowForty() {
        return this.users.stream()
                .filter(u -> u.getAge() < 40)
                .map(User::getNumberOfPost)
                .mapToDouble(n -> n)
                .average()
                .orElse(Double.NaN);
    }

    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats(UsersRepository.getUsersList());
        System.out.println("Average number of posts by users whose age is < 40: " + forumStats.avgAboveForty());
        System.out.println("Average number of posts by users whose age is >= 40: " + forumStats.avgBelowForty());
    }
}

