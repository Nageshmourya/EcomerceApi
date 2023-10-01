package com.Nagesh.Ecommerce.API.Creation.controller;

import com.Nagesh1.Ecommerce.API.Creation.model.NageshOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class NageshOrderController {

    @Autowired
    NageshOrderService nageshOrderService;

    @PostMapping
    public NageshOrder createOrder(@RequestBody NageshOrder order) {
        return nageshOrderService.createOrder(order);
    }

    @GetMapping("/{orderId}")
    public  NageshOrder getOrderById(@PathVariable Integer orderId){
        return nageshOrderService.getOrderById(orderId);
    }
}
