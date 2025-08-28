package com.backend.example.model;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequest {
    private String customerName;   // username
    private Long restaurantId;  // restaurantId instead of name
    private String date;
    private String time;
    private int guests;
}
