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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.TimeZone;

import static android.media.CamcorderProfile.get;

/**
 * Created by RodoggX on 2/13/2018.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private static final String TAG = "MainAdapter_TAG_";
    //    private Earthquake earthquake;
    private LinkedList<Earthquake> earthquakeList = new LinkedList<>();
    private LayoutInflater inflater;

    public MainAdapter(LinkedList<Earthquake> earthquakeList, Context context) {
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

        String locationText = "Location: " +  earthquakeItem.getFeatures().get(position).getProperties().getPlace();
        holder.locationTv.setText(locationText);

        String magnitudeText = "Magnitude: " + Double.toString(earthquakeItem.getFeatures().get(position).getProperties().getMag());
        holder.magnitudeTv.setText(magnitudeText);

        long seconds = earthquakeItem.getFeatures().get(position).getProperties().getTime();
        Date date = new Date(seconds);
        SimpleDateFormat myDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
        String javaDate = "Date: " + myDate.format(date);
        holder.dateTv.setText(javaDate);
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
}
