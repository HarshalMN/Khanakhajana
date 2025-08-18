package com.backend.example.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="restaurant")
public class RestaurantDetails {
    @Id
    private Integer rest_id;
    private String name;
    private String address;
    private String open_time;
    private String close_time;
    private Integer no_of_tables;
}
