package com.backend.example.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bookings")
public class BookingsDetails {
    @Id
    @SequenceGenerator(name="booking_id_seq", sequenceName = "booking_id_seq",allocationSize = 1,initialValue = 15)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "booking_id_seq")
    private Integer booking_id;

    private Integer rest_id;
    private Integer user_id;
    private Integer table_id;
    private String open_time;
    private String close_time;
    private String status;
    private Integer people;

}
