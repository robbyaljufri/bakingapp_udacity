package com.android.bakingapp.features.recipelist;

import com.android.bakingapp.BasePresenter;
import com.android.bakingapp.BaseView;
import com.android.bakingapp.data.idlingresource.RecipesIdlingResource;
import com.android.bakingapp.data.model.Recipe;
import java.util.List;

public interface RecipeListContract {

  interface View extends BaseView<Presenter> {

    void showRecipeList(List<Recipe> recipeList);

    void showLoadingIndicator(boolean show);

    void showCompletedMessage();

    void showErrorMessage();

    void showRecipeDetails(int recipeId);
  }

  interface Presenter extends BasePresenter {

    void loadRecipesFromRepo(boolean forcedSync, RecipesIdlingResource resource);

    void openRecipeDetails(int recipeId);
  }
}
