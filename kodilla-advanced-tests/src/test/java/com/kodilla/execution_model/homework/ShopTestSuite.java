package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ShopTestSuite {
    Shop shop = new Shop();

    Order order1 = new Order(100.00, LocalDate.of(2022,1, 1), "test1");
    Order order2 = new Order(110.00, LocalDate.of(2022,2, 2), "test2");
    Order order3 = new Order(120.00, LocalDate.of(2022,3, 3), "test3");

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @BeforeEach
    public void initShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @AfterEach
    public void reset() {
        System.out.println("Resetting...");
    }

    @Test
    public void testAddOrder() {
        //When
        int numberOfOrders = shop.getNumberOfOrders();

        //Then
        assertEquals(3, numberOfOrders);
    }

    @Test
    public void testGetOrderFromARangeOfDates() {
        //when
        Set<Order> result = shop.getOrdersFromARangeOfDates(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 3, 3));

        // then
        assertEquals(3, result.size());
        assertTrue(result.contains(order1) && result.contains(order2) && result.contains(order3));
    }

    @Test
    public void testGetOrderFromARangeOfValues() {
        //when
        Set<Order> result = shop.getOrderFromRangeOfValues(100,120);

        //then
        assertEquals(3, result.size());
        assertTrue(result.contains(order1) && result.contains(order2) && result.contains(order3));
    }

    @Test
    public void testGetNumberOfOrders() {
        //when
        int result = shop.getNumberOfOrders();

        //then
        assertEquals(3, result);
    }

    @Test
    public void shouldCalculateValueOfAllOrders() {
        //when
        double sum = shop.calculateValueOfAllOrders();

        //then
        assertEquals(330, sum);
    }
}