package com.example.social_media_analytics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;




@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "\"user\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String category;
    private String bio;
    private String contactOptions;
    private String links;
    
    private int followers;
    private int following;
    private int accountReached;
    private int accountEngaged;
    private int totalStories;
    private int totalFollows;
    private int totalPosts;
    private int totalSaves;
    private int totalComments;
    private int totalShares;

    
}
