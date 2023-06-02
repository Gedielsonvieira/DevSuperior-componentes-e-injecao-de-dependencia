package com.desafio.services;

import com.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        if (order.getBasicValue() < 100) {
            return 20.00;
        } else if (order.getBasicValue() >= 100 & order.getBasicValue() <= 200) {
            return 12.00;
        } else {
            return 0.0;
        }

    }
}
