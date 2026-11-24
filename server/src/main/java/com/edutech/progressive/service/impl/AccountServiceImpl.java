package com.edutech.progressive.service.impl;
import com.edutech.progressive.entity.*;
import com.edutech.progressive.dao.*;
import java.sql.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class AccountServiceImpl  {
    private AccountDAO accountDAO;
    private static List<Accounts> accountsList = new ArrayList<>();
    public AccountServiceImpl(AccountDAO accountDAO){
        this.accountDAO=accountDAO;
    }
    public List<Accounts> getAllAccounts() throws SQLException{
        return accountDAO.getAllAccounts();
    }
    public int addAccount(Accounts accounts)throws SQLException{
        return accountDAO.addAccount(accounts);
    }
    public List<Accounts> getAllAccountsSortedByBalance(){
        List<Accounts> accountsList =   accountDAO.getAllAccounts();
        Collections.sort(accountsList);
        return accountsList;

    }
    public List<Accounts> getAccountByUser(int userId)throws SQLException{
        return accountsList;
    }
    public Accounts getAccountById(int accountId){
        return accountDAO.getAccountById(accountId);
    }
    public void updateAccount(Accounts accounts)throws SQLException{
         accountDAO.updateAccount(accounts);

    }
    public void deleteAccount(int accountId)throws SQLException{
        accountDAO.deleteAccount(accountId);
    }

}