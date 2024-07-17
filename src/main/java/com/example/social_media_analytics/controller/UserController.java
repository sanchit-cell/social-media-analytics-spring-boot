package com.example.social_media_analytics.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.social_media_analytics.model.User;
import com.example.social_media_analytics.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
// @CrossOrigin(origins = "http://localhost:3000")
// @CrossOrigin(origins = "*")
@CrossOrigin(origins = "https://social-media-analytics-dashboard-3y1h.onrender.com")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
