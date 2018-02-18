package com.example.rodoggx.EarthquakeEloquence.data;

import android.util.Log;

import com.example.rodoggx.EarthquakeEloquence.model.Earthquake;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.ContentValues.TAG;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

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

    public static Call<Earthquake> getResponse() {

        Map<String, String> data = new HashMap<>();
        data.put("format", "geojson");
        data.put("starttime", "2014-01-01");
        data.put("endtime", "2014-01-02");

        Log.d(TAG, "getResponse: " + data.toString());

        Retrofit retrofit = create();
        EarthquakeService earthquakeService = retrofit.create(EarthquakeService.class);
        return earthquakeService.getResponse(data);
    }

}