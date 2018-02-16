package com.example.rodoggx.EarthquakeEloquence.data;

import com.example.rodoggx.EarthquakeEloquence.model.Earthquake;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by RodoggX on 2/13/2018.
 */

public interface MainResponse {

//    String geojson = "geojson";
//    String starttime = "2014-01-01";
//    String endtime = "2014-01-02";

    @GET("/fdsnws/event/1/")
    Call<List<Earthquake>> getResponse(@Query("format") String geojson,
    @Query("starttime") String starttime,
    @Query("endtime") String endtime);

}
