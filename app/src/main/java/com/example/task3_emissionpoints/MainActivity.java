package com.example.task3_emissionpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.visitRepository);
        btn2=findViewById(R.id.practise_main);
        btn3=findViewById(R.id.exam);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.visitRepository:
                String url = getString(R.string.repositoryName);
                Uri webpage = Uri.parse(url);
                intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
                break;
            case R.id.practise_main:
                intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
                break;
            case R.id.exam:
                intent = new Intent(MainActivity.this,Exam.class);
                intent.putExtra("ButtonName","Exam");
                startActivity(intent);
                break;
            default:
                    throw new IllegalStateException("Unexpected value: " + v.getId());
            }

    }

}