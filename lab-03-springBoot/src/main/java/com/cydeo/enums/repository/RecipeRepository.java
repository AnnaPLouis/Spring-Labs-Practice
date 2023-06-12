package com.cydeo.enums.repository;

import com.cydeo.model.Recipe;

public interface RecipeRepository {

    boolean save(Recipe recipe);
}
