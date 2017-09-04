package com.android.bakingapp.features.recipelist;

import com.android.bakingapp.data.source.RecipeRepositoryComponent;
import com.android.bakingapp.util.FragmentScoped;
import dagger.Component;

@FragmentScoped
@Component(dependencies = RecipeRepositoryComponent.class, modules = RecipeListPresenterModule.class)
interface RecipeListComponent {

  void inject(RecipeListActivity recipeListActivity);
}
