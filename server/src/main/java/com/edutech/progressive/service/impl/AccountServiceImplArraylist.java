package com.edutech.progressive.service.impl;
import com.edutech.progressive.entity.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;;
public class AccountServiceImplArraylist {
    private static List<Accounts> accountList = new ArrayList<>();
    public List<Accounts> getAllAccounts(){
        return accountList;
    }
    public int addAccount(Accounts accounts){
        accountList.add(accounts);
        return accountList.size();
    }
    public List<Accounts> getAllAccountsSortedByBalance(){
        Collections.sort(accountList);
        return accountList;
    }
    public void emptyArrayList(){
        accountList = new ArrayList<>();
    }
}