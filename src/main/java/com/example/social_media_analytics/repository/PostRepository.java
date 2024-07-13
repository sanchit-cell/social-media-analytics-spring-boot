package com.example.social_media_analytics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.social_media_analytics.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByUserId(Long userId);}
