package com.backend.example.entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "user_details")
public class UserDetails {
    @Id
    @SequenceGenerator(name = "user_seq", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @Column(name = "user_id")
    private Long id;


    private String name;
    private String email;
    private String password;
    private String role;
}
