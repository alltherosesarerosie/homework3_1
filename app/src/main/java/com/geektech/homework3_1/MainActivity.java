package com.geektech.homework3_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rV_zoo;
    private ArrayList<String> zoo_list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rV_zoo = findViewById(R.id.rv_zoo);
        loadData();
        AdapterZoo adapterZoo = new AdapterZoo(zoo_list);
        rV_zoo.setAdapter(adapterZoo);
    }

    private void loadData() {
        zoo_list.add("Lion");
        zoo_list.add("Cat");
        zoo_list.add("Dog");
        zoo_list.add("Crocodile");
        zoo_list.add("Bear");
        zoo_list.add("Squirrel");
        zoo_list.add("Fish");
        zoo_list.add("Rat");
    }
}