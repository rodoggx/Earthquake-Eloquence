package com.example.rodoggx.EarthquakeEloquence.data;

import com.example.rodoggx.EarthquakeEloquence.model.Response;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by RodoggX on 2/13/2018.
 */

public interface MainResponse {

    @GET("response")
    Call<List<Response>> getResponse();

}
