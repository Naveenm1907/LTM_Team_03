package com.edutech.progressive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.edutech.progressive.entity.Accounts;
import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.service.impl.AccountServiceImplArraylist;
import com.edutech.progressive.service.impl.CustomerServiceImplArraylist;

public class DayFiveTest {

    @Test
    void testAccountsComparableByBalance_Day5() {

        Accounts account1 = new Accounts(101, 1, 10000.0);
        Accounts account2 = new Accounts(102, 2, 20000.0);

        assertTrue(account1.compareTo(account2) < 0);
        assertTrue(account2.compareTo(account1) > 0);
        assertEquals(0, account1.compareTo(
                new Accounts(103, 3, 10000.0)));
    }

    @Test
    void testCustomersComparableByName_Day5() {

        Customers customer1 = new Customers(1, "Arun", "arun@gmail.com", "arun", "pass");

        Customers customer2 = new Customers(2, "Bala", "bala@gmail.com", "bala", "pass");

        assertTrue(customer1.compareTo(customer2) < 0);
        assertTrue(customer2.compareTo(customer1) > 0);
        assertEquals(0, customer1.compareTo(
                new Customers(3, "Arun", "test@gmail.com", "test", "pass")));
    }

    @Test
    void testAccountServiceSortsAccountsByBalance_Day5() {

        AccountServiceImplArraylist service = new AccountServiceImplArraylist();

        service.emptyArrayList();

        service.addAccount(new Accounts(101, 1, 30000.0));
        service.addAccount(new Accounts(102, 2, 10000.0));
        service.addAccount(new Accounts(103, 3, 20000.0));

        List<Accounts> accounts = service.getAllAccountsSortedByBalance();

        assertEquals(10000.0, accounts.get(0).getBalance());
        assertEquals(20000.0, accounts.get(1).getBalance());
        assertEquals(30000.0, accounts.get(2).getBalance());
    }

    @Test
    void testCustomerServiceSortsCustomersByName_Day5() throws Exception {

        CustomerServiceImplArraylist service = new CustomerServiceImplArraylist();

        service.emptyArrayList();

        service.addCustomer(
                new Customers(1, "Zara", "zara@gmail.com", "zara", "pass"));

        service.addCustomer(
                new Customers(2, "Arun", "arun@gmail.com", "arun", "pass"));

        service.addCustomer(
                new Customers(3, "Bala", "bala@gmail.com", "bala", "pass"));

        List<Customers> customers = service.getAllCustomersSortedByName();

        assertEquals("Arun", customers.get(0).getName());
        assertEquals("Bala", customers.get(1).getName());
        assertEquals("Zara", customers.get(2).getName());
    }
}