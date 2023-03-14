package com.example.homeworks.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class KitchenOrderService {
    private final Logger logger = LoggerFactory.getLogger(KitchenOrderService.class);
    private final KitchenShift shift;

    // Constructor Injection
    KitchenOrderService(KitchenShift shift) {
        this.shift = shift;
    }

    public void acceptOrder() {
        shift.startShift();
        logger.info("Kitchen: Order Accepted");
    }
    public void declineOrder() {
        logger.warn("Kitchen: Order Declined");
        shift.endShift();
    }
    public void completeOrder() {
        shift.endShift();
        logger.info("Kitchen: Order Completed");
    }

    @PostConstruct
    private void init() {
        logger.info("+-- Kitchen: Order was initialized! --+");
    }

    @PreDestroy
    private void destroy() {
        logger.info("+-- Kitchen: Order was destroyed! --+");
    }
}
