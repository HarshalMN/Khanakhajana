package com.backend.example.repository;

import com.backend.example.entity.RestaurantDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<RestaurantDetails, Long> {
    @Query(value = "SELECT * FROM restaurants", nativeQuery = true)
    List<RestaurantDetails> fetchAllRestaurants();
}

