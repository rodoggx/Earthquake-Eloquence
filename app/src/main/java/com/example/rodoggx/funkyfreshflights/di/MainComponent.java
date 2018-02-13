package com.example.rodoggx.funkyfreshflights.di;

import com.example.rodoggx.funkyfreshflights.view.MainActivity;

import dagger.Component;

/**
 * Created by RodoggX on 2/13/2018.
 */

@Component(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);
}
