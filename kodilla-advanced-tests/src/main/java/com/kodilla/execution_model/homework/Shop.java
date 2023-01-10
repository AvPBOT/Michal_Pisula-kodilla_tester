package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {

    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Set<Order> getOrdersFromARangeOfDates(LocalDate from, LocalDate to) {
        Set<Order> dateFilter = orders
                .stream()
                .filter(i -> (i.getOrderDate().isEqual(from) || i.getOrderDate().isAfter(from)) && (i.getOrderDate().isEqual(to) || i.getOrderDate().isBefore(to)))
                .collect(Collectors.toSet());
        if (dateFilter.isEmpty()) {
            return null;
        }
        return dateFilter;
    }

    public Set<Order> getOrderFromRangeOfValues(double minimum, double maximum) {
        Set<Order> valueFilter = orders
                .stream()
                .filter(i -> i.getOrderValue() >= minimum && i.getOrderValue() <= maximum)
                .collect(Collectors.toSet());
        if (valueFilter.isEmpty()) {
            return null;
        }
        return valueFilter;
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public double calculateValueOfAllOrders() {
        double valueOfOrders = orders
                .stream()
                .map(Order::getOrderValue)
                .mapToDouble(i -> i)
                .sum();
        return valueOfOrders;
    }
}
