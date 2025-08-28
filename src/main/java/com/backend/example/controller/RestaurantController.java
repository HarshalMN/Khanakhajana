package com.backend.example.controller;

import com.backend.example.entity.RestaurantDetails;
import com.backend.example.model.RestaurantResponse;
import com.backend.example.repository.RestaurantRepository;
import com.backend.example.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/restaurants")
public class RestaurantController {

    private final RestaurantService service;

    @GetMapping
    public List<RestaurantDetails> getAllRestaurants() {
        return service.getAllRestaurants();
    }

}
