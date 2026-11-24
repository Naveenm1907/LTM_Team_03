package com.edutech.progressive.dao;
import java.util.List;
import java.util.ArrayList;
import com.edutech.progressive.entity.*;
import java.sql.*;
public class AccountDAOImpl {
    private List<Accounts> accountsList = new ArrayList<Accounts>();
    public List<Accounts> getAllAccouts() throws SQLException {
        return null;
    }
    public List<Accounts> getAllAccoutsByCusomter(int customer_id) throws SQLException{
        return null;
    }
    public Accounts getAccountsById(int accountId) throws SQLException {
        return null;
    }
    public int AddAccount(Accounts accounts) throws SQLException{
        return -1;
    }
    public void updateAccount(Accounts accounts)throws SQLException{
    }
    public void deleteAccount(Accounts accounts){
    }

}
