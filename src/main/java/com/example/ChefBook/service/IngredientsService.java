package com.example.ChefBook.service;

import com.example.ChefBook.entity.Ingredients;
import com.example.ChefBook.repository.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientsService {

    @Autowired
    private IngredientsRepository ingredientsRepository;

    public List<Ingredients> getAllIngredients() {
        return ingredientsRepository.findAll();
    }

    public Ingredients getIngredientById(Long ingredientId) {
        return ingredientsRepository.findById(ingredientId).orElse(null);
    }
 }
