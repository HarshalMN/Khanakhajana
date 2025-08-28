package com.backend.example.entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "bookings")
public class BookingsDetails {
    @Id
    @SequenceGenerator(name="booking_id_seq", sequenceName = "booking_id_seq",allocationSize = 1,initialValue = 15)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "booking_id_seq")
    @Column(name = "booking_id")
    private Long id;

    private String customerName;
    private String Date;
    private String time;
    private int guests;

    @ManyToOne
    @JoinColumn(name = "restaurant_id",nullable = false)
    private RestaurantDetails restaurant;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserDetails user;
}
