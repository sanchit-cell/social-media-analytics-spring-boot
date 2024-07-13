package com.example.social_media_analytics.repository;



import com.example.social_media_analytics.model.Ad;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdRepository extends JpaRepository<Ad, Long> {

    List<Ad> findByUserId(Long userId);
}

