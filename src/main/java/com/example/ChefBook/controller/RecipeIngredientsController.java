package com.example.ChefBook.controller;


import com.example.ChefBook.service.RecipeIngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recipeingredients")
public class RecipeIngredientsController {
    private final RecipeIngredientsService recipeingredientsService;
    @Autowired
    public RecipeIngredientsController(RecipeIngredientsService recipeingredientsService) {
        this.recipeingredientsService = recipeingredientsService;
    }

    @GetMapping("")
    public String  getAllIngredients(Model model) {
        model.addAttribute("recipeingredients", recipeingredientsService.getAllRecipeIngredients());
        return "recipeingredients";
    }
}