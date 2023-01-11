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

    @GetMapping("/persons/by-city")
    private ResponseEntity<String> get(@RequestParam("city") String city) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/persons")
    private ResponseEntity putt(@RequestBody Customers presons){
        repo.addPersons(presons);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
