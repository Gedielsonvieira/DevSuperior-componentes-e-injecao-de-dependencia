package com.desafio;

import com.desafio.entities.Order;
import com.desafio.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

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
        Order order1 = new Order(1034, 150.00, 20.0);
        Order order2 = new Order(2282, 800.00, 10.0);
        Order order3 = new Order(1309, 95.90, 0.0);

        Locale.setDefault(Locale.US);

        System.out.println("Pedido código " + order1.getCode());
        System.out.printf("Valor total: R$ %.2f\n\n", orderService.total(order1));

        System.out.println("Pedido código " + order2.getCode());
        System.out.printf("Valor total: R$ %.2f\n\n", orderService.total(order2));

        System.out.println("Pedido código " + order3.getCode());
        System.out.printf("Valor total: R$ %.2f", orderService.total(order3));
    }

}
