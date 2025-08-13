package com.backend.example.repository;

import com.backend.example.entity.TableDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableRepository extends JpaRepository<TableDetails, Long> {
}
