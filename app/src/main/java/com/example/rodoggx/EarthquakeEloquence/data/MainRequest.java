package com.example.rodoggx.EarthquakeEloquence.data;

import com.example.rodoggx.EarthquakeEloquence.model.Earthquake;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by RodoggX on 2/13/2018.
 */

public class MainRequest {

    public static final String BASE_URL = "https://earthquake.usgs.gov";

    public static Retrofit create() {
    return new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    }

    public static Call<List<Earthquake>> getResponse() {

        Retrofit retrofit = create();
        MainResponse mainResponse = retrofit.create(MainResponse.class);
        return mainResponse.getResponse("geojson", "2014-01-01", "2014-01-02");
    }

}
