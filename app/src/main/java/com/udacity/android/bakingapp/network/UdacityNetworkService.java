package com.udacity.android.bakingapp.network;

import com.udacity.android.bakingapp.model.Recipe;
import java.util.ArrayList;
import io.reactivex.Observable;

public class UdacityNetworkService {

    private UdacityApiObservable mUdacityApiObservable;

    public UdacityNetworkService(){
        mUdacityApiObservable = ApiUtils.getUdacityApiObservable();
    }

    public Observable<ArrayList<Recipe>> networkApiRequestRecipes() {
        Observable observer = mUdacityApiObservable.getUdacityRecipeResult();
        return observer;
    }
}
