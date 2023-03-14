package com.example.homeworks.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Log4j2
public class RemoteOrderService implements CustomerOrderService {
    // Field Injection
    @Autowired
    private KitchenOrderService kitchenOrderService;

    public void createOrder() {
        kitchenOrderService.acceptOrder();
        log.info("Remote order was created successfully");
    }

    public void cancelOrder() {
        kitchenOrderService.declineOrder();
        log.info("Remote order was cancelled successfully");
    }

    @PostConstruct
    private void init() { log.info("+-- Remote order was initialized! --+"); }

    @PreDestroy
    private void destroy() {
        log.info("+-- Remote order was destroyed! --+");
    }
}