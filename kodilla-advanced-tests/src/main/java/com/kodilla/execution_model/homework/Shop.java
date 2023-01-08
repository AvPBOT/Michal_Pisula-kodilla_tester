package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        // this.orders.add(order);
    }

    public Set<Order> getOrdersFromARangeOfDates(LocalDate from, LocalDate to) {
        return null;
    }

    public Set<Order> getOrderFromRangeOfValues(double minimum, double maximum) {
        return null;
    }

    public int getNumberOfOrders() {
        return 0;
    }

    public double calculateValueOfAllOrders() {
        return 0;
    }
}
