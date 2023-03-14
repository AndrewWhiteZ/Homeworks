package com.example.homeworks;

import com.example.homeworks.service.KitchenOrderService;
import com.example.homeworks.service.OutrightOrderService;
import com.example.homeworks.service.RemoteOrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HomeworksApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(HomeworksApplication.class, args);
        KitchenOrderService kitchenOrderService = context.getBean(KitchenOrderService.class);
        RemoteOrderService remoteOrderService = context.getBean(RemoteOrderService.class);
        OutrightOrderService outrightOrderService = context.getBean(OutrightOrderService.class);

        remoteOrderService.createOrder();
        remoteOrderService.cancelOrder();

        outrightOrderService.createOrder();
        outrightOrderService.cancelOrder();

        kitchenOrderService.completeOrder();
    }
}
