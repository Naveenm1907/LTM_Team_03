package com.edutech.progressive.service.impl;
import com.edutech.progressive.dao.*;
import com.edutech.progressive.entity.*;
import java.util.List;
public class CustomerServiceImpl {
    private CustomerDAO customerDAO;
    public CustomerServiceImpl(CustomerDAOImpl customerDAO){
    }
    public List<Customers> getAllCustomers(){
        return null;
    }
    public int addCustomer(Customers customers){
        return -1;
    }
    public List<Customers> getAllCustomersSortedByName(){
        return null;
    }
    public void updateCustomer(Customers customers){

    }
    public void deleteCustomer(Customers customers){

    }
    public Customers getCustomerById(int customerId){
        return null;
    }


}