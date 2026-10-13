package com.example.simpleuserjpa.repository;

import com.example.simpleuserjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
