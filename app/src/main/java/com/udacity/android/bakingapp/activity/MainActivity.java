package com.udacity.android.bakingapp.activity;

import android.content.Intent;
import android.support.v4.app.Fragment;

import com.udacity.android.bakingapp.fragment.RecipeListFragment;
import com.udacity.android.bakingapp.presenter.RecipeListPresenter;
import com.udacity.android.bakingapp.model.Recipe;
import com.udacity.android.bakingapp.widget.RecipeWidgetService;

public class MainActivity extends BaseActivity implements RecipeListPresenter.Callbacks {
    @Override
    protected Fragment createFragment() {
        return new RecipeListFragment();
    }

    @Override
    public void recipeSelected(Recipe recipe) {
        Intent intent = RecipeDetailActivity.newIntent(this, recipe);
        RecipeWidgetService.startActionUpdateRecipeWidgets(this, recipe);
        startActivity(intent);
    }
}
