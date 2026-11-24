package com.edutech.progressive.service.impl;
import com.edutech.progressive.entity.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class CustomerServiceImplArraylist {
    private static List<Customers> customersList= new ArrayList<>();
    public List<Customers> getAllAccounts(){
        return customersList;
    }
    public int addCustomer(Customers customers){
        customersList.add(customers);
        return customersList.size();
    }
    public List<Customers> getAllCustomersSortedByName(){
        Collections.sort(customersList);
        return customersList;
    }
    public void emptyArrayList(){
        customersList=new ArrayList<>();
    }
}