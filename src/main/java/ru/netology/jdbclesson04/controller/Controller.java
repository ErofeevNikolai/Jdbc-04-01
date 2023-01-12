package ru.netology.jdbclesson04.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.netology.jdbclesson04.entity.Customers;
import ru.netology.jdbclesson04.repository.Repo;

@AllArgsConstructor
@RestController
public class Controller {
    Repo repo;

    @GetMapping("/products/fetch-product")
    private ResponseEntity<String> get(@RequestParam("name") String name) {
        return new ResponseEntity<>(repo.getProductName(name),HttpStatus.OK);
    }
}
