package com.example.rodoggx.EarthquakeEloquence.view;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rodoggx.EarthquakeEloquence.R;

/**
 * Created by RodoggX on 2/18/2018.
 */
public class CardViewFragment extends Fragment{
    CardView cardView;

    public CardViewFragment() {
    }

    public static CardViewFragment newInstance() {
        CardViewFragment fragment = new CardViewFragment();
        fragment.setRetainInstance(true);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.list_item, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cardView = (CardView) view.findViewById(R.id.cardview);
    }
}
