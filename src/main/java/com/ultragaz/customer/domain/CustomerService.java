package com.ultragaz.customer.domain;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    public List<Customer> getCustomer(){
        List<Customer> cust = new ArrayList<>();
        cust.add(new Customer(1L, 1,  "1",  "Fernando"));
        cust.add(new Customer(2L, 2,  "2",  "Henrique"));
        cust.add(new Customer(3L, 3,  "3",  "Cristiano"));
        cust.add(new Customer(4L, 4,  "4",  "Matheus"));

        return cust;
    }
}
