package com.example.rodoggx.funkyfreshflights.data;

import com.example.rodoggx.funkyfreshflights.model.Response;

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
