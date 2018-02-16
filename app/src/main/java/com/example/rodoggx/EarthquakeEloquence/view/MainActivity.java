package com.example.rodoggx.EarthquakeEloquence.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.rodoggx.EarthquakeEloquence.R;
import com.example.rodoggx.EarthquakeEloquence.di.DaggerMainComponent;
import com.example.rodoggx.EarthquakeEloquence.model.Earthquake;

import java.util.List;

import javax.inject.Inject;

import dagger.internal.DaggerCollections;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Inject
    MainPresenter presenter;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupDaggerComponent();
        presenter.attachView(this);
        setupRecyclerView();

    }

    private void setupRecyclerView() {
        recyclerView = (RecyclerView) findViewById(R.id.rvEarthquakes);
        layoutManager = new LinearLayoutManager(this);
    }

    private void setupDaggerComponent() {
        DaggerMainComponent.create().inject(this);
    }

    @Override
    public void onEarthquakeReceived(List<Earthquake> earthquakeList) {
        adapter = new MainAdapter(earthquakeList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void showError(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    public void getEarthquakes(View view) {
        presenter.getEarthquakes();
    }
}
