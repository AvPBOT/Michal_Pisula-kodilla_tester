package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {
    WeatherService weatherService = new WeatherService();
    User user1 = Mockito.mock(User.class);
    User user2 = Mockito.mock(User.class);
    User user3 = Mockito.mock(User.class);
    WeatherAlert weatherAlert1 = Mockito.mock(WeatherAlert.class);
    WeatherAlert weatherAlert2 = Mockito.mock(WeatherAlert.class);
    Location location = Mockito.mock(Location.class);
    Location location2 = Mockito.mock(Location.class);

    @Test
    public void userShouldReceiveAlertsFromSubscribedLocations() {
        weatherService.addUser(user1,location);
        weatherService.addNewLocation(user1, location2);

        weatherService.sendAlertFromLocation(location, weatherAlert1);
        weatherService.sendAlertFromLocation(location2, weatherAlert1);

        Mockito.verify(user1, Mockito.times(2)).receiveAlert(weatherAlert1);
    }

    @Test
    public void userShouldNotReceiveAlertsFormUnsubscribedLocations() {
        weatherService.addUser(user1, location);
        weatherService.unsubscribeLocation(user1,location);
        weatherService.sendAlertFromLocation(location, weatherAlert1);

        Mockito.verify(user1, Mockito.never()).receiveAlert(weatherAlert1);
    }

    @Test
    public void shouldNotReceiveAlertsIfUnsubscribedAllLocations() {
        weatherService.addUser(user1,location);
        weatherService.addNewLocation(user1, location2);

        weatherService.unsubscribeAllLocations(user1);
        weatherService.sendAlertFromLocation(location, weatherAlert1);
        weatherService.sendAlertFromLocation(location2, weatherAlert1);
        Mockito.verify(user1, Mockito.never()).receiveAlert(weatherAlert1);
    }

    @Test
    public void shouldReceiveAlertsOnlyFromSubscribedLocations() {
        weatherService.addUser(user1,location);
        weatherService.addUser(user2,location2);
        weatherService.addUser(user3,location2);

        weatherService.sendAlertFromLocation(location2, weatherAlert1);
        Mockito.verify(user1, Mockito.never()).receiveAlert(weatherAlert1);
        Mockito.verify(user2, Mockito.times(1)).receiveAlert(weatherAlert1);
        Mockito.verify(user3, Mockito.times(1)).receiveAlert(weatherAlert1);
    }

    @Test
    public void shouldSendAlertToAllUsers() {
        weatherService.addUser(user1,location);
        weatherService.addUser(user2,location2);
        weatherService.addUser(user3,location2);

        weatherService.sendAlertToAllUsers(weatherAlert2);
        Mockito.verify(user1, Mockito.times(1)).receiveAlert(weatherAlert2);
        Mockito.verify(user2, Mockito.times(1)).receiveAlert(weatherAlert2);
        Mockito.verify(user3, Mockito.times(1)).receiveAlert(weatherAlert2);
    }

    @Test
    public void shouldRemoveLocationAndNotSendAlerts() {
        weatherService.addUser(user1,location);
        weatherService.addNewLocation(user1,location2);
        weatherService.addUser(user2,location2);
        weatherService.addUser(user3,location);

        weatherService.removeLocation(location2);
        weatherService.sendAlertFromLocation(location2, weatherAlert1);

        Mockito.verify(user1, Mockito.never()).receiveAlert(weatherAlert1);
        Mockito.verify(user2, Mockito.never()).receiveAlert(weatherAlert1);
        Mockito.verify(user3, Mockito.never()).receiveAlert(weatherAlert1);

    }
}