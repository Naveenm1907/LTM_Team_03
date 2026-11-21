package com.edutech.progressive.entity;

public class Accounts extends Customers{
    int accountId;
    int customerId;
    double balance;
    public Accounts(){}
    public Accounts(int accountId,int customerId,double balance){
        this.customerId=customerId;
        this.accountId=accountId;
        this.balance=balance;
    }
    public int getCustomerId(){
        return customerId;
    }
    public void setCustomerId(int customerId){
        this.customerId=customerId;
    }
        public int getAccountId(){
        return accountId;
    }
    public void setAccountId(int accountId){
        this.accountId=accountId;
    }    
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }

}