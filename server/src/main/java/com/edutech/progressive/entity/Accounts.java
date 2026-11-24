package com.edutech.progressive.entity;

public class Accounts implements Comparable<Accounts>{
    int accountId;
    int customerId;
    double balance;
    public Accounts(){}
    public Accounts(int accountId,int customerId,double balance){
        this.customerId=customerId;
        this.accountId=accountId;
        this.balance=balance;
    }
    @Override 
    public int compareTo(Accounts otherAccounts){
        return Double.compare(this.balance, otherAccounts.balance);
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