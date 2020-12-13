package com.ultragaz.customer.api;

import com.ultragaz.customer.domain.Customer;
import com.ultragaz.customer.domain.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    private CustomerService cust = new CustomerService();

    @GetMapping("")
    private List<Customer> getCustomer(){
        return cust.getCustomer();
    }

}
