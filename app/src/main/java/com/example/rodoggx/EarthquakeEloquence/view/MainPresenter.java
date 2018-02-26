package com.example.rodoggx.EarthquakeEloquence.view;

import com.example.rodoggx.EarthquakeEloquence.data.MainRequest;
import com.example.rodoggx.EarthquakeEloquence.model.Earthquake;
import com.example.rodoggx.EarthquakeEloquence.utils.BaseView;

import java.util.LinkedList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by RodoggX on 2/13/2018.
 */

public class MainPresenter implements MainContract.Presenter {

    MainContract.View view;

    @Override
    public void getEarthquakes() {
//        Earthquake earthquake = new Earthquake();
//        view.onEarthquakeReceived(earthquake);

        MainRequest.getResponse().enqueue(new Callback<Earthquake>() {
            @Override
            public void onResponse(Call<Earthquake> call, Response<Earthquake> response) {
                view.onEarthquakeReceived(response.body());
            }

            @Override
            public void onFailure(Call<Earthquake> call, Throwable t) {
                view.showError(t.toString());
            }
        });
    }


    @Override
    public void attachView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
