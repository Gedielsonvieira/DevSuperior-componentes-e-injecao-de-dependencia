package com.desafio;

import com.desafio.entities.Order;
import com.desafio.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    private final OrderService orderService;

    public DesafioApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1034, 150.00, 20.0);
        System.out.println("Pedido código: " + order.getCode());
        System.out.println("Valor total: " + orderService.total(order));
    }

}
