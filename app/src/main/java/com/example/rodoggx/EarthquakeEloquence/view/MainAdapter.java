package com.example.rodoggx.EarthquakeEloquence.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rodoggx.EarthquakeEloquence.R;
import com.example.rodoggx.EarthquakeEloquence.model.Earthquake;

import java.util.List;

/**
 * Created by RodoggX on 2/13/2018.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    List<Earthquake> earthquakeList;

    public MainAdapter(List<Earthquake> earthquakeList) {
        this.earthquakeList = earthquakeList;
    }

    @Override
    public MainViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainViewHolder holder, int position) {
        Earthquake earthquake = earthquakeList.get(position);
        holder.magnitude.setText(Double.toString(earthquake.getMagnitude()));
        holder.location.setText(earthquake.getLocation());
        holder.time.setText(Double.toString(earthquake.getTime()));
        holder.url.setText(earthquake.getUrl());
    }

    @Override
    public int getItemCount() {
        return earthquakeList.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {

        TextView location;
        TextView url;
        TextView magnitude;
        TextView time;

        public MainViewHolder(View itemView) {
            super(itemView);
            location = itemView.findViewById(R.id.tvLocation);
            url = itemView.findViewById(R.id.tvUrl);
            magnitude = itemView.findViewById(R.id.tvMagnitude);
            time = itemView.findViewById(R.id.tvTime);
        }
    }
}
