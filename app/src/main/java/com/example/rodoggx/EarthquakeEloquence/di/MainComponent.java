package com.example.rodoggx.EarthquakeEloquence.di;

import com.example.rodoggx.EarthquakeEloquence.view.MainActivity;

import dagger.Component;

/**
 * Created by RodoggX on 2/13/2018.
 */

@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
