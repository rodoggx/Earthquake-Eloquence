package com.example.rodoggx.EarthquakeEloquence.data;

import com.example.rodoggx.EarthquakeEloquence.model.Response;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by RodoggX on 2/13/2018.
 */

public class MainRequest {

    public static final String BASE_URL = "";

    public static Retrofit create() {
    return new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    }

    public static Call<List<Response>> getResponse() {

        Retrofit retrofit = create();
        MainResponse mainResponse = retrofit.create(MainResponse.class);
        return mainResponse.getResponse();
    }

}
