package com.example.quester;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_create;
    Button button_do;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_create = findViewById(R.id.Button_create);
        button_do = findViewById(R.id.Button_do);

    }
}