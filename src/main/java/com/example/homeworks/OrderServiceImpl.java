package com.example.homeworks;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService {
    private HashMap<Integer, Date> ordersMap = new HashMap<>();
    @Override
    public void createOrder() {
        log.info("Order created!");
        ordersMap.put(1000, Calendar.getInstance().getTime());
    }

    @Override
    public void deleteOrder() {
        log.info("Order deleted!");
        ordersMap.remove(1000);
    }
}
