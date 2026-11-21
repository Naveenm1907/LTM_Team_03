package com.edutech.progressive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.edutech.progressive.dao.CustomerDAO;
import com.edutech.progressive.dto.CustomerAccountInfo;
import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.service.impl.CustomerServiceImpl;

public class DaySixTest {

    @Test
    void testGetAllCustomersFromDAO_Day6() throws Exception {

        List<Customers> customers = Arrays.asList(
                new Customers(1, "Arun", "arun@gmail.com", "arun", "pass"),
                new Customers(2, "Bala", "bala@gmail.com", "bala", "pass"));

        CustomerDAO fakeDAO = new CustomerDAO() {

            @Override
            public List<Customers> getAllCustomers() {
                return customers;
            }

            @Override
            public Customers getCustomerById(int customerId) {
                return null;
            }

            @Override
            public int addCustomer(Customers customer) {
                return -1;
            }

            @Override
            public void updateCustomer(Customers customer) {
            }

            @Override
            public void deleteCustomer(int customerId) {
            }

            @Override
            public CustomerAccountInfo getCustomerAccountInfo(int customerId) {
                return null;
            }
        };

        CustomerServiceImpl service = new CustomerServiceImpl(fakeDAO);

        List<Customers> result = service.getAllCustomers();

        assertSame(customers, result);
        assertEquals(2, result.size());
    }

    @Test
    void testAddCustomerThroughDAO_Day6() throws Exception {

        CustomerDAO fakeDAO = new CustomerDAO() {

            @Override
            public int addCustomer(Customers customer) {
                customer.setCustomerId(101);
                return 101;
            }

            @Override
            public List<Customers> getAllCustomers() {
                return List.of();
            }

            @Override
            public Customers getCustomerById(int customerId) {
                return null;
            }

            @Override
            public void updateCustomer(Customers customer) {
            }

            @Override
            public void deleteCustomer(int customerId) {
            }

            @Override
            public CustomerAccountInfo getCustomerAccountInfo(int customerId) {
                return null;
            }
        };

        CustomerServiceImpl service = new CustomerServiceImpl(fakeDAO);

        Customers customer = new Customers(0, "John", "john@gmail.com", "john", "pass");

        int result = service.addCustomer(customer);

        assertEquals(101, result);
        assertEquals(101, customer.getCustomerId());
    }

    @Test
    void testGetCustomerByIdThroughDAO_Day6() throws Exception {

        Customers expectedCustomer = new Customers(
                10,
                "Kumar",
                "kumar@gmail.com",
                "kumar",
                "pass");

        CustomerDAO fakeDAO = new CustomerDAO() {

            @Override
            public Customers getCustomerById(int customerId) {
                return expectedCustomer;
            }

            @Override
            public List<Customers> getAllCustomers() {
                return List.of();
            }

            @Override
            public int addCustomer(Customers customer) {
                return -1;
            }

            @Override
            public void updateCustomer(Customers customer) {
            }

            @Override
            public void deleteCustomer(int customerId) {
            }

            @Override
            public CustomerAccountInfo getCustomerAccountInfo(int customerId) {
                return null;
            }
        };

        CustomerServiceImpl service = new CustomerServiceImpl(fakeDAO);

        Customers result = service.getCustomerById(10);

        assertSame(expectedCustomer, result);
        assertEquals(10, result.getCustomerId());
        assertEquals("Kumar", result.getName());
    }

    @Test
    void testGetAllCustomersSortedByName_Day6() throws Exception {

        List<Customers> customers = Arrays.asList(
                new Customers(1, "Zara", "zara@gmail.com", "zara", "pass"),
                new Customers(2, "Arun", "arun@gmail.com", "arun", "pass"),
                new Customers(3, "Bala", "bala@gmail.com", "bala", "pass"));

        CustomerDAO fakeDAO = new CustomerDAO() {

            @Override
            public List<Customers> getAllCustomers() {
                return customers;
            }

            @Override
            public Customers getCustomerById(int customerId) {
                return null;
            }

            @Override
            public int addCustomer(Customers customer) {
                return -1;
            }

            @Override
            public void updateCustomer(Customers customer) {
            }

            @Override
            public void deleteCustomer(int customerId) {
            }

            @Override
            public CustomerAccountInfo getCustomerAccountInfo(int customerId) {
                return null;
            }
        };

        CustomerServiceImpl service = new CustomerServiceImpl(fakeDAO);

        List<Customers> result = service.getAllCustomersSortedByName();

        assertEquals("Arun", result.get(0).getName());
        assertEquals("Bala", result.get(1).getName());
        assertEquals("Zara", result.get(2).getName());
    }
}