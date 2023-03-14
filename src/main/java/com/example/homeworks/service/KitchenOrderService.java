package com.example.homeworks.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Log4j2
public class KitchenOrderService {
    private final KitchenShift shift;

    // Constructor Injection
    KitchenOrderService(KitchenShift shift) {
        this.shift = shift;
    }

    public void acceptOrder() {
        shift.startShift();
        log.info("Kitchen: Order Accepted");
    }
    public void declineOrder() {
        log.warn("Kitchen: Order Declined");
        shift.endShift();
    }
    public void completeOrder() {
        shift.endShift();
        log.info("Kitchen: Order Completed");
    }

    @PostConstruct
    private void init() {
        log.info("+-- Kitchen: Order was initialized! --+");
    }

    @PreDestroy
    private void destroy() {
        log.info("+-- Kitchen: Order was destroyed! --+");
    }
}
