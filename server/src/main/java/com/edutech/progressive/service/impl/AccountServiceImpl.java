package com.edutech.progressive.service.impl;
import com.edutech.progressive.entity.*;
import com.edutech.progressive.dao.*;
import java.util.List;
public class AccountServiceImpl  {
    private AccountDAO accountDAO;
    public AccountServiceImpl(AccountDAOImpl accountDAO){
    }
    public List<Accounts> getAllAccouts(){
        return null;
    }
    public int AddAccount(Accounts accounts){
        return -1;
    }
    public List<Accounts> getAllAccountsSortedByBalance(){
        return null;
    }
    public List<Accounts> getAccountByUser(int userId){
        return null;
    }
    public Accounts getAccountId(int accountId){
        return null;
    }
    public void updateAccount(Accounts accounts){

    }
    public void deleteAccount(Accounts accounts){
    }

}