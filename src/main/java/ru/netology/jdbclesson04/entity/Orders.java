package ru.netology.jdbclesson04.entity;


import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

@Entity
public class Orders {

    @Id
    @GeneratedValue
    private int id;


    @Column(nullable = false, length = 100)
    private Date data;

    @ManyToOne
    @Column(nullable = false)
    private Customers customer_id;

    @Column(nullable = false)
    private String product_name;

    @Column(nullable = false)
    private String amount;

}