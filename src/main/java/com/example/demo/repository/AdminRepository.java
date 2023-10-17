package com.example.demo.repository;

import com.example.demo.model.Adminitrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Adminitrator, Integer> {

    boolean existsByEmail(String email);
}
