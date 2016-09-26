package com.example.ajitpratapsingh.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toast1(View v) {

        Toast.makeText(MainActivity.this, "My Popular Movies Project",
                Toast.LENGTH_LONG).show();

    }
    public void toast2(View v) {

        Toast.makeText(MainActivity.this, "My Stock Hawk Project",
                Toast.LENGTH_LONG).show();

    }
    public void toast3(View v) {

        Toast.makeText(MainActivity.this, "My Build it Bigger Project",
                Toast.LENGTH_LONG).show();

    }
    public void toast4(View v) {

        Toast.makeText(MainActivity.this, "Make your App Material Project",
                Toast.LENGTH_LONG).show();

    }
    public void toast5(View v) {

        Toast.makeText(MainActivity.this, "Go Ubiquitous Project",
                Toast.LENGTH_LONG).show();

    }
    public void toast6(View v) {

        Toast.makeText(MainActivity.this, "The Capstone Project",
                Toast.LENGTH_LONG).show();

    }

}
