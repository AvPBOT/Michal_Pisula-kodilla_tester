package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Exception {

    public OrderDoesntExistException(String number) {
        super(String.format("Order number %s not found!", number));
    }
}

