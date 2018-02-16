package com.example.rodoggx.EarthquakeEloquence.data;

import com.example.rodoggx.EarthquakeEloquence.model.Earthquake;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by RodoggX on 2/13/2018.
 */

public interface EarthquakeService {

    @GET("/fdsnws/event/1/query")
    Call<List<Earthquake>> getResponse(@QueryMap Map<String, String> earthquakeResponse);
}
