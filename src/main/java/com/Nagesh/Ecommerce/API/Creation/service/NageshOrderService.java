package com.Nagesh.Ecommerce.API.Creation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.NoSuchElementException;

@Service
public class NageshOrderService {

    @Autowired
    com.Nagesh1.Ecommerce.API.Creation.repo.NageshOrderRepo nageshOrderRepo;

    public com.Nagesh.Ecommerce.API.Creation.model.NageshOrder createOrder(com.Nagesh.Ecommerce.API.Creation.model.NageshOrder order) {
        return anishOrderRepo.save(order);
    }

    public com.Nagesh.Ecommerce.API.Creation.model.NageshOrder getOrderById(Integer orderId) {
        return nageshOrderRepo.findById(orderId).orElseThrow(() ->
                new NoSuchElementException("Order not found"));
    }
}
