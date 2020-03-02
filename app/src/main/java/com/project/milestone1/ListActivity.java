package com.project.milestone1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        String[] operatingSystems = {"Android", "iOS", "Windows", "BlackBerry", "Linux"};
        recyclerView.setAdapter(new OperatingSystemsAdapter(operatingSystems));
    }
}
