package com.example.ChefBook.repository;

import com.example.ChefBook.entity.Ingredients;
import com.example.ChefBook.entity.RecipeIngredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeIngredientsRepository extends JpaRepository<RecipeIngredients, Long> {
    List<RecipeIngredients> findByIngredients(Ingredients ingredient);
}

