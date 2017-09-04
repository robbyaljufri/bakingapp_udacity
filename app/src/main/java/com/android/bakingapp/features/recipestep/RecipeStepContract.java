package com.android.bakingapp.features.recipestep;

import com.android.bakingapp.BasePresenter;
import com.android.bakingapp.BaseView;
import com.android.bakingapp.data.model.Step;
import java.util.List;

class RecipeStepContract {

  interface View extends BaseView<Presenter> {

    void showStepsInViewpager(List<Step> steps);

    void showErrorMessage();

    void moveToCurrentStepPage();
  }

  interface Presenter extends BasePresenter {

    void loadStepsToAdapter();
  }
}
