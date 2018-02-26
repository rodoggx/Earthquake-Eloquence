package com.example.rodoggx.EarthquakeEloquence.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rodoggx.EarthquakeEloquence.R;
import com.example.rodoggx.EarthquakeEloquence.model.Earthquake;
import com.example.rodoggx.EarthquakeEloquence.model.Feature;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static android.media.CamcorderProfile.get;

/**
 * Created by RodoggX on 2/13/2018.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private static final String TAG = "MainAdapter_TAG_";
    private ArrayList<Earthquake> earthquakeList = new ArrayList<>();
    private ArrayList<Earthquake> filteredEarthquakeList = new ArrayList<>();
    private LayoutInflater inflater;
    private int position;

    public MainAdapter(ArrayList<Earthquake> earthquakeList, Context context) {
        this.earthquakeList = earthquakeList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MainViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        Earthquake earthquakeItem = earthquakeList.get(position);
        getLocationView(holder, position, earthquakeItem);
        getMagnitudeView(holder, position, earthquakeItem);
        getDateView(holder, position, earthquakeItem);
        setPosition(position);
    }

    private void getDateView(MainViewHolder holder, int position, Earthquake earthquakeItem) {
        long seconds = earthquakeItem.getFeatures().get(position).getProperties().getTime();
        Date date = new Date(seconds);
        SimpleDateFormat myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        String javaDate = "Date: " + myDate.format(date);
        holder.dateTv.setText(javaDate);
    }

    private void getMagnitudeView(MainViewHolder holder, int position, Earthquake earthquakeItem) {
        String magnitudeText = "Magnitude: " + Double.toString(earthquakeItem.getFeatures().get(position).getProperties().getMag());
        holder.magnitudeTv.setText(magnitudeText);
    }

    private void getLocationView(MainViewHolder holder, int position, Earthquake earthquakeItem) {
        String locationText = "Location: " + earthquakeItem.getFeatures().get(position).getProperties().getPlace();
        holder.locationTv.setText(locationText);
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "getItemCount: " + earthquakeList.size());
        return earthquakeList.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        TextView locationTv;
        TextView magnitudeTv;
        TextView dateTv;
        MainAdapter adapter;

        public MainViewHolder(View itemView, MainAdapter adapter) {
            super(itemView);
            this.adapter = adapter;
            locationTv = itemView.findViewById(R.id.locationTv);
            magnitudeTv = itemView.findViewById(R.id.magnitudeTv);
            dateTv = itemView.findViewById(R.id.dateTv);
        }
    }

    private int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void setFilter(String newText) {
        Log.d(TAG, "SetFilter: New Text " + newText);
        filteredEarthquakeList.clear();
        String place;
        newText = newText.toLowerCase();

        if (earthquakeList.size() == 0) {
            Log.d(TAG, "SetFilter: List is missing elements : " + earthquakeList.size());
        }
        Log.d(TAG, "setFilter: position of feature " + position);

        List<Feature> features = earthquakeList.get(position).getFeatures();
        int index = 0;
        for (Feature feature : features) {
            place = feature.getProperties().getPlace().toLowerCase();
            if (place.contains(newText)) {
                Log.d(TAG, "setFilter: place " + place);
                Log.d(TAG, "setFilter: index " + index);
                Log.d(TAG, "setFilter: position " + position);
                filteredEarthquakeList.add(earthquakeList.get(position));
                Log.d(TAG, "setFilter: earthquake list index " + earthquakeList.indexOf(feature));
            }
            index++;

        }

        Log.d(TAG, "setFilter: New Filtered List " + filteredEarthquakeList.size());
        earthquakeList.clear();
        earthquakeList.addAll(filteredEarthquakeList);
        notifyDataSetChanged();
    }

}
