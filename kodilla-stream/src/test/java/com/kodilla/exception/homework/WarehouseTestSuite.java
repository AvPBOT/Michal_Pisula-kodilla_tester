package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException() {
        Warehouse warehouse = new Warehouse();
        Throwable exception = assertThrows(
                OrderDoesntExistException.class, () -> {
                    warehouse.getOrder("4");
                }
        );
        assertEquals("Order number 4 not found!", exception.getMessage());
    }
}
