package com.example.quester;


import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Json extends AppCompatActivity {

JSONObject text = new JSONObject();
    static ArrayList<String> variest = new ArrayList<String>();
    TextView textd;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_json);
        textd = findViewById(R.id.Textd);
        try {
            text.put("text", "sff");
            text.put("Variest", variest);
            text.put("answer", 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}