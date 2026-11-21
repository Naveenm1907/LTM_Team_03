package com.edutech.progressive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;

import com.edutech.progressive.entity.Accounts;
import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.entity.Transactions;

public class DayTwoTest {

    @Test
    void testCustomersParameterizedConstructor_Day2() {

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
    void testAccountsParameterizedConstructorAndGetters_Day2() {

        Accounts account = new Accounts(
                101,
                1,
                50000.0);

        assertEquals(101, account.getAccountId());
        assertEquals(1, account.getCustomerId());
        assertEquals(50000.0, account.getBalance());
    }

    @Test
    void testTransactionsParameterizedConstructorAndGetters_Day2() {

        Date date = new Date();

        Transactions transaction = new Transactions(
                1001,
                101,
                5000.0,
                date,
                "DEPOSIT");

        assertEquals(1001, transaction.getTransactionId());
        assertEquals(101, transaction.getAccountId());
        assertEquals(5000.0, transaction.getAmount());
        assertEquals(date, transaction.getTransactionDate());
        assertEquals("DEPOSIT", transaction.getTransactionType());
    }
}