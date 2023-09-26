package com.cydeo.service;

import com.cydeo.model.Recipe;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FacebookShareService implements ShareService{
    @Override
    public boolean share(Recipe recipe) {
        System.out.println("Shared on Facebook");
        System.out.println("Recipe Type: " + recipe.getRecipeType());
        System.out.println("Recipe Name: " + recipe.getName());
        System.out.println("...........");
        return true;
    }
}
