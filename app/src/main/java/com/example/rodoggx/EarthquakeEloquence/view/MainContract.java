package com.example.rodoggx.EarthquakeEloquence.view;

import com.example.rodoggx.EarthquakeEloquence.model.Earthquake;
import com.example.rodoggx.EarthquakeEloquence.utils.BasePresenter;
import com.example.rodoggx.EarthquakeEloquence.utils.BaseView;

import java.util.List;

/**
 * Created by RodoggX on 2/13/2018.
 */

public interface MainContract {

    interface View extends BaseView {
        void onEarthquakeReceived(List<Earthquake> earthquakeList);
    }

    interface Presenter extends BasePresenter<View> {
        void getEarthquakes();
    }

}
