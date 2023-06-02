package com.desafio.services;

import com.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        return shippingService.shipment(order) + (order.getBasicValue() - order.getBasicValue() * (order.getDiscount() / 100));
    }
}
