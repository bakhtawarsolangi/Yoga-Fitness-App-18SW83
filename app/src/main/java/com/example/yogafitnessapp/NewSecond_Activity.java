package com.example.yogafitnessapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class NewSecond_Activity extends AppCompatActivity {

    int[] newArray;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_second);


        Toolbar toolbar1 = findViewById(R.id.toolBar1);
        setSupportActionBar(toolbar1);


        newArray= new int[]{
                R.id.boat_pose16,R.id.boat_pose17,R.id.boat_pose18,R.id.boat_pose20,R.id.boat_pose21,R.id.boat_pose22,
                R.id.boat_pose23,R.id.boat_pose24,R.id.boat_pose25,R.id.boat_pose26,R.id.boat_pose27,


        };

    }

    public void Imagebuttonclicked1(View view) {
        for (int i = 0; i < newArray.length; i++) {
            if (view.getId() == newArray[i]) {
                int value = i + 1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(NewSecond_Activity.this, ThirdActivity2.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);


            }
        }
    }
    }