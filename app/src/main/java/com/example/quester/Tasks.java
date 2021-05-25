package com.example.quester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Tasks extends AppCompatActivity {
    Button addQuestion;
    Button next;
    ListView tasksList;
    static Integer numberQuest;

    public static Integer getNumberQuest() {
        return numberQuest;
    }

    public static void setNumberQuest(Integer numberQuest) {
        Tasks.numberQuest = numberQuest;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        next = findViewById(R.id.Tasks_net_button);
        addQuestion = findViewById(R.id.addQuestion);
        addQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tasks.this, AddTask.class);
                startActivity(intent);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tasks.this, Json.class);
                startActivity(intent);
            }
        });


    }
}
