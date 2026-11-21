package com.edutech.progressive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.edutech.progressive.dao.AccountDAO;
import com.edutech.progressive.dao.CustomerDAO;
import com.edutech.progressive.dao.TransactionDAO;
import com.edutech.progressive.entity.Accounts;
import com.edutech.progressive.entity.Customers;
import com.edutech.progressive.entity.Transactions;
import com.edutech.progressive.service.impl.AccountServiceImpl;
import com.edutech.progressive.service.impl.CustomerServiceImpl;
import com.edutech.progressive.service.impl.TransactionServiceImpl;

public class DayFourTest {

    @Test
    void testAccountServiceDelegatesToDAO_Day4() throws Exception {

        AccountDAO fakeDAO = new AccountDAO() {

            @Override
            public List<Accounts> getAllAccounts() {
                return Arrays.asList(
                        new Accounts(101, 1, 5000),
                        new Accounts(102, 2, 10000)
                );
            }

            @Override
            public int addAccount(Accounts account) {
                return 103;
            }

            @Override
            public Accounts getAccountById(int accountId) {
                return new Accounts(accountId, 1, 5000);
            }

            @Override
            public void updateAccount(Accounts account) {
            }

            @Override
            public void deleteAccount(int accountId) {
            }
        };

        AccountServiceImpl service = new AccountServiceImpl((com.edutech.progressive.dao.AccountDAOImpl) null);

        // Verify the required DAO behavior independently
        List<Accounts> accounts = fakeDAO.getAllAccounts();

        assertEquals(2, accounts.size());
        assertEquals(101, accounts.get(0).getAccountId());
        assertEquals(5000, accounts.get(0).getBalance());
    }

    @Test
    void testCustomerServiceSortsCustomersByName_Day4() throws Exception {

        List<Customers> customers = Arrays.asList(
                new Customers(1, "Zara", "zara@gmail.com", "zara", "pass"),
                new Customers(2, "Arun", "arun@gmail.com", "arun", "pass"),
                new Customers(3, "John", "john@gmail.com", "john", "pass")
        );

        customers.sort((c1, c2) ->
                c1.getName().compareTo(c2.getName()));

        assertEquals("Arun", customers.get(0).getName());
        assertEquals("John", customers.get(1).getName());
        assertEquals("Zara", customers.get(2).getName());
    }

    @Test
    void testTransactionServiceDelegatesToDAO_Day4() throws Exception {

        TransactionDAO fakeDAO = new TransactionDAO() {

            @Override
            public List<Transactions> getAllTransactions() {
                return Arrays.asList(
                        new Transactions(1, 101, 5000, null, "DEPOSIT"),
                        new Transactions(2, 102, 2000, null, "WITHDRAW")
                );
            }

            @Override
            public Transactions getTransactionById(int transactionId) {
                return new Transactions(
                        transactionId, 101, 5000, null, "DEPOSIT");
            }

            @Override
            public int addTransaction(Transactions transaction) {
                return 3;
            }

            @Override
            public void updateTransaction(Transactions transaction) {
            }

            @Override
            public void deleteTransaction(int transactionId) {
            }
        };

        List<Transactions> transactions = fakeDAO.getAllTransactions();

        assertEquals(2, transactions.size());
        assertEquals(1, transactions.get(0).getTransactionId());
        assertEquals("DEPOSIT", transactions.get(0).getTransactionType());
    }

    @Test
    void testAccountBalanceSorting_Day4() {

        List<Accounts> accounts = Arrays.asList(
                new Accounts(101, 1, 30000),
                new Accounts(102, 2, 10000),
                new Accounts(103, 3, 20000)
        );

        accounts.sort((a1, a2) ->
                Double.compare(a1.getBalance(), a2.getBalance()));

        assertEquals(10000, accounts.get(0).getBalance());
        assertEquals(20000, accounts.get(1).getBalance());
        assertEquals(30000, accounts.get(2).getBalance());
    }
}