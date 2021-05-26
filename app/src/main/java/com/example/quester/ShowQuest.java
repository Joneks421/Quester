package com.example.quester;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import retrofit2.Call;

public class ShowQuest extends AppCompatActivity {
    ListView listquest;
    QuestAdapter adapter;
    ArrayList<TasksClass> tasks = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showquest);

        adapter = new QuestAdapter(this, tasks);
        listquest = findViewById(R.id.ListQuests);
        listquest.setAdapter(adapter);

        AsyncUserLoader asyncUserLoader = new AsyncUserLoader() {
            @Override
            public void postExecute(Answer answer) {
                adapter.addAll(answer.data);
                adapter.notifyDataSetChanged();
            }

            @Override
            public Call<Answer> getCall(UserService userService) {
                return userService.getTest();
            }
        };
        asyncUserLoader.execute("http://10.54.204.168");
    }
}
