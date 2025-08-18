package com.backend.example.service;

import com.backend.example.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {
    private BookingRepository bookingRepository;
    BookingService(BookingRepository bookingRepository){
        this.bookingRepository=bookingRepository;
    }
}
