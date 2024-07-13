package com.example.social_media_analytics.repository;



import com.example.social_media_analytics.model.Promotion;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {

    List<Promotion> findByUserId(Long userId);
}

