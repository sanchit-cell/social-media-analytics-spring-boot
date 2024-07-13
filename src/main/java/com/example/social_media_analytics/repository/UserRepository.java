package com.example.social_media_analytics.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.social_media_analytics.model.User;

public interface UserRepository extends JpaRepository<User, Long> {}

