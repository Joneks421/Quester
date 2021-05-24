package com.example.quester;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShowQuest extends AppCompatActivity {
    ListView listquest;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showquest);


        listquest = findViewById(R.id.ListQuests);
    }
}
