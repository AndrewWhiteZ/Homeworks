package com.example.homeworks.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import java.util.Calendar;

@Service
@Log4j2
public class KitchenShift {
    private final Calendar calendar = Calendar.getInstance();

    public void startShift() {
        log.info("New shift started at: " + calendar.getTime());
    }

    public void endShift() {
        log.info("Current shift ended at: " + calendar.getTime());
    }

}
