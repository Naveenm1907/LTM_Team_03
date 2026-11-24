package com.edutech.progressive.dto;

public class CustomerAccountInfo {

    private int customerId;
    private String customerName;
    private String email;
    private int accountId;
    private double balance;
    CustomerAccountInfo(int customerId,String customerName,String email,int accountId,double balance){
        this.customerId=customerId;
        this.customerName=customerName;
        this.email=email;
        this.accountId=accountId;
        this.balance=balance;
    }
    public int getCustomerId(){return customerId;}
    public String getCustomerName(){return customerName;}
    public String getEmail(){return email;}
    public int getAccountId(){return accountId;}
    public double getBalance(){return balance;}
    public void setCustomerId(int customerId){this.customerId=customerId;}
    public void setCustomerName(String customerName){this.customerName=customerName;}
    public void setEmail(String email){this.email=email;}
    public void setAccountId(int accountId){this.accountId=accountId;}
    public void setBalance(double balance){this.balance=balance;}
    @Override 
    public String toString(){
        return customerId+customerName+email+accountId+balance;
    }


}
