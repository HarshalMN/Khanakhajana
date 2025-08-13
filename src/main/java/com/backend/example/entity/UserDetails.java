package com.backend.example.entity;
import java.math.BigInteger;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {
    @Id
    private Integer user_id;
    private String name;
    private String email;
    private String password;
    private BigInteger phone_number;
}
