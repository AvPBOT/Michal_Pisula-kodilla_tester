package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {
    WeatherService weatherService = new WeatherService();
    User user1 = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    User user3 = Mockito.mock(User.class);
    Alert LocationAlert = Mockito.mock(Alert.class);
    Alert GlobalAlert = Mockito.mock(Alert.class);
    Location location = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);

    @Test
    public void userShouldReceiveAlertsFromSubscribedLocations() {
        weatherService.addUser(user1,location);
        weatherService.addNewLocation(user1, location2);

        weatherService.sendAlertFromLocation(location, LocationAlert);
        weatherService.sendAlertFromLocation(location2, LocationAlert);

        Mockito.verify(user1, Mockito.times(2)).receiveAlert(LocationAlert);
    }

    @Test
    public void userShouldNotReceiveAlertsFormUnsubscribedLocations() {
        weatherService.addUser(user1, location);
        weatherService.unsubscribeLocation(user1, location);
        weatherService.sendAlertFromLocation(location, LocationAlert);

        Mockito.verify(user1, Mockito.never()).receiveAlert(LocationAlert);
    }

    @Test
    public void shouldNotReceiveAlertsIfUnsubscribedAllLocations() {
        weatherService.addUser(user1,location);
        weatherService.addNewLocation(user1, location2);

        weatherService.unsubscribeAllLocations(user1);
        weatherService.sendAlertFromLocation(location, LocationAlert);
        weatherService.sendAlertFromLocation(location2, LocationAlert);
        Mockito.verify(user1, Mockito.never()).receiveAlert(LocationAlert);
    }

    @Test
    public void shouldReceiveAlertsOnlyFromSubscribedLocations() {
        weatherService.addUser(user1,location);
        weatherService.addUser(user2,location2);
        weatherService.addUser(user3,location2);

        weatherService.sendAlertFromLocation(location2, LocationAlert);
        Mockito.verify(user1, Mockito.never()).receiveAlert(LocationAlert);
        Mockito.verify(user2, Mockito.times(1)).receiveAlert(LocationAlert);
        Mockito.verify(user3, Mockito.times(1)).receiveAlert(LocationAlert);
    }

    @Test
    public void shouldSendAlertToAllUsers() {
        weatherService.addUser(user1,location);
        weatherService.addUser(user2,location2);
        weatherService.addUser(user3,location2);

        weatherService.sendAlertToAllUsers(GlobalAlert);
        Mockito.verify(user1, Mockito.times(1)).receiveAlert(GlobalAlert);
        Mockito.verify(user2, Mockito.times(1)).receiveAlert(GlobalAlert);
        Mockito.verify(user3, Mockito.times(1)).receiveAlert(GlobalAlert);
    }

    @Test
    public void shouldRemoveLocationAndNotSendAlerts() {
        weatherService.addUser(user1,location);
        weatherService.addNewLocation(user1,location2);
        weatherService.addUser(user2,location2);
        weatherService.addUser(user3,location);

        weatherService.removeLocation(location2);
        weatherService.sendAlertFromLocation(location2, LocationAlert);

        Mockito.verify(user1, Mockito.never()).receiveAlert(LocationAlert);
        Mockito.verify(user2, Mockito.never()).receiveAlert(LocationAlert);
        Mockito.verify(user3, Mockito.never()).receiveAlert(LocationAlert);

    }
}