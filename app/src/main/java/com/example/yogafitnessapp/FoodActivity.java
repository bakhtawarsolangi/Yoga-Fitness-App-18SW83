package com.example.yogafitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);


        Toolbar toolbar3 = findViewById(R.id.toolBar3);
        setSupportActionBar(toolbar3);


    }
}