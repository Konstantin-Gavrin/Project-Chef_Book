package com.example.ChefBook.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
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
    private int prepTime;

    @Column(nullable = false, length = 10)
    private int cookTime;

    @Column(nullable = false, length = 10)
    private int totalTime;

    @Column(nullable = false, length = 10)
    private int servings;

    @Column(nullable = false, length = 8)
    private LocalDate createdAt;

    @Column(nullable = false, length = 8)
    private LocalDate updatedAt;

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
    Set<RecipeIngredients> recipeIngredients;
}
