package com.example.simpleuserjpa.controller;

import com.example.simpleuserjpa.entity.User;
import com.example.simpleuserjpa.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return repository.save(user);
    }
}
