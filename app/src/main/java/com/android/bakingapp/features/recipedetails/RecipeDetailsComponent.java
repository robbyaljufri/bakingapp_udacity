package com.android.bakingapp.features.recipedetails;

import com.android.bakingapp.data.source.RecipeRepositoryComponent;
import com.android.bakingapp.util.FragmentScoped;
import dagger.Component;

@FragmentScoped
@Component(dependencies = RecipeRepositoryComponent.class, modules = RecipeDetailsPresenterModule.class)
public interface RecipeDetailsComponent {

  void inject(RecipeDetailsActivity recipeDetailsActivity);
}
