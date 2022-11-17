
package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private static List<Order> orderList = new ArrayList<>();

    public static Order addOrder(Order order) {
        orderList.add(order);
        return order;
    }

    public static Order getOrder(String number) throws OrderDoesntExistException {
        return orderList
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .findAny()
                .orElseThrow(new OrderDoesntExistException(number));
    }
}