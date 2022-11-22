package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherService {
    private Map<User,Set<Location>> users = new HashMap<>();

    public void addUser(User user, Location location){
        Set<Location> locations = users.getOrDefault(user,new HashSet<>());
        locations.add(location);
        users.put(user, locations);
    }

    public void sendAlertFromLocation(Location location, WeatherAlert weatherAlert){
        for(Map.Entry<User,Set<Location>> user : users.entrySet()) {
            if (user.getValue().contains(location)) {
                user.getKey().receiveAlert(weatherAlert);
            }
        }
    }

    public void addNewLocation(User user, Location location) {
        users.get(user).add(location);
    }

    public void unsubscribeLocation(User user, Location location) {
        users.get(user).remove(location);
    }

    public void unsubscribeAllLocations(User user) {
        users.put(user, new HashSet<>());
    }

    public void sendAlertToAllUsers(WeatherAlert weatherAlert) {
        for(Map.Entry<User,Set<Location>> user : users.entrySet()) {
            user.getKey().receiveAlert(weatherAlert);
        }
    }

    public void removeLocation(Location location) {
        for(Map.Entry<User,Set<Location>> user : users.entrySet()) {
            if (user.getValue().contains(location)) {
                user.getValue().remove(location);
            }
        }
    }
}