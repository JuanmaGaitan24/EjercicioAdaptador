package com.example.ejercicioadaptador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner listaPaises;

    String[] pises = new String[]{"España", "Italia", "Alemania", "Estados Unidos", "Japon"};
    String[] capital = new String[]{"Madrid", "Roma", "Berlin", "Washington", "Tokio"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}