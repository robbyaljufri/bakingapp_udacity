package com.android.bakingapp.data.source;

import com.android.bakingapp.BakingAppModule;
import com.android.bakingapp.data.source.local.db.DbModule;
import com.android.bakingapp.data.source.local.prefs.PreferencesModule;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {RecipeRepositoryModule.class, DbModule.class, PreferencesModule.class,
    BakingAppModule.class})
public interface RecipeRepositoryComponent {

  RecipeRepository getRecipeRepository();
}
