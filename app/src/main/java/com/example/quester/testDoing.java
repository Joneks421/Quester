package com.example.quester;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class testDoing extends AppCompatActivity {
    TextView taskTest;
    Button exit;
    Button next;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtask);
        taskTest = findViewById(R.id.QuestTextForDo);
        exit = findViewById(R.id.ExitButton);
        next = findViewById(R.id.NextButton);
    }
}
