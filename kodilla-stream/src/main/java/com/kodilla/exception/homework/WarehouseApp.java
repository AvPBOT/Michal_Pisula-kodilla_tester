package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
            Warehouse.addOrder(new Order("1"));
            Warehouse.addOrder(new Order("2"));
            Warehouse.addOrder(new Order("3"));
        try {
            Warehouse.getOrder("4");
        } catch (OrderDoesntExistException e) {
            throw new RuntimeException(e);
        }
    }
}