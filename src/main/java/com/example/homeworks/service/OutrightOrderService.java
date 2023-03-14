package com.example.homeworks.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Log4j2
public class OutrightOrderService implements CustomerOrderService {
    private KitchenOrderService kitchenOrderService;

    // Setter Injection
    @Autowired
    public void setKitchenOrderService(KitchenOrderService kitchenOrderService) {
        this.kitchenOrderService = kitchenOrderService;
    }

    public void createOrder() {
        kitchenOrderService.acceptOrder();
        log.info("Outright order was successfully created");
    }

    public void cancelOrder() {
        kitchenOrderService.declineOrder();
        log.info("Outright order was successfully cancelled");
    }

    @PostConstruct
    private void init() {
        log.info("+-- Outright order was initialized! --+");
    }

    @PreDestroy
    private void destroy() {
        log.info("+-- Outright order was destroyed! --+");
    }
}