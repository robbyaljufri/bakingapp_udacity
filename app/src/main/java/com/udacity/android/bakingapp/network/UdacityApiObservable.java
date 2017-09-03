package com.udacity.android.bakingapp.network;

import com.udacity.android.bakingapp.model.Recipe;
import java.util.ArrayList;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface UdacityApiObservable {
    @GET(" ")
    Observable<ArrayList<Recipe>> getUdacityRecipeResult();
}
