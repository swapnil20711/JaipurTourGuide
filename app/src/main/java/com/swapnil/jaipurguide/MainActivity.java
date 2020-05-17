package com.swapnil.jaipurguide;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.icu.util.Output;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.locations_list);
        List<Location> list = new ArrayList<>();
        Sights.initSightsList(list);
        LocationAdapter adapter = new LocationAdapter(this, -1, list);
        ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(adapter);
    }

}
