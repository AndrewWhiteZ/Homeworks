package com.example.homeworks.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class KitchenShift {
    private final Logger logger = LoggerFactory.getLogger(KitchenOrderService.class);
    private final Calendar calendar = Calendar.getInstance();

    public void startShift() {
        logger.info("New shift started at: " + calendar.getTime());
    }

    public void endShift() {
        logger.info("Current shift ended at: " + calendar.getTime());
    }
}
