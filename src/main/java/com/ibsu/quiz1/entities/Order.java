package com.ibsu.quiz1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long id;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    private OrderStatus status;
}
