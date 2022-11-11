package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);

        List<String> olderThanUsernames = filterOlderThanUsernames(40);
        System.out.println(olderThanUsernames);

        List<String> chemistsWithNumberOfPostHigherThanUsernames = filterChemistsWithNumberOfPostHigherThan(5);
        System.out.println(chemistsWithNumberOfPostHigherThanUsernames);
    }

    static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    static List<String> filterOlderThanUsernames(int a) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > a)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    static List<String> filterChemistsWithNumberOfPostHigherThan(int b) {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> (user.getGroup().equals("Chemists")) && user.getNumberOfPost() > b)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}