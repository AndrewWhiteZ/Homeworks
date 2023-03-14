package com.example.homeworks.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class RemoteOrderService implements CustomerOrderService {
    private final Logger logger = LoggerFactory.getLogger(RemoteOrderService.class);

    // Field Injection
    @Autowired
    private KitchenOrderService kitchenOrderService;

    public void createOrder() {
        kitchenOrderService.acceptOrder();
        logger.info("Remote order was created successfully");
    }

    public void cancelOrder() {
        kitchenOrderService.declineOrder();
        logger.info("Remote order was cancelled successfully");
    }

    @PostConstruct
    private void init() {
        logger.info("+-- Remote order was initialized! --+");
    }

    @PreDestroy
    private void destroy() {
        logger.info("+-- Remote order was destroyed! --+");
    }
}