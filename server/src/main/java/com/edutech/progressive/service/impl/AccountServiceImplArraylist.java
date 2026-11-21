package com.edutech.progressive.service.impl;
import com.edutech.progressive.entity.*;
import java.util.List;
import java.util.ArrayList;
public class AccountServiceImplArraylist {
    private static List<Accounts> accountList = new ArrayList<>();
    public List<Accounts> getAllAccounts(){
        return accountList;
    }
    public int addAccount(Accounts accounts){
        return accountList.size();
    }
    public List<Accounts> getAllAccountsSortedByBalance(){
        return accountList;
    }
    public void emptyArrayList(){
    }
}