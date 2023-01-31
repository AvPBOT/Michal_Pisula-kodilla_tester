package com.kodilla.collections.adv.immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {
    private final Book alchemik = new Book("Paulo Coelho", "Alchemik");

    @Test
    void shouldGetAuthor() {
        //When
        String author = alchemik.getAuthor();

        //Then
        assertEquals("Paulo Coelho", author);
    }

    @Test
    void shouldGetTitle() {
        //When
        String title = alchemik.getTitle();

        //Then
        assertEquals("Alchemik", title);
    }
}