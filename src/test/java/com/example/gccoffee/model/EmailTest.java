package com.example.gccoffee.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            Email email = new Email("accccc");
        });
    }

    @Test
    void testValidEmail() {
        Email email = new Email("hello@gmail.com");
        assertTrue(email.getAddress().equals("hello@gmail.com"));
    }

    @Test
    void testEqEmail() {
        Email email = new Email("hello@gmail.com");
        Email email2 = new Email("hello@gmail.com");
        assertEquals(email, email2);
    }


}