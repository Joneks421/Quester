package com.example.quester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AnswerOptions extends AppCompatActivity {

    EditText optionText;

    String SOptionText;
    static Integer count;

    CheckBox rightAnswer;

    Button nextOption;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answeroptions);
        optionText = findViewById(R.id.OptionText);
        rightAnswer = findViewById(R.id.rightOption);
        nextOption = findViewById(R.id.nextOption);
        count = 0;


        nextOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SOptionText = String.valueOf(optionText.getText());
                if (count < getIntent().getIntExtra ("SQestionsAmount", 3)){
                    Intent intent = new Intent(AnswerOptions.this, Tasks.class);
                    startActivity(intent);
                }else {
                    Json.variest.add(SOptionText);
                    optionText.setText("");
                    count+= 1;
                    System.out.println(Json.variest);
                }



            }
        });
    }
}
