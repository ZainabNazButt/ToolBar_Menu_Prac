package com.example.task3_emissionpoints;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity{

    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_halqiyah:
                intent = new Intent(MainActivity2.this,Halqiyah.class);
                startActivity(intent);
                return true;
            case R.id.action_lahatiyah:
                intent = new Intent(MainActivity2.this,Lahatiyah.class);
                startActivity(intent);
                return true;
            case R.id.action_shajariyah:
                intent = new Intent(MainActivity2.this,Shajariyah.class);
                startActivity(intent);
                return true;
            case R.id.action_tarfiyah:
                intent = new Intent(MainActivity2.this,Tarfiyah.class);
                startActivity(intent);
                return true;
            case R.id.action_nitEeyah:
                intent = new Intent(MainActivity2.this,Nit_eeyah.class);
                startActivity(intent);
                return true;
            case R.id.action_lisaveyah:
                intent = new Intent(MainActivity2.this,Lisaveyah.class);
                startActivity(intent);
                return true;
            case R.id.action_ghunna:
                intent = new Intent(MainActivity2.this,Ghunna.class);
                startActivity(intent);
                return true;
            case R.id.action_tasks:
                intent = new Intent(MainActivity2.this,Practise.class);
                startActivity(intent);
                return true;



            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);


        }
    }
}