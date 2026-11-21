package com.edutech.progressive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.edutech.progressive.entity.Customers;

public class DayOneTest {

    @Test
    void testCustomersParameterizedConstructor_Day1() {

        Customers customer = new Customers(
                1,
                "John",
                "john@gmail.com",
                "john123",
                "password123");

        assertEquals(1, customer.getCustomerId());
        assertEquals("John", customer.getName());
        assertEquals("john@gmail.com", customer.getEmail());
        assertEquals("john123", customer.getUsername());
        assertEquals("password123", customer.getPassword());
    }

    @Test
    void testCustomersSettersAndGetters_Day1() {

        Customers customer = new Customers();

        customer.setCustomerId(2);
        customer.setName("David");
        customer.setEmail("david@gmail.com");
        customer.setUsername("david123");
        customer.setPassword("pass123");
        customer.setRole("CUSTOMER");

        assertEquals(2, customer.getCustomerId());
        assertEquals("David", customer.getName());
        assertEquals("david@gmail.com", customer.getEmail());
        assertEquals("david123", customer.getUsername());
        assertEquals("pass123", customer.getPassword());
        assertEquals("CUSTOMER", customer.getRole());
    }
}