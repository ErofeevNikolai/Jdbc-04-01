package ru.netology.jdbclesson04.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 100)
    private String surname;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false, length = 225)
    private String phone_number;
}
