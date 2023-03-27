package com.example.homeworks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderServiceImpl orderService;

    @Autowired
    public OrderController(OrderServiceImpl orderService) {
        this.orderService = orderService;
    }

    /**
     * Возвращает список заголовков запроса
     * */
    @GetMapping()
    private ArrayList<String> getOrdersList(@RequestHeader MultiValueMap<String, String> headers) {
        ArrayList<String> headersList = new ArrayList<>();
        headers.forEach((header, value) -> headersList.add(header + ": " + String.join("; ", value)));
        return headersList;
    }

    @PostMapping()
    private void createOrder() {
        orderService.createOrder();
    }

    @DeleteMapping()
    private void deleteOrder() {
        orderService.deleteOrder();
    }
}
