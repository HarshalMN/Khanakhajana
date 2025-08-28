package com.backend.example.service;

import com.backend.example.entity.BookingsDetails;
import com.backend.example.entity.RestaurantDetails;
import com.backend.example.entity.UserDetails;
import com.backend.example.model.BookingRequest;
import com.backend.example.model.BookingResponse;
import com.backend.example.repository.BookingRepository;
import com.backend.example.repository.RestaurantRepository;
import com.backend.example.repository.UserDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingRepository bookingRepo;
    private final UserDetailsRepository userRepo;
    private final RestaurantRepository restaurantRepo;

    public BookingResponse createBooking(BookingRequest dto) {
        UserDetails user = userRepo.findByName(dto.getCustomerName())
                .orElseThrow(() -> new RuntimeException("User not found"));

        RestaurantDetails restaurant = restaurantRepo.findById(dto.getRestaurantId())
                .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        BookingsDetails booking = new BookingsDetails();
        booking.setUser(user);
        booking.setCustomerName(user.getName());
        booking.setRestaurant(restaurant);
        booking.setDate(dto.getDate());
        booking.setTime(dto.getTime());
        booking.setGuests(dto.getGuests());

        BookingsDetails saved = bookingRepo.save(booking);

        return new BookingResponse(
                user.getName(),
                restaurant.getName(),
                saved.getDate(),
                saved.getTime(),
                saved.getGuests()
        );

    }
    public void deleteBooking(Long id) {
        if (!bookingRepo.existsById(id)) {
            throw new RuntimeException("Booking not found with id " + id);
        }
        bookingRepo.deleteById(id);
    }


}
