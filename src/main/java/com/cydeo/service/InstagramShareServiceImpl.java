package com.cydeo.service;

import com.cydeo.model.Recipe;
import org.springframework.stereotype.Component;

@Component
public class InstagramShareServiceImpl implements ShareService{
    @Override
    public boolean share(Recipe recipe) {
        System.out.println("Shared on Instagram");
        System.out.println("Recipe Type: " + recipe.getRecipeType());
        System.out.println("Recipe Name: " + recipe.getName());
        System.out.println("...........");
        return true;
    }
}
