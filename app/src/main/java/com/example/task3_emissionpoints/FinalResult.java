package com.example.task3_emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FinalResult extends AppCompatActivity {
    TextView m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_result);
        int marks=getIntent().getIntExtra("marks",0);
        m = findViewById(R.id.gotMarks);
        m.setText(String.valueOf(marks+" out of "+5));

    }
}