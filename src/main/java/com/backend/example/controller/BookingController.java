package com.backend.example.controller;

import com.backend.example.model.BookingRequest;
import com.backend.example.model.BookingResponse;
import com.backend.example.service.BookingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
@RequiredArgsConstructor
@Slf4j
public class BookingController {
    private final BookingService bookingService;

    @PostMapping(name = "/create")
    public BookingResponse createBooking(@RequestBody BookingRequest request) {
        BookingResponse savedBooking = bookingService.createBooking(request);
        log.info("Booking created for {} at restaurantId {}",
                savedBooking.getCustomerName(), request.getRestaurantId());
        return savedBooking;

    }
    @DeleteMapping("/delete/{id}")
    public String deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
        log.info("Booking with id {} deleted", id);
        return "Booking deleted successfully";
    }

    }

