package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        DeliveryService postalConsignment = new PostalConsignment();
        DeliveryService postalDelivery = new PostalDelivery();
        NotificationService notificationService = new NotificationService();
        ShippingCenter shippingPostalConsignment = new ShippingCenter(postalConsignment, notificationService);
        ShippingCenter shippingPostalDelivery = new ShippingCenter(postalDelivery, notificationService);
        shippingPostalConsignment.sendPackage("Hill Street 11, New York", 18.2);
        shippingPostalDelivery.sendPackage("ul. Obywatelska 44, Warszawa", 40);
    }
}