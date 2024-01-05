package com.sinanyagsagan.assignment.service;

import com.sinanyagsagan.assignment.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private final List<Customer> customerList;
    public CustomerService(){
        this.customerList = new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        customerList.add(customer);
    }
    public List<Customer> getAllCustomers(){
        return customerList;
    }
}
