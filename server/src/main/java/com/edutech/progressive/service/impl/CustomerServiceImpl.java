package com.edutech.progressive.service.impl;
import com.edutech.progressive.dao.*;
import com.edutech.progressive.entity.*;
import java.util.List;
import java.util.ArrayList;
import java.sql.*;
public class CustomerServiceImpl {
    private CustomerDAO customerDAO;
    private static List<Customers> customersList = new ArrayList<>();
    public CustomerServiceImpl(CustomerDAO customerDAO){
        this.customerDAO=customerDAO;
    }
    public List<Customers> getAllCustomers() throws SQLException{
        customersList = customerDAO.getAllCustomers();
        return customersList;
    }
    public int addCustomer(Customers customers)throws SQLException{
        return customerDAO.addCustomer(customers);
    }
    public List<Customers> getAllCustomersSortedByName() throws SQLException {
        customersList=customerDAO.getAllCustomers();
        customersList.sort((c1,c2) -> c1.getName().compareTo(c2.getName()));
        return customersList;
    }
    public void updateCustomer(Customers customers)throws SQLException {
        customerDAO.updateCustomer(customers);

    }
    public void deleteCustomer(Customers customers)throws SQLException {
        customerDAO.deleteCustomer(customers.getCustomerId());

    }
    public Customers getCustomerById(int customerId) throws SQLException {
        return customerDAO.getCustomerById(customerId);
    }


}