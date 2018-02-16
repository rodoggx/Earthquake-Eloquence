package com.example.rodoggx.EarthquakeEloquence.di;

import com.example.rodoggx.EarthquakeEloquence.view.MainPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by RodoggX on 2/13/2018.
 */

@Module
public class MainModule {

    @Provides
    MainPresenter providePresenter() {
        return new MainPresenter();
    }

}
