package com.backend.example.service;

import com.backend.example.entity.RestaurantDetails;
import com.backend.example.model.RestaurantResponse;
import com.backend.example.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RestaurantService {
    private final RestaurantRepository repo;

    public List<RestaurantDetails> getAllRestaurants() {
        return repo.findAll();
    }
    }


