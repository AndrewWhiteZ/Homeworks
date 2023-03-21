package com.example.homeworks;

import lombok.extern.log4j.Log4j2;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/orders")
@Log4j2
public class OrderController {
    private final OrderServiceImpl orderService = new OrderServiceImpl();

    /**
     * Возвращает список заголовков запроса
     * */
    @GetMapping("/")
    private ArrayList<String> getOrdersList(@RequestHeader MultiValueMap<String, String> headers) {
        ArrayList<String> headersList = new ArrayList<>();
        headers.forEach((header, value) -> headersList.add(header + ": " + String.join("; ", value)));
        return headersList;
    }

    @GetMapping("/create")
    private void createOrder() {
        orderService.createOrder();
    }

    @DeleteMapping("/delete")
    private void deleteOrder() {
        orderService.deleteOrder();
    }
}
