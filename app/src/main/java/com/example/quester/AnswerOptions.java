package com.example.quester;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AnswerOptions extends AppCompatActivity {

    EditText optionText;

    static String SOptionText;

    CheckBox rightAnswer;

    Button nextOption;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        optionText = findViewById(R.id.OptionText);
        rightAnswer = findViewById(R.id.rightOption);
        nextOption = findViewById(R.id.nextOption);

        SOptionText = String.valueOf(optionText.getText());

        nextOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
