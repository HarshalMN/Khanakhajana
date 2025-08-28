package com.backend.example.service;

import com.backend.example.entity.RestaurantDetails;
import com.backend.example.repository.RestaurantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@RequiredArgsConstructor
public class RestaurantService {
    private final RestaurantRepository repo;

    public List<RestaurantDetails> getAllRestaurants() {
        return repo.findAll();
    }
    }


