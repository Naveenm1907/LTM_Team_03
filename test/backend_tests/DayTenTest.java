package com.edutech.progressive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.annotation.Annotation;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RestController;

import com.edutech.progressive.controller.CustomerController;
import com.edutech.progressive.entity.Customers;

public class DayTenTest {

    @Test
    void testCustomerControllerHasRestControllerAnnotation_Day10() {

        Annotation annotation = CustomerController.class.getAnnotation(RestController.class);

        assertNotNull(annotation,
                "CustomerController should have @RestController annotation");
    }

    @Test
    void testCustomersParameterizedConstructorAndGetters_Day10() {

        Customers customer = new Customers(
                101,
                "John",
                "john@gmail.com",
                "john123",
                "password123");

        assertEquals(101, customer.getCustomerId());
        assertEquals("John", customer.getName());
        assertEquals("john@gmail.com", customer.getEmail());
        assertEquals("john123", customer.getUsername());
        assertEquals("password123", customer.getPassword());
    }

    @Test
    void testCustomersComparableByName_Day10() {

        Customers customer1 = new Customers(1, "Arun", "arun@gmail.com",
                "arun", "password");

        Customers customer2 = new Customers(2, "Bala", "bala@gmail.com",
                "bala", "password");

        assertTrue(customer1.compareTo(customer2) < 0);
    }

    @Test
    void testCustomersDefaultConstructorAndSetters_Day10() {

        Customers customer = new Customers();

        customer.setCustomerId(10);
        customer.setName("Vinoth");
        customer.setEmail("vinoth@gmail.com");
        customer.setUsername("vinoth123");
        customer.setPassword("pass123");
        customer.setRole("CUSTOMER");

        assertEquals(10, customer.getCustomerId());
        assertEquals("Vinoth", customer.getName());
        assertEquals("vinoth@gmail.com", customer.getEmail());
        assertEquals("vinoth123", customer.getUsername());
        assertEquals("pass123", customer.getPassword());
        assertEquals("CUSTOMER", customer.getRole());
    }
}