package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException() {
        Throwable exception = assertThrows(
                OrderDoesntExistException.class, () -> {
                    Warehouse.addOrder(new Order("1"));
                    Warehouse.addOrder(new Order("2"));
                    Warehouse.addOrder(new Order("3"));
                    Warehouse.getOrder("4");
                }
        );
        assertEquals("Order number 4 not found!", exception.getMessage());
    }
}
