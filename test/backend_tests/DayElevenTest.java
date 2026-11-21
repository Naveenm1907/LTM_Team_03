package com.edutech.progressive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.annotation.Annotation;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.edutech.progressive.controller.AccountController;
import com.edutech.progressive.controller.TransactionController;
import com.edutech.progressive.entity.Accounts;
import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.entity.Transactions;

import javax.persistence.Entity;

public class DayElevenTest {

    @Test
    void testAccountAndTransactionControllersHaveRestController_Day11() {

        Annotation accountAnnotation = AccountController.class.getAnnotation(RestController.class);

        Annotation transactionAnnotation = TransactionController.class.getAnnotation(RestController.class);

        assertNotNull(accountAnnotation,
                "AccountController should have @RestController annotation");

        assertNotNull(transactionAnnotation,
                "TransactionController should have @RestController annotation");
    }

    @Test
    void testAllEntitiesHaveEntityAnnotation_Day11() {

        assertNotNull(Accounts.class.getAnnotation(Entity.class),
                "Accounts should have @Entity annotation");

        assertNotNull(Customers.class.getAnnotation(Entity.class),
                "Customers should have @Entity annotation");

        assertNotNull(Transactions.class.getAnnotation(Entity.class),
                "Transactions should have @Entity annotation");
    }

    @Test
    void testAccountsComparableByBalance_Day11() {

        Accounts account1 = new Accounts(101, 1, 10000.0);

        Accounts account2 = new Accounts(102, 2, 20000.0);

        assertTrue(account1.compareTo(account2) < 0);
        assertTrue(account2.compareTo(account1) > 0);
    }

    @Test
    void testTransactionParameterizedConstructorAndGetters_Day11() {

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