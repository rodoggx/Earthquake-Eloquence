package com.example.rodoggx.funkyfreshflights.utils;

/**
 * Created by RodoggX on 2/13/2018.
 */

public interface BasePresenter<V extends BaseView> {

    void attachView(V v);

    void detachView(V v);

}
