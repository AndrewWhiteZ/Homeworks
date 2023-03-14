package com.example.homeworks.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class OutrightOrderService implements CustomerOrderService {
    private final Logger logger = LoggerFactory.getLogger(OutrightOrderService.class);
    private KitchenOrderService kitchenOrderService;

    // Setter Injection
    @Autowired
    public void setKitchenOrderService(KitchenOrderService kitchenOrderService) {
        this.kitchenOrderService = kitchenOrderService;
    }

    public void createOrder() {
        kitchenOrderService.acceptOrder();
        logger.info("Outright order was successfully created");
    }

    public void cancelOrder() {
        kitchenOrderService.declineOrder();
        logger.info("Outright order was successfully cancelled");
    }

    @PostConstruct
    private void init() {
        logger.info("+-- Outright order was initialized! --+");
    }

    @PreDestroy
    private
    void destroy() {
        logger.info("+-- Outright order was destroyed! --+");
    }
}