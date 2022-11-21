package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WarehouseTestSuite {

    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        // given
        Order order1 = new Order("1");
        warehouse.addOrder(order1);
        // when
        Order result = warehouse.getOrder("1");
        Order expectedOrder = order1;
        // then
        assertEquals(expectedOrder, result);
    }

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
