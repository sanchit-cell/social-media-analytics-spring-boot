package com.example.social_media_analytics.controller;

import com.example.social_media_analytics.model.Post;
import com.example.social_media_analytics.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
// @CrossOrigin(origins = "http://localhost:3000")
// @CrossOrigin(origins = "*")
@CrossOrigin(origins = "https://social-media-analytics-dashboard-3y1h.onrender.com")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/user/{userId}")
    public List<Post> getPostsByUserId(@PathVariable Long userId) {
        return postRepository.findByUserId(userId);
    }
}
