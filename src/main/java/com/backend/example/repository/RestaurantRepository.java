package com.backend.example.repository;

import com.backend.example.entity.RestaurantDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantDetails, Long> {
}
