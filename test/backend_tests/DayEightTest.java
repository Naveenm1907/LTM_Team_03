package com.edutech.progressive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.edutech.progressive.dao.TransactionDAO;
import com.edutech.progressive.entity.Transactions;
import com.edutech.progressive.service.impl.TransactionServiceImpl;

public class DayEightTest {

    @Test
    void testGetAllTransactionsFromDAO_Day8() throws Exception {

        List<Transactions> transactions = Arrays.asList(
                new Transactions(1, 101, 5000.0, new Date(), "DEPOSIT"),
                new Transactions(2, 102, 2000.0, new Date(), "WITHDRAW"));

        TransactionDAO fakeDAO = new TransactionDAO() {

            @Override
            public List<Transactions> getAllTransactions() {
                return transactions;
            }

            @Override
            public Transactions getTransactionById(int transactionId) {
                return null;
            }

            @Override
            public int addTransaction(Transactions transaction) {
                return -1;
            }

            @Override
            public void updateTransaction(Transactions transaction) {
            }

            @Override
            public void deleteTransaction(int transactionId) {
            }
        };

        TransactionServiceImpl service = new TransactionServiceImpl(fakeDAO);

        List<Transactions> result = service.getAllTransactions();

        assertSame(transactions, result);
        assertEquals(2, result.size());
    }

    @Test
    void testGetTransactionByIdThroughDAO_Day8() throws Exception {

        Transactions expectedTransaction = new Transactions(
                101,
                201,
                5000.0,
                new Date(),
                "DEPOSIT");

        TransactionDAO fakeDAO = new TransactionDAO() {

            @Override
            public Transactions getTransactionById(int transactionId) {
                return expectedTransaction;
            }

            @Override
            public List<Transactions> getAllTransactions() {
                return List.of();
            }

            @Override
            public int addTransaction(Transactions transaction) {
                return -1;
            }

            @Override
            public void updateTransaction(Transactions transaction) {
            }

            @Override
            public void deleteTransaction(int transactionId) {
            }
        };

        TransactionServiceImpl service = new TransactionServiceImpl(fakeDAO);

        Transactions result = service.getTransactionById(101);

        assertSame(expectedTransaction, result);
        assertEquals(101, result.getTransactionId());
        assertEquals(201, result.getAccountId());
        assertEquals(5000.0, result.getAmount());
        assertEquals("DEPOSIT", result.getTransactionType());
    }

    @Test
    void testAddTransactionThroughDAO_Day8() throws Exception {

        TransactionDAO fakeDAO = new TransactionDAO() {

            @Override
            public int addTransaction(Transactions transaction) {
                transaction.setTransactionId(301);
                return 301;
            }

            @Override
            public List<Transactions> getAllTransactions() {
                return List.of();
            }

            @Override
            public Transactions getTransactionById(int transactionId) {
                return null;
            }

            @Override
            public void updateTransaction(Transactions transaction) {
            }

            @Override
            public void deleteTransaction(int transactionId) {
            }
        };

        TransactionServiceImpl service = new TransactionServiceImpl(fakeDAO);

        Transactions transaction = new Transactions(
                0,
                201,
                10000.0,
                new Date(),
                "DEPOSIT");

        int result = service.addTransaction(transaction);

        assertEquals(301, result);
        assertEquals(301, transaction.getTransactionId());
    }

    @Test
    void testDeleteTransactionThroughDAO_Day8() throws Exception {

        final int[] deletedId = { 0 };

        TransactionDAO fakeDAO = new TransactionDAO() {

            @Override
            public void deleteTransaction(int transactionId) {
                deletedId[0] = transactionId;
            }

            @Override
            public List<Transactions> getAllTransactions() {
                return List.of();
            }

            @Override
            public Transactions getTransactionById(int transactionId) {
                return null;
            }

            @Override
            public int addTransaction(Transactions transaction) {
                return -1;
            }

            @Override
            public void updateTransaction(Transactions transaction) {
            }
        };

        TransactionServiceImpl service = new TransactionServiceImpl(fakeDAO);

        service.deleteTransaction(501);

        assertEquals(501, deletedId[0]);
    }
}