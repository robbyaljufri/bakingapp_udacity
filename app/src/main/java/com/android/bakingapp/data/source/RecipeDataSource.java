package com.android.bakingapp.data.source;

import com.android.bakingapp.data.model.Ingredient;
import com.android.bakingapp.data.model.Recipe;
import com.android.bakingapp.data.model.Step;
import io.reactivex.Observable;
import java.util.List;

public interface RecipeDataSource {

  Observable<List<Recipe>> getRecipes();

  Observable<List<Ingredient>> getRecipeIngredients(int recipeId);

  Observable<List<Ingredient>> getRecipeIngredients(String recipeName);

  Observable<List<Step>> getRecipeSteps(int recipeId);

  void saveRecipes(List<Recipe> recipes);
}
