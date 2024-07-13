package com.example.social_media_analytics.controller;

import com.example.social_media_analytics.model.Promotion;
import com.example.social_media_analytics.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promotions")
@CrossOrigin(origins = "http://localhost:3000")
public class PromotionController {

    @Autowired
    private PromotionRepository promotionRepository;

    @GetMapping
    public List<Promotion> getAllPromotions() {
        return promotionRepository.findAll();
    }

    @GetMapping("/user/{userId}")
    public List<Promotion> getPromotionsByUserId(@PathVariable Long userId) {
        return promotionRepository.findByUserId(userId);
    }
}
