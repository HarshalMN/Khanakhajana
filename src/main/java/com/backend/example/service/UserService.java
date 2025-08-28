package com.backend.example.service;

import com.backend.example.entity.UserDetails;
import com.backend.example.model.RegistrationRequest;
import com.backend.example.model.RegistrationResponse;
import com.backend.example.repository.UserDetailsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDetailsRepository userRepo;

    public UserDetails registerUser(RegistrationRequest dto) {
        Optional<UserDetails> existingUser = userRepo.findByName(dto.getName());
        if (existingUser.isPresent()) {
            log.warn("User with name {} already exists", dto.getName());
            return existingUser.get();
        }
        UserDetails user = new UserDetails();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setRole(dto.getRole());
        return userRepo.save(user);
    }

    public List<RegistrationResponse> getAllUsers() {
        return userRepo.findAll().stream()
                .map(u -> new RegistrationResponse(u.getName(), u.getEmail(), u.getRole()))
                .collect(Collectors.toList());
    }
    public void deleteUser(Long id) {
        if (!userRepo.existsById(id)) {
            throw new RuntimeException("User not found with id " + id);
        }
        userRepo.deleteById(id);
    }
}