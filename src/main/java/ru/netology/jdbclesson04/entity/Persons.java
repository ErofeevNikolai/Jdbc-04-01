package ru.netology.jdbclesson04.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Data
@Builder
@Entity
@NoArgsConstructor
public class Persons {

    @EmbeddedId
    private Fio fio;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false, length = 225)
    private String phone_number;

    @Column(nullable = false, length = 225)
    private String city_of_living;

    public Persons(Fio fio, Integer age, String phone_number, String city_of_living) {
        this.fio = fio;
        this.age = age;
        this.phone_number = phone_number;
        this.city_of_living = city_of_living;
    }
}
