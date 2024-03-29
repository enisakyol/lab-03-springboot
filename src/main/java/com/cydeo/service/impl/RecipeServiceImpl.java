package com.cydeo.service.impl;

import com.cydeo.enums.RecipeType;
import com.cydeo.model.Ingredient;
import com.cydeo.model.Recipe;
import com.cydeo.repository.RecipeRepository;
import com.cydeo.service.RecipeService;
import com.cydeo.service.ShareService;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;


@Component
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;
    private final ShareService shareService;
    private final Faker faker;

    public RecipeServiceImpl(RecipeRepository recipeRepository, ShareService shareService, Faker faker) {
        this.recipeRepository = recipeRepository;
        this.shareService = shareService;
        this.faker = faker;
    }

    @Override
    public boolean prepareRecipe() {
        Recipe recipe = new Recipe();
        recipe.setRecipeId(UUID.randomUUID());
        recipe.setName(faker.food().dish());
        recipe.setDuration(generateRandomValue());
        recipe.setPreparation(faker.lorem().paragraph(5));
        recipe.setIngredients(prepareIngredient());
        recipe.setRecipeType(RecipeType.BREAKFAST);
        recipeRepository.save(recipe);
        shareService.share(recipe);
        return true;
    }

    private List<Ingredient> prepareIngredient() {
        List<Ingredient> ingredientList = new ArrayList<>();

        for (int i = 0; i < generateRandomValue(); i++) {
            Ingredient ingredient = new Ingredient();
            ingredient.setName

    }


        return ingredientList;
    }

    private int generateRandomValue(){
        return new Random().nextInt(20)+1;
    }
}
