package com.backend.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/restaurant")
public class RestuarantController {
    @GetMapping("/list")
    public List<Map<String, Object>> getRestaurants() {
        return Arrays.asList(
                Map.of("id", 1, "name", "Spicy Tandoor", "location", "Mumbai", "rating", 4.5),
                Map.of("id", 2, "name", "Pasta Paradise", "location", "Pune", "rating", 4.2),
                Map.of("id", 3, "name", "Burger Hub", "location", "Delhi", "rating", 4.0)
        );
    }
}
