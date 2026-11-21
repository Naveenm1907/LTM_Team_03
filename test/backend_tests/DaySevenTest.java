package com.edutech.progressive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.edutech.progressive.dao.AccountDAO;
import com.edutech.progressive.entity.Accounts;
import com.edutech.progressive.service.impl.AccountServiceImpl;

public class DaySevenTest {

    @Test
    void testGetAllAccountsFromDAO_Day7() throws Exception {

        List<Accounts> accounts = Arrays.asList(
                new Accounts(101, 1, 5000.0),
                new Accounts(102, 2, 10000.0));

        AccountDAO fakeDAO = new AccountDAO() {

            @Override
            public List<Accounts> getAllAccounts() {
                return accounts;
            }

            @Override
            public Accounts getAccountById(int accountId) {
                return null;
            }

            @Override
            public int addAccount(Accounts account) {
                return -1;
            }

            @Override
            public void updateAccount(Accounts account) {
            }

            @Override
            public void deleteAccount(int accountId) {
            }
        };

        AccountServiceImpl service = new AccountServiceImpl(fakeDAO);

        List<Accounts> result = service.getAllAccounts();

        assertSame(accounts, result);
        assertEquals(2, result.size());
    }

    @Test
    void testAddAccountThroughDAO_Day7() throws Exception {

        AccountDAO fakeDAO = new AccountDAO() {

            @Override
            public int addAccount(Accounts account) {
                account.setAccountId(201);
                return 201;
            }

            @Override
            public List<Accounts> getAllAccounts() {
                return List.of();
            }

            @Override
            public Accounts getAccountById(int accountId) {
                return null;
            }

            @Override
            public void updateAccount(Accounts account) {
            }

            @Override
            public void deleteAccount(int accountId) {
            }
        };

        AccountServiceImpl service = new AccountServiceImpl(fakeDAO);

        Accounts account = new Accounts(0, 10, 25000.0);

        int result = service.addAccount(account);

        assertEquals(201, result);
        assertEquals(201, account.getAccountId());
    }

    @Test
    void testGetAccountByIdThroughDAO_Day7() throws Exception {

        Accounts expectedAccount = new Accounts(301, 5, 45000.0);

        AccountDAO fakeDAO = new AccountDAO() {

            @Override
            public Accounts getAccountById(int accountId) {
                return expectedAccount;
            }

            @Override
            public List<Accounts> getAllAccounts() {
                return List.of();
            }

            @Override
            public int addAccount(Accounts account) {
                return -1;
            }

            @Override
            public void updateAccount(Accounts account) {
            }

            @Override
            public void deleteAccount(int accountId) {
            }
        };

        AccountServiceImpl service = new AccountServiceImpl(fakeDAO);

        Accounts result = service.getAccountById(301);

        assertSame(expectedAccount, result);
        assertEquals(301, result.getAccountId());
        assertEquals(45000.0, result.getBalance());
    }

    @Test
    void testGetAllAccountsSortedByBalance_Day7() throws Exception {

        List<Accounts> accounts = Arrays.asList(
                new Accounts(101, 1, 30000.0),
                new Accounts(102, 2, 10000.0),
                new Accounts(103, 3, 20000.0));

        AccountDAO fakeDAO = new AccountDAO() {

            @Override
            public List<Accounts> getAllAccounts() {
                return accounts;
            }

            @Override
            public Accounts getAccountById(int accountId) {
                return null;
            }

            @Override
            public int addAccount(Accounts account) {
                return -1;
            }

            @Override
            public void updateAccount(Accounts account) {
            }

            @Override
            public void deleteAccount(int accountId) {
            }
        };

        AccountServiceImpl service = new AccountServiceImpl(fakeDAO);

        List<Accounts> result = service.getAllAccountsSortedByBalance();

        assertEquals(10000.0, result.get(0).getBalance());
        assertEquals(20000.0, result.get(1).getBalance());
        assertEquals(30000.0, result.get(2).getBalance());
    }
}