package com.example.rodoggx.EarthquakeEloquence.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rodoggx.EarthquakeEloquence.R;
import com.example.rodoggx.EarthquakeEloquence.model.Feature;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by RodoggX on 2/13/2018.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private static final String TAG = "MainAdapter_TAG_";
    private Context context;
    private ArrayList<Feature> featureList = new ArrayList<>();
    private ArrayList<Feature> filteredFeatureList = new ArrayList<>();
    private LayoutInflater inflater;

    public MainAdapter(ArrayList<Feature> featureList, Context context) {
        this.featureList = featureList;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MainViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        Feature featureItem = featureList.get(position);
        getLocationView(holder, featureItem);
        getMagnitudeView(holder, featureItem);
        getDateView(holder, featureItem);
    }

    private void getDateView(MainViewHolder holder, Feature featureItem) {
        long seconds = featureItem.getProperties().getTime();
        Date date = new Date(seconds);
        SimpleDateFormat myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        String javaDate = "Date: " + myDate.format(date);
        holder.dateTv.setText(javaDate);
    }

    private void getMagnitudeView(MainViewHolder holder, Feature featureItem) {
        String magnitudeText = "Magnitude: " + Double.toString(featureItem.getProperties().getMag());
        holder.magnitudeTv.setText(magnitudeText);
    }

    private void getLocationView(MainViewHolder holder, Feature featureItem) {
        String locationText = "Location: " + featureItem.getProperties().getPlace();
        holder.locationTv.setText(locationText);
    }

    @Override
    public int getItemCount() {
        return featureList.size();
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

    public void setFilter(String newText) {
        filteredFeatureList.clear();
        String place;
        newText = newText.toLowerCase();
        List<Feature> features = featureList;
        for (Feature feature : features) {
            place = feature.getProperties().getPlace().toLowerCase();
            if (place.contains(newText)) {
                filteredFeatureList.add(feature);
            }
        }
        featureList.clear();
        featureList.addAll(filteredFeatureList);
        Log.d(TAG, "setFilter: featureList " + featureList.size());
        Log.d(TAG, "setFilter: filterdFeatureList " + filteredFeatureList.size());
        notifyDataSetChanged();
    }
}
