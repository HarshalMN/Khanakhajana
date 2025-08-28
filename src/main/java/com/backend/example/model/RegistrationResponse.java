package com.backend.example.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationResponse {
    private String name;
    private String email;
    private String role;
}
