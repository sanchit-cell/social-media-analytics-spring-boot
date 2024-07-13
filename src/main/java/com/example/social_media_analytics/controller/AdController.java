package com.example.social_media_analytics.controller;

import com.example.social_media_analytics.model.Ad;
import com.example.social_media_analytics.repository.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ads")
@CrossOrigin(origins = "http://localhost:3000")
public class AdController {

    @Autowired
    private AdRepository adRepository;

    @GetMapping
    public List<Ad> getAllAds() {
        return adRepository.findAll();
    }

    @GetMapping("/user/{userId}")
    public List<Ad> getAdsByUserId(@PathVariable Long userId) {
        return adRepository.findByUserId(userId);
    }
}
