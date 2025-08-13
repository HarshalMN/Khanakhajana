package com.backend.example.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="restaurant")
public class RestaurantDetails {
    @Id
    private Integer rest_id;
    private String name;
    private String address;
    private String cuisine;
    private Date open_time;
    private Date close_time;
    private Integer no_of_tables;
}
