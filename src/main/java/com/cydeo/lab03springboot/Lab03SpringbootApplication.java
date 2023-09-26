package com.cydeo.lab03springboot;

import com.cydeo.service.RecipeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Lab03SpringbootApplication {

    public static void main(String[] args) {

        ApplicationContext container = SpringApplication.run(Lab03SpringbootApplication.class, args);

        RecipeService recipeService = container.getBean(RecipeService.class);
        recipeService.prepareRecipe();
    }

}
