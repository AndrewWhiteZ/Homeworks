package com.example.homeworks.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    // Field Injection
    @Autowired
    @Qualifier("outrightOrderService")
    private CustomerOrderService customerOrderService;

    public void createOrder() {
        customerOrderService.createOrder();
    }

    public void cancelOrder() {
        customerOrderService.cancelOrder();
    }
}
