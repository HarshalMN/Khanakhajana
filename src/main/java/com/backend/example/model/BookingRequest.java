package com.backend.example.model;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequest {
    private String customerName;
    private Long restaurantId;
    private String date;
    private String time;
    private int guests;
}
