package com.example.ChefBook.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="recipes")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 1000)
    private String description;

    @Column(nullable = false, length = 10000)
    private String instructions;

    @Column(nullable = false, length = 10)
    private int prep_time;

    @Column(nullable = false, length = 10)
    private int cook_time;

    @Column(nullable = false, length = 10)
    private int total_time;

    @Column(nullable = false, length = 10)
    private int servings;

    @Column(nullable = false, length = 8)
    private LocalDate created_at;

    @Column(nullable = false, length = 8)
    private LocalDate updated_at;

    @Column(nullable = false, length = 100)
    private String categories;

//    @OneToMany
//    @JoinColumn(name = "recipe_id")
//    Recipe_Ingredients recipe_ingredients;
//
//    @OneToMany
//    @JoinColumn (name = "recipe_id")
//    Recipe_Images recipe_Images;

    @OneToMany(mappedBy = "recipe")
    Set<Recipe_Ingredients> recipe_Ingredients;
}
