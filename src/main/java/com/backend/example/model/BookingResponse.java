package com.backend.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookingResponse {
    private String customerName;
    private String restaurantName;
    private String date;
    private String time;
    private int guests;
}
