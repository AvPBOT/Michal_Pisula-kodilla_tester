package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    Order order1 = new Order(100.00, LocalDate.of(2022,1, 1), "test1");
    Order order2 = new Order(110.00, LocalDate.of(2022,2, 2), "test2");
    Order order3 = new Order(120.00, LocalDate.of(2022,3, 3), "test3");
    Order order4 = new Order(130.00, LocalDate.of(2022,4, 4), "test4");
    Order order5 = new Order(140.00, LocalDate.of(2022,5, 5), "test5");
    Order order6 = new Order(150.00, LocalDate.of(2022,6, 6), "test6");

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
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
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
        assertEquals(6, numberOfOrders);
    }

    @Test
    public void testGetOrdersFromARangeOfDates() {
        //when
        Set<Order> result = shop.getOrdersFromARangeOfDates(LocalDate.of(2022, 1, 1), LocalDate.of(2022, 3, 3));

        // then
        assertEquals(3, result.size());
        assertTrue(result.contains(order1) && result.contains(order2) && result.contains(order3));
    }

    @Test
    public void shouldReturnNullIfNoOrdersInGivenRangeOfDates() {
        assertNull(shop.getOrdersFromARangeOfDates(LocalDate.of(1990, 1, 1), LocalDate.of(1991, 3, 3)));
    }

    @Test
    public void testGetOrdersFromARangeOfValues() {
        //when
        Set<Order> result = shop.getOrderFromRangeOfValues(100, 120);

        //then
        assertEquals(3, result.size());
        assertTrue(result.contains(order1) && result.contains(order2) && result.contains(order3));
    }

    @Test
    public void shouldReturnNullIfNoOrdersInGivenRangeOfValues() {
        assertNull(shop.getOrderFromRangeOfValues(70, 90));
    }

    @Test
    public void testGetNumberOfOrders() {
        //when
        int result = shop.getNumberOfOrders();

        //then
        assertEquals(6, result);
    }

    @Test
    public void shouldCalculateValueOfAllOrders() {
        //when
        double value = shop.calculateValueOfAllOrders();

        //then
        assertEquals(750, value);
    }
}