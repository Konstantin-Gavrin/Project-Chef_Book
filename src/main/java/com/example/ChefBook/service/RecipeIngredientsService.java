package com.example.ChefBook.service;


import com.example.ChefBook.entity.RecipeIngredients;
import com.example.ChefBook.repository.RecipeIngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeIngredientsService {
    @Autowired
    private RecipeIngredientsRepository recipeingredientsRepository;

    public List<RecipeIngredients> getAllRecipeIngredients() {
        return recipeingredientsRepository.findAll();
    }

    public RecipeIngredients getRecipeIngredientById(Long recipeingredientId) {
        return recipeingredientsRepository.findById(recipeingredientId).orElse(null);
    }
}
