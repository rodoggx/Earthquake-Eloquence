package com.example.rodoggx.EarthquakeEloquence.view;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.rodoggx.EarthquakeEloquence.R;
import com.example.rodoggx.EarthquakeEloquence.di.DaggerMainComponent;
import com.example.rodoggx.EarthquakeEloquence.model.Earthquake;
import com.example.rodoggx.EarthquakeEloquence.model.Feature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;

import dagger.internal.DaggerCollections;

import static android.util.Log.d;
import static com.example.rodoggx.EarthquakeEloquence.R.id.search;
import static java.lang.System.getProperties;

public class MainActivity extends AppCompatActivity implements MainContract.View, SearchView.OnQueryTextListener {

    private static final String TAG = "MainActivityTAG_";

    @Inject
    MainPresenter presenter;

    private final ArrayList<Feature> featureList = new ArrayList<>();
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
        handleIntent(getIntent());

        if (savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.activity_main, CardViewFragment.newInstance())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        MenuItem menuItem = menu.findItem(search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(this);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        ComponentName componentName = getComponentName();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(componentName));
        return true;
    }

    private void setupRecyclerView() {
        layoutManager = new LinearLayoutManager(this);
        recyclerView = (RecyclerView) findViewById(R.id.rvEarthquakes);
    }

    private void setupDaggerComponent() {
        DaggerMainComponent
                .create()
                .inject(this);
    }

    @Override
    public void onEarthquakeReceived(Earthquake earthquake) {
        featureList.clear();
        List<Feature> features = earthquake.getFeatures();
        for (Feature feature : features) {
            featureList.add(feature);
        }
        adapter = new MainAdapter(featureList, this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void showError(String s) {
        d(TAG, "showError: " + s);
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    public void getEarthquakes(View view) {
        presenter.getEarthquakes();
    }

    @Override
    public void onNewIntent(Intent intent) {
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            onQueryTextChange(query);
        }
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.setFilter(newText);
        return false;
    }
}
