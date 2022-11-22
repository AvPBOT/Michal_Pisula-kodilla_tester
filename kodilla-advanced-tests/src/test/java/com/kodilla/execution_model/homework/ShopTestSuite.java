package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.util.Date;
import java.util.Set;

class ShopTestSuite {
    Shop shop = new Shop();

    Order order1 = new Order(124, Date(int year, int month, int date), "customer1"); // wartość zamówienia, datę oraz login osoby dokonującej zamówienia
    Order order2 = new Order(343, Date(int year, int month, int date), "customer2");
    Order order3 = new Order(893, Date(int year, int month, int date), "customer3"); // itd.

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
        shop.addOrder(order3); // itd.
    }

    @AfterEach
    public void reset() {
        System.out.println("Resetting...");
    }

    @Test
    public void testAddOrder() {
        assertEquals(3, shop.getNumberOfOrders());
    }

    @Test
    public void shouldNotAddOrderIfOrderValueZeroOrNegative() {
        shop.addOrder(new Order(0, Date(int year, int month, int date), "test1");
        shop.addOrder(new Order(-1337, Date(int year, int month, int date), "test2");
        assertEquals(3, shop.getNumberOfOrders());
    }

    @Test
    public void testGetOrderFromARangeOfDates() {
        //when
        Set<Order> result = shop.getOrderFromARangeOfDates();
        // then
        assertEquals(?, result.size());
        assertTrue(result.contains(order1) && ...);
    }

    @Test
    public void shouldReturnNullIfNoOrderInGivenDateRangeInGetOrderFromARangeOfDates() {
        assertNull(shop.getOrderFromARangeOfDates());
    }

    @Test
    public void shouldReturnNullIfDateFromGreaterThanDateToInGetOrderFromARangeOfDates() {
        assertNull(shop.getOrderFromARangeOfDates());
    }

    @Test
    public void testGetOrderFromARangeOfValues() {
        //when
        Set<Order> result = shop.getOrderFromARangeOfValues(??,???);
        //then
        assertEquals(?, result.size());
        assertTrue(result.contains() && ...);
    }

    @Test
    public void shouldReturnNullIfNoOrderInGivenValuesRangeInGetOrderFromARangeOfValues() {
        assertNull(shop.getOrderFromARangeOfValues());
    }

    @Test
    public void shouldReturnNullIfMinGreaterThanMaxInGetOrderFromARangeOfValues() {
        assertNull(shop.getOrderFromARangeOfValues(??,?));
    }

    @Test
    public void testGetNumberOfOrders() {
        //when
        int result = shop.getNumberOfOrders();
        //then
        assertEquals(?, result);
    }

    @Test
    public void testCalculateTotalValueOfAllOrders() {
        //when
        double sum = shop.getTotalValueOfAllOrders();
        //then
        assertEquals(?, sum);
    }
}