package com.javatechie.aws.cicd.example;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {


    public List<Order> getOrders() {
        return Stream.of(
                new Order(2, "Unicorn saddle", 1, 30000),
                new Order(1, "Unicorn horseshoes 4 pieces", 4, 2000),
                new Order(3, "Unicorn blinkers 2 pieces", 1, 150000),
                new Order(4, "Unicorn winter jacket", 1, 1799))
                .collect(Collectors.toList());
    }
}
