package com.backend.example.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="restaurant")
public class RestaurantDetails {
    @Id
    @SequenceGenerator(name = "rest_seq", sequenceName = "rest_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rest_seq")
    @Column(name = "restaurant_id")
    private Long id;
    private String name;
    private String cuisine;
    private double rating;
}
