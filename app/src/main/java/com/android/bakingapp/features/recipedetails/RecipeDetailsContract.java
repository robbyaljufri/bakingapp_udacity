package com.android.bakingapp.features.recipedetails;

import com.android.bakingapp.BasePresenter;
import com.android.bakingapp.BaseView;
import com.android.bakingapp.data.model.Ingredient;
import com.android.bakingapp.data.model.Step;
import java.util.List;

public interface RecipeDetailsContract {

  interface View extends BaseView<Presenter> {

    void showIngredientsList(List<Ingredient> ingredients);

    void showStepsList(List<Step> steps);

    void showErrorMessage();

    void showRecipeNameInActivityTitle(String recipeName);

    void showStepDetails(int stepId);

    void refreshStepContainerFragment(String desc, String videoUrl, String imageUrl);
  }

  interface Presenter extends BasePresenter {

    void loadRecipeNameFromRepo();

    void loadIngredientsFromRepo();

    void loadStepsFromRepo();

    void openStepDetails(int stepId);

    void fetchStepData(int stepId);
  }
}
