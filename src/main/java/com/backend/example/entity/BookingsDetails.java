package com.backend.example.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookings")
public class BookingsDetails {
    @Id
    private Integer booking_id;
    private Integer rest_id;   // FK to restaurant
    private Integer user_id;   // FK to user
    private Integer table_id;  // FK to tables
    private Date open_time;
    private Date close_time;
    private String status;     // enum values: pending, confirm, cancelled
    private Integer people;

}
