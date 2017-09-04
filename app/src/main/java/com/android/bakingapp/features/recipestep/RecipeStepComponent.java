package com.android.bakingapp.features.recipestep;

import com.android.bakingapp.data.source.RecipeRepositoryComponent;
import com.android.bakingapp.util.FragmentScoped;
import dagger.Component;

@FragmentScoped
@Component(dependencies = RecipeRepositoryComponent.class, modules = RecipeStepPresenterModule.class)
interface RecipeStepComponent {

  void inject(RecipeStepActivity recipeStepActivity);
}
