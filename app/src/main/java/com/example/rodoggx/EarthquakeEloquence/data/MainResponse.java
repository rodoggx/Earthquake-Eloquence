package com.example.rodoggx.EarthquakeEloquence.data;

import com.example.rodoggx.EarthquakeEloquence.model.Earthquake;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by RodoggX on 2/13/2018.
 */

public interface MainResponse {

    @GET("/fdsnws/event/1/")
    Call<List<Earthquake>> getResponse();
//            @Query("format=geojson&starttime=2014-01-01&endtime=2014-01-02" );

}
