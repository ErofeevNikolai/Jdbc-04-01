package ru.netology.jdbclesson04.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "date")
    private Timestamp data;


    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customer_id;

    @Column(nullable = false)
    private String product_name;

    @Column(nullable = false)
    private BigDecimal amount;

}