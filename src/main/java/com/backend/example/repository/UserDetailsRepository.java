package com.backend.example.repository;

import com.backend.example.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long> {
    Optional<UserDetails> findByName(String name);
    boolean existsByName(String name);

}
