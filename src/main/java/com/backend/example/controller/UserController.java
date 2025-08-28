package com.backend.example.controller;

import com.backend.example.entity.UserDetails;
import com.backend.example.model.RegistrationRequest;
import com.backend.example.model.RegistrationResponse;
import com.backend.example.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor   // constructor injection for UserService
@Slf4j
public class UserController {

    private final UserService userService;

    // Register new user
    @PostMapping("/register")
    public ResponseEntity<UserDetails> register(@RequestBody RegistrationRequest request) {
        UserDetails savedUser = userService.registerUser(request);
        log.info("New user registered: {}", savedUser.getName());
        return ResponseEntity.ok(savedUser);
    }

    // Get all users
    @GetMapping
    public ResponseEntity<List<RegistrationResponse>> getAllUsers() {
        List<RegistrationResponse> users = userService.getAllUsers();
        log.info("Fetched {} users", users.size());
        return ResponseEntity.ok(users);
    }

    // Delete user by ID
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        log.info("Deleted user with id {}", id);
        return ResponseEntity.noContent().build();
    }
}