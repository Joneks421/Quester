package com.example.quester;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;

import retrofit2.Call;

public class Json extends AppCompatActivity {

JSONObject text = new JSONObject();
    int count;
    Button accept;
    Button back;
    static ArrayList<ArrayList<String>> variest = new ArrayList<ArrayList<String>>();
    static ArrayList<ArrayList<String>> texts = new ArrayList<ArrayList<String>>();
    static ArrayList<ArrayList<Integer>> answer = new ArrayList<ArrayList<Integer>>();
    static ArrayList<ArrayList<Integer>> times = new ArrayList<ArrayList<Integer>>();
    static String taskText;
    TextView textd;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);

        count = 0;
        accept = findViewById(R.id.Accept);
        back = findViewById(R.id.Back);
        textd = findViewById(R.id.Textd);
        try {
            text.put("text", texts);
            text.put("Variest", variest);
            text.put("answer", answer);
            text.put("time", times);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AsyncUserLoader asyncUserLoader = new AsyncUserLoader() {
                    @Override
                    public void postExecute(Answer answer) {
                        Intent intent = new Intent(Json.this, MainActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public Call<Answer> getCall(UserService userService) {
                        return userService.insertJson(text.toString());
                    }
                };
                asyncUserLoader.execute("http://10.54.204.168");

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Json.this, CreateQuest.class);
                startActivity(intent);
            }
        });

    }





}