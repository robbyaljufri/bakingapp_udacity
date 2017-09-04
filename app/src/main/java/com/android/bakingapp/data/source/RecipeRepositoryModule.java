package com.android.bakingapp.data.source;

import com.android.bakingapp.data.source.local.Local;
import com.android.bakingapp.data.source.local.RecipeLocalDataSource;
import com.android.bakingapp.data.source.remote.RecipeRemoteDataSource;
import com.android.bakingapp.data.source.remote.RecipeService;
import com.android.bakingapp.data.source.remote.Remote;
import com.squareup.sqlbrite.BriteDatabase;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
class RecipeRepositoryModule {

  @Singleton
  @Provides
  @Local
  RecipeDataSource provideRecipeLocalDataSource(BriteDatabase briteDatabase) {
    return new RecipeLocalDataSource(briteDatabase);
  }

  @Singleton
  @Provides
  @Remote
  RecipeDataSource provideRecipeRemoteDataSource(RecipeService service) {
    return new RecipeRemoteDataSource(service);
  }
}
