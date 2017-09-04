package com.android.bakingapp.features.widget;

import com.android.bakingapp.BakingAppModule;
import com.android.bakingapp.data.source.RecipeRepositoryComponent;
import com.android.bakingapp.util.ProviderScoped;
import dagger.Component;

@ProviderScoped
@Component(dependencies = RecipeRepositoryComponent.class, modules = BakingAppModule.class)
interface WidgetDataHelperComponent {

  void inject(WidgetProvider provider);
  void inject(WidgetConfigurationActivity activity);
}
