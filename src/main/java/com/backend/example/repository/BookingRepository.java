package com.backend.example.repository;

import com.backend.example.entity.BookingsDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingsDetails, Long> {
}
