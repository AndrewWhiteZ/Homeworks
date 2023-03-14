package com.example.homeworks.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final OutrightOrderService outrightOrderService;
    private final RemoteOrderService remoteOrderService;

    CustomerService(OutrightOrderService outrightOrderService, RemoteOrderService remoteOrderService) {
        this.outrightOrderService = outrightOrderService;
        this.remoteOrderService = remoteOrderService;
    }

    public void createRemoteOrder() {
        remoteOrderService.createOrder();
    }

    public void createOutrightOrder() {
        outrightOrderService.createOrder();
    }

    public void cancelRemoteOrder() {
        remoteOrderService.cancelOrder();
    }

    public void cancelOutrightOrder() {
        outrightOrderService.cancelOrder();
    }
}
